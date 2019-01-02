package couponSystem.rest;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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



//doen
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
	public @ResponseBody ResponseEntity createCoupon(@RequestBody Coupon coupon , HttpServletRequest request , HttpServletResponse response) {
		//CompanyFacadeF myFacade = (CompanyFacadeF) request.getSession().getAttribute("facade");
		try {
			ServiceFilter.serviceFilter(request, response);
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}
		myFacade.setCompanyIdLogged(3);
		Coupon createdCoupon = myFacade.createCoupon(coupon);
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(createdCoupon);
		
	}
	
	/**
	 * Delete coupon.
	 *
	 * @param coupon the coupon
	 */
	@RequestMapping (value="/company/removeCoupon/{id}" , method = RequestMethod.DELETE)
	public  @ResponseBody ResponseEntity deleteCoupon (@PathVariable ("id") int id , HttpServletRequest request , HttpServletResponse response) {
		//CompanyFacadeF myFacade = (CompanyFacadeF) request.getSession().getAttribute("facade");
		try {
			ServiceFilter.serviceFilter(request, response);
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}
		myFacade.setCompanyIdLogged(3);
		int removedId = myFacade.removeCoupon(id);
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(removedId);
		
	}
	
	/**
	 * Update coupon.
	 *
	 * @param coupon the coupon
	 */
	@RequestMapping (value = "/company/updateCoupon" , method = RequestMethod.PUT , consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity updateCoupon(@RequestBody Coupon coupon , HttpServletRequest request , HttpServletResponse response ) {
		//CompanyFacadeF myFacade = (CompanyFacadeF) request.getSession().getAttribute("facade");
		try {
			ServiceFilter.serviceFilter(request, response);
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}
		myFacade.setCompanyIdLogged(3);
		Coupon updatedCoupon = myFacade.updateCoupon(coupon);
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(updatedCoupon);
	
	}
	
	/**
	 * Gets the coupon by ID.
	 *
	 * @param id the id
	 * @return the coupon by ID
	 */
	@RequestMapping (value = "/company/getCouponById/{id}" , method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity getCouponByID (@PathVariable ("id") int id , HttpServletRequest request  , HttpServletResponse response) {
		//CompanyFacadeF myFacade = (CompanyFacadeF) request.getSession().getAttribute("facade");
		myFacade.setCompanyIdLogged(3);
		try {
			ServiceFilter.serviceFilter(request, response);
		} catch (CouponSystemException e1) {
			return ResponseEntity.status(HttpStatus.CONFLICT).contentType(MediaType.APPLICATION_JSON).body(e1.getMessage());
		}
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
	public @ResponseBody ResponseEntity getAllCoupons(HttpServletRequest request , HttpServletResponse response){
		 myFacade.setCompanyIdLogged(3);
		 //CompanyFacadeF myFacade = (CompanyFacadeF) request.getSession().getAttribute("facade");
		 try {
			ServiceFilter.serviceFilter(request, response);
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}
		 return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(myFacade.getAllCoupons());
	
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
			@PathVariable ("reference" ) String reference , HttpServletRequest request , HttpServletResponse response) {
		myFacade.setCompanyIdLogged(3);
		try {
			ServiceFilter.serviceFilter(request, response);
		} catch (CouponSystemException e1) {
			return ResponseEntity.status(HttpStatus.CONFLICT).contentType(MediaType.APPLICATION_JSON).body(e1.getMessage());
		}
		//CompanyFacadeF myFacade = (CompanyFacadeF) request.getSession().getAttribute("facade");
		try {
			Collection<Coupon> coupons =  myFacade.sortCouponBy(filter, reference);
			return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(coupons);
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}
	}
	
	
}
