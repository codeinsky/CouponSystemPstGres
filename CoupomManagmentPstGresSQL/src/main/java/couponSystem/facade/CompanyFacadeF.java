package couponSystem.facade;
import java.sql.Date;
import java.util.Collection;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import couponSystem.beans.Company;
import couponSystem.beans.Coupon;
import couponSystem.beans.CouponType;
import couponSystem.exception.CouponSystemException;
import couponSystem.repos.CompanyRepo;
import couponSystem.repos.CouponsRepo;


// TODO: Auto-generated Javadoc
/**@
 * The Class CompanyFacadeF.
 */
@Service
public class CompanyFacadeF extends ClientCouponFacade {
	
	/** The company id logged. */
	private int companyIdLogged; // ID of the company that is logged in the system


	public int getCompanyIdLogged() {
		return companyIdLogged;
	}




	public void setCompanyIdLogged(int companyIdLogged) {
		this.companyIdLogged = companyIdLogged;
	}




	/**
	 * Instantiates a new company facade F.
	 *
	 * @param companyIdLogged the company id logged
	 */
	// constructor , gets ID number of company reference
	public CompanyFacadeF(int companyIdLogged) {
		this.companyIdLogged = companyIdLogged;
	}
	
	
	
	
	public CompanyFacadeF() {
	}
			
	@Autowired 
	CouponsRepo couponRepo; 
	
	@Autowired 
	CompanyRepo companyRepo;

	public Company getMyCompany() {
		Company myCompany = null;
		myCompany = companyRepo.findById(this.getCompanyIdLogged()).get();
		return myCompany;
	}	
	
	
	public void deleteCoupons() {
		couponRepo.deleteAll();
	}
	/**
	 * Creates the coupon.
	 * Methods receives coupon. Checks if Coupons already exist by Title, if yes denies creating 
	 * the coupon. If no creates new Coupon row  in Data Base Coupon table. 
	 * @param coupon the coupon
	 */
	
	// Need final check 
	public Coupon createCoupon(Coupon coupon) {
		Coupon createdCoupon = null; 
			if (couponRepo.existsByTitle(coupon.getTitle())) {
				System.out.println("Coupon with " + coupon.getTitle() + " already exists");
			} 
			else {  
				System.out.println("Test from create company" + coupon.toString());
				Company myComp  = getMyCompany();
				myComp.getCoupons().add(coupon);
				System.out.println("My company is :" + myComp.toString());
				companyRepo.save(myComp);
				createdCoupon = coupon;
				System.out.println("Coupon created");
			}
		
			return createdCoupon;
	}

	/**
	 * Removes the coupon.
	 * Before removing (Deleting) method check if that coupon belongs
	 * to the company, if yes deletes the Coupon from all tables.
	 * @param coupon the coupon
	 */

	public int removeCoupon(int id) {
		Company myCompany = getMyCompany();
		if (myCompany.checkCoupon(id)) {
			myCompany.removeCoupon(id);
			couponRepo.deleteById(id);
			//companyRepo.save(myCompany);
			System.out.println("Coupon was removed");
			// System.out.println("My coupons after delete : " + myCompany.getCoupons());
		}
		
		else {
			System.out.println("Coupon does not belong to your company");
		}
		return id;
	}

	/**
	 * UpDate coupon.
	 * Retrieves all coupons ID belong to the logged company. 
	 * Checks if the coupon ID contain in the Collection. 
	 * @see dao.HelperMethods#ifExist(String, String, String)
	 * If yes Updates all attributes. 
	 * @param coupon the coupon
	 */
	
	public Coupon updateCoupon(Coupon coupon) {
		Coupon updatedCoupon = null; 
		Company myCompany = getMyCompany();
		if (myCompany.checkCoupon(coupon.getId())) {
			updatedCoupon = couponRepo.save(coupon);
			System.out.println("Coupon updated");
		}
		else {
			System.out.println("Coupon does not belong to your Comapny, can' be updated");
		}
		return updatedCoupon;
	}

	/**
	 * Gets the coupon by id.
	 * First checks if coupon belongs to the logged and if yes 
	 * returns Company bean by ID.  
	 * @param id the id
	 * @return the coupon by id
	 * @throws CouponSystemException 
	 * 
	 */

	public Coupon getCouponById(int id) throws CouponSystemException {
		Company myCompany = getMyCompany();
		Coupon coupon = null ;
		if (myCompany.checkCoupon(id)) {
			coupon = couponRepo.findById(id).get();
		}
		else {
			System.out.println("Coupon with Id :" +id + " doesn't belong to your company");
			throw new CouponSystemException ("Coupon with Id :" +id + " doesn't belong to your company"); 
		}
		return coupon ; 

	}

	/**
	 * Gets the all coupons.
	 * Returns all coupons list belong to the Company.
	 * @return the all coupons
	 */

	public Collection<Coupon> getAllCoupons() {
		Collection<Coupon> coupons ; 
		Company MyCompany = getMyCompany();
		coupons = MyCompany.getCoupons();
		return coupons; 
	}

	// Get list of coupons sorted by : TYPE or PRICE LESS THEN or DATE BEFORE
	/**
	 * Sort coupon by.
	 * Returns collection filter by (TYPE , DATE , PRICE).
	 * @see dao.HelperMethods#getCouponSelected(long, String, String) 
	 * @param select the select
	 * @param refernece the reference
	 * @return the collection
	 * @throws CouponSystemException 
	 */
	// 'yyyy-mm-dd'
	
	// need to be done 
	public Collection<Coupon> sortCouponBy(String select, String refernece) throws CouponSystemException {
		Collection<Coupon> coupons = null ; 
		Collection<Coupon> couponsSelected = new HashSet<Coupon>();
		Company company = getMyCompany(); 
		coupons = company.getCoupons();
		switch (select)  {
		case "TYPE" :  
		
		for (Coupon coupon : coupons) {
			if (coupon.getType().equals(CouponType.valueOf(refernece))) {
				couponsSelected.add(coupon);
			}
		}
		if (couponsSelected.isEmpty()) {
			throw new CouponSystemException ("Your Company does not have coupons of TYPE: " + refernece);
		}
		break ;
		
		case "PRICE" :
			for (Coupon coupon : coupons) {
				if (coupon.getPrice()< Long.valueOf(refernece)) {
					couponsSelected.add(coupon);
				}
			}
		break ; 	
		case "DATE"  : 
				for (Coupon coupon : coupons) {
				if (coupon.getEndDate().before(Date.valueOf(refernece))) {
					couponsSelected.add(coupon);
				}
			}
				break ; 
		}
		return couponsSelected; 
	}

}
