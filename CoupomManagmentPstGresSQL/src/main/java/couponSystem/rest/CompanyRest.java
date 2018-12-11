package couponSystem.rest;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import couponSystem.beans.Coupon;
import couponSystem.exception.CouponSystemException;
import couponSystem.facade.CompanyFacadeF;




// TODO: Auto-generated Javadoc
/**
 * The Class CompanyRest.
 * COMPANY FACADE METHODS Rest: 
 * 1. Create Coupon - POST 
 * 2. Remove Coupon - DELETE
 * 3. Update Coupon - PUT 
 * 4. getCouponByID - GET{long id}
 * 5. GetAll Coupons - GET 
 * 6. Sort Coupons  - GET{String filter} 
 * 
 * 
 */
@CrossOrigin("*")
@RestController
public class CompanyRest {
	
	/** The company. */
	// need to pass ID from logIn to company 
	// CompanyFacadeF company = new CompanyFacadeF(8); 
	
	
	@Autowired 
	public CompanyFacadeF myFacade;
	

	/**
	 * Creates the coupon.
	 *
	 * @param coupon the coupon
	 */
	@RequestMapping (value="/company/createCoupon" , method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
	public Coupon createCoupon(@RequestBody Coupon coupon , HttpServletRequest request) {
		//CompanyFacadeF myFacade = (CompanyFacadeF) request.getSession().getAttribute("facade");
		myFacade.setCompanyIdLogged(2);
		Coupon createdCoupon = myFacade.createCoupon(coupon);
		return createdCoupon; 
	}
	
	/**
	 * Delete coupon.
	 *
	 * @param coupon the coupon
	 */
	@RequestMapping (value="/company/removeCoupon/{id}" , method = RequestMethod.DELETE)
	public int deleteCoupon (@PathVariable ("id") int id , HttpServletRequest request) {
		//CompanyFacadeF myFacade = (CompanyFacadeF) request.getSession().getAttribute("facade");
		myFacade.setCompanyIdLogged(2);
		int removedId = myFacade.removeCoupon(id);
		return removedId; 
	}
	
	/**
	 * Update coupon.
	 *
	 * @param coupon the coupon
	 */
	@RequestMapping (value = "/company/updateCoupon" , method = RequestMethod.PUT , consumes = MediaType.APPLICATION_JSON_VALUE)
	public Coupon updateCoupon(@RequestBody Coupon coupon , HttpServletRequest request) {
		//CompanyFacadeF myFacade = (CompanyFacadeF) request.getSession().getAttribute("facade");
		myFacade.setCompanyIdLogged(2);
		Coupon updatedCoupon = myFacade.updateCoupon(coupon);
		return updatedCoupon;
	}
	
	/**
	 * Gets the coupon by ID.
	 *
	 * @param id the id
	 * @return the coupon by ID
	 */
	@RequestMapping (value = "/company/getCouponById/{id}" , method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity getCouponByID (@PathVariable ("id") int id , HttpServletRequest request) {
		//CompanyFacadeF myFacade = (CompanyFacadeF) request.getSession().getAttribute("facade");
		myFacade.setCompanyIdLogged(2);
		try {
			Coupon coupon =  myFacade.getCouponById(id);
			return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(coupon);
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}
	}
	
	/**
	 * Gets the all coupons.
	 *
	 * @return the all coupons
	 */
	@RequestMapping (value="/company/getAllCoupons" , method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Coupon> getAllCoupons(HttpServletRequest request){
		myFacade.setCompanyIdLogged(2);
		//CompanyFacadeF myFacade = (CompanyFacadeF) request.getSession().getAttribute("facade");
		return myFacade.getAllCoupons();
	}
	
	/**
	 * Gets the filtered coupons.
	 *
	 * @param filter the filter
	 * @param refernce the reference
	 * @return the filtered coupons
	 */
	@RequestMapping (value="/company/sortCouponBy/{filter}/{reference}" , method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity getFiltertedCoupons(@PathVariable ("filter" ) String filter  , 
			@PathVariable ("reference" ) String reference , HttpServletRequest request) {
		myFacade.setCompanyIdLogged(2);
		//CompanyFacadeF myFacade = (CompanyFacadeF) request.getSession().getAttribute("facade");
		try {
			Collection<Coupon> coupons =  myFacade.sortCouponBy(filter, reference);
			return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(coupons);
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}
	}
	
	
}
