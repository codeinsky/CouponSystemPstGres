package couponSystem.logIn;

import couponSystem.facade.ClientCouponFacade;

public interface LogIn {
	public ClientCouponFacade logIn(String userType, String userName, String password);

}
