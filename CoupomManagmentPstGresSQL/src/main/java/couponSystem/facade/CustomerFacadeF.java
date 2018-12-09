package couponSystem.facade;
import java.sql.Date;
import java.util.Collection;
import java.util.HashSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import couponSystem.beans.Coupon;
import couponSystem.beans.CouponType;
import couponSystem.beans.Customer;
import couponSystem.exception.CouponSystemException;
import couponSystem.repos.CompanyRepo;
import couponSystem.repos.CouponsRepo;
import couponSystem.repos.CustomerRepo;



// TODO: Auto-generated Javadoc
/**
 * The Class CustomerFacadeF.
 */
@Service
public class CustomerFacadeF extends ClientCouponFacade{
	
	/** The customer logged. */
	int customerLogged;

	public long getCustomerLogged() {
		return customerLogged;
	}

	public void setCustomerLogged(int customerLogged) {
		this.customerLogged = customerLogged;
	}

	/**
	 * Instantiates a new customer facade F.
	 *
	 * @param customerLogged the customer logged
	 */
	// has a constructor for ID reference for customer activities
	public CustomerFacadeF(int customerLogged) {
		this.customerLogged = customerLogged;
	}
	
	public CustomerFacadeF() {
		
	}
	
	@Autowired
	CouponsRepo couponRepo; 

	@Autowired 
	CompanyRepo companyRepo;
	
	@Autowired 
	CustomerRepo customerRepo;
	
	public Customer getMyCustomer() {
		Customer myCustomer = null;
		myCustomer = customerRepo.findById(customerLogged).get();
		return myCustomer ;
	}
	
	/**
	 * Purchase coupon.
	 * Before coupons been purchased Method checks 3 terms : 
	 * 		1. Checks if coupons been already purchased by the Customer;
	 * 		2. Checks if Coupon amount is more the 1; 
	 * 		3. Checks if coupons that customer wants to buy is not expired 
	 *  IF all terms are good: 
	 *  	1.performs BUY 
	 *  	@see dao.HelperMethods#buyCoupon(String, String);
	 *  	2. Decrees coupons amount in data base 
	 * @param coupon the coupon
	 * @throws CouponSystemException 
	 */

	public void purchaseCoupon(int id) throws CouponSystemException {
		Coupon checkedCoupon = null;
		boolean dateFlag ;
		boolean amountFlag ;
		boolean alreadyPurchasedFlag ;
		Customer mySelf = getMyCustomer();
		System.out.println(id);
		if (couponRepo.existsById(id)) {
		// check if coupon was already purchased by the Customer
			checkedCoupon = couponRepo.findById(id).get();
			alreadyPurchasedFlag = !mySelf.ifCouponsPurchased(id);
			
			if (!alreadyPurchasedFlag == true ) {
				System.out.println("Already purchased flag is : " + alreadyPurchasedFlag);
				throw new CouponSystemException("You already have this coupon") ; 
				
			}
			
			
		// check if coupon amount more then > 1 and
			amountFlag = !checkedCoupon.ifSoldOut();
			if (!amountFlag == true ) {
				System.out.println("Coupon is soldout");
				throw new CouponSystemException("Coupon is soldout") ; 
				
			}
			
			
			
			
		// check if not expired
			dateFlag = !checkedCoupon.ifExpired();
			System.out.println("Expiration flag is " + dateFlag);
			if (!dateFlag == true ) {
				System.out.println("Coupon is expired ");
				throw new CouponSystemException("Coupon is expired") ; 
				
			}
		// action - decrees amount and upDate Customer Coupon
			
			
		if (dateFlag && amountFlag && alreadyPurchasedFlag) {
			int amount = checkedCoupon.getAmount();
			checkedCoupon.setAmount(amount - 1);
			couponRepo.save(checkedCoupon);
			mySelf.buyCoupon(checkedCoupon);
			System.out.println("I am : " + mySelf.toString());
			customerRepo.save(mySelf);
			System.out.println("Coupon with ID : " + id + " purchased  , enjoy it");

		}
		}
		else {
			
			System.out.println("Coupons with that ID :" + id + " doesn't exist");
			throw new CouponSystemException("Coupons with that ID :" + id + " doesn't exist");
		}
	}
	
	/**
	 * Gets the all my coupons.
	 * Returns all copuns that were purchased by Logged Customer 
	 * @return the all my coupons
	 */

	public Collection<Coupon> getAllMyCoupons() {
		Collection<Coupon> coupList = null ;
		Customer mySelf = getMyCustomer();
		coupList = mySelf.getCoupons();
		return coupList;
	}

	
	
	
	/**
	 * Gets the my coupons sorted by type.
	 *  getting coupons Collection filtered :
	 * to get coupons by PRICE pass select = " customerCouponsByPrice"
	 * to get coupons by DATE pass select = " customerCouponsByDate"
	 * to get coupons by TYPE pass select = " customerCouponsByType"
	 * reference pass :
	
	 * PRICE example till price reference = "300"
	 * DATE example till date reference = "MM-DD-YYYY"
	 * TYPE example till type reference = " Restrains,
	 * Electricity,
	 * Food,
	 * Health,
	 * Sports,
	 * Camping,
	 * Traveling"
	 * 
	 *
	 * @param select the select
	 * @param reference the reference
	 * @return the my coupons sorted by type
	 */
	public Collection<Coupon> getMyCouponsSortedByType(String select, String reference) {
		Collection<Coupon> coupons = null ; 
		Collection<Coupon> couponsSelected = new HashSet<Coupon>();
		Customer  mySelf = getMyCustomer(); 
		coupons = mySelf.getCoupons();
		switch (select)  {
		case "TYPE" :  
		
		for (Coupon coupon : coupons) {
			if (coupon.getType().equals(CouponType.valueOf(reference))) {
				couponsSelected.add(coupon);
			}
		}
		break ;
		
		case "PRICE" :
			for (Coupon coupon : coupons) {
				if (coupon.getPrice()< Long.valueOf(reference)) {
					couponsSelected.add(coupon);
				}
			}
		break ;
		
		case "DATE"  : 
				for (Coupon coupon : coupons) {
				if (coupon.getEndDate().before(Date.valueOf(reference))) {
					couponsSelected.add(coupon);
				}
			}
				break ; 
		}
		return couponsSelected; 
	
		
	}
	
	public Iterable<Coupon> getAllCouponsToBuy(){
		Iterable<Coupon> coupons = null; 
		coupons = couponRepo.findAll();
		return coupons ; 
	}

}
