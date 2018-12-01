package couponSystem.rest;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import couponSystem.beans.Coupon;
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
	
	
//	@Autowired 
//	public CompanyFacadeF company;
	

	/**
	 * Creates the coupon.
	 *
	 * @param coupon the coupon
	 */
	@RequestMapping (value="/company/createCoupon" , method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createCoupon(@RequestBody Coupon coupon , HttpServletRequest request) {
		CompanyFacadeF myFacade = (CompanyFacadeF) request.getSession().getAttribute("facade");
		myFacade.createCoupon(coupon);
	}
	
	/**
	 * Delete coupon.
	 *
	 * @param coupon the coupon
	 */
	@RequestMapping (value="/company/removeCoupon/{id}" , method = RequestMethod.DELETE)
	public void deleteCoupon (@PathVariable ("id") int id , HttpServletRequest request) {
		CompanyFacadeF myFacade = (CompanyFacadeF) request.getSession().getAttribute("facade");
		myFacade.removeCoupon(id);
	}
	
	/**
	 * Update coupon.
	 *
	 * @param coupon the coupon
	 */
	@RequestMapping (value = "/company/updateCoupon" , method = RequestMethod.PUT , consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateCoupon(@RequestBody Coupon coupon , HttpServletRequest request) {
		CompanyFacadeF myFacade = (CompanyFacadeF) request.getSession().getAttribute("facade");
		myFacade.updateCoupon(coupon);
	}
	
	/**
	 * Gets the coupon by ID.
	 *
	 * @param id the id
	 * @return the coupon by ID
	 */
	@RequestMapping (value = "/company/getCouponById/{id}" , method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
	public Coupon getCouponByID (@PathVariable ("id") int id , HttpServletRequest request) {
		CompanyFacadeF myFacade = (CompanyFacadeF) request.getSession().getAttribute("facade");
		return myFacade.getCouponById(id);
	}
	
	/**
	 * Gets the all coupons.
	 *
	 * @return the all coupons
	 */
	@RequestMapping (value="/company/getAllCoupons" , method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Coupon> getAllCoupons(HttpServletRequest request){
	//	company.setCompanyIdLogged(4);
		CompanyFacadeF myFacade = (CompanyFacadeF) request.getSession().getAttribute("facade");
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
	public Collection<Coupon> getFiltertedCoupons(@PathVariable ("filter" ) String filter  , 
			@PathVariable ("reference" ) String reference , HttpServletRequest request) {
		CompanyFacadeF myFacade = (CompanyFacadeF) request.getSession().getAttribute("facade");
		return myFacade.sortCouponBy(filter, reference);
	}
	
	
}
