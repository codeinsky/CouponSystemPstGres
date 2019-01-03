package couponSystem.rest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import couponSystem.exception.CouponSystemException;
import couponSystem.facade.ClientCouponFacade;

// TODO: Auto-generated Javadoc
/**
 * The Class ServiceFilter.
 */
public class ServiceFilter {
	
	/**
	 * Service filter.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws CouponSystemException the coupon system exception
	 */
	public static void  serviceFilter(HttpServletRequest request , HttpServletResponse response ) throws CouponSystemException {
		ClientCouponFacade facade = (ClientCouponFacade) request.getSession().getAttribute("facade");
		if (facade == null) {
			System.out.println("Not authorized user");
			throw new CouponSystemException("Not authorized user");
		}
		else {
			System.out.println("User check ok");
		}
	}

}
