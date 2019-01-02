package couponSystem.rest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import couponSystem.exception.CouponSystemException;
import couponSystem.facade.ClientCouponFacade;

public class ServiceFilter {
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
