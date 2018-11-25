package couponSystem.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import couponSystem.beans.Coupon;
import couponSystem.facade.CustomerFacadeF;



// TODO: Auto-generated Javadoc
/**
 * The Class CustomerRest.
 */
@CrossOrigin("*")
@RestController 
public class CustomerRest {
	
	/** The customer. */
//	CustomerFacadeF customer = new CustomerFacadeF(5);
	
	
	@Autowired
	CustomerFacadeF customer;
	/**
	 * Purchase coupon.
	 *
	 * @param coupon the coupon
	 */
	@RequestMapping(value="/customer/purchaseCoupon/{id}" , method= RequestMethod.POST) 
	public void purchaseCoupon(@PathVariable ("id") int id) {
		customer.setCustomerLogged(5);
		customer.purchaseCoupon(id);
	}
	
	/**
	 * Gets the my coupons.
	 *
	 * @return the my coupons
	 */
	@RequestMapping(value="/customer/getAllMyCoupons" , method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Coupon> getMyCoupons(){
		customer.setCustomerLogged(5);
		return customer.getAllMyCoupons();
	}
	
	/**
	 * Gets the coupons filtered.
	 *
	 * @param filter the filter
	 * @param refernce the reference
	 * @return the coupons filtered
	 */
	@RequestMapping(value="/customer/getMyCouponsSortedByType/{filter}/{reference}" , method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Coupon> getCouponsFiltered(@PathVariable ("filter") String filter,@PathVariable  ("reference") String reference) {
		customer.setCustomerLogged(5);
		return customer.getMyCouponsSortedByType(filter , reference);
	}

}
