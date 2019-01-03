package couponSystem.logIn;

import couponSystem.facade.ClientCouponFacade;

// TODO: Auto-generated Javadoc
/**
 * The Interface LogIn.
 */
public interface LogIn {
	
	/**
	 * Log in.
	 *
	 * @param userType the user type
	 * @param userName the user name
	 * @param password the password
	 * @return the client coupon facade
	 */
	public ClientCouponFacade logIn(String userType, String userName, String password);

}
