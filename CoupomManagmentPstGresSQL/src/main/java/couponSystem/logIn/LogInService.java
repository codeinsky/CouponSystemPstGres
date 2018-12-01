package couponSystem.logIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import couponSystem.beans.Company;
import couponSystem.beans.Customer;
import couponSystem.facade.AdminFacadeF;
import couponSystem.facade.ClientCouponFacade;
import couponSystem.facade.CompanyFacadeF;
import couponSystem.facade.CustomerFacadeF;
import couponSystem.repos.CompanyRepo;
import couponSystem.repos.CustomerRepo;

@Service
public class LogInService implements LogIn{
	
	@Autowired
	CompanyRepo companyRepo;
	
	@Autowired
	CustomerRepo customerRepo; 
	
	@Autowired 
	AdminFacadeF adminFacade;
	
	@Autowired 
	CompanyFacadeF companyFacade; 
	
	@Autowired
	CustomerFacadeF customerFacade;
	
	
	@Override
	public ClientCouponFacade logIn(String userType, String userName, String password) {
		ClientCouponFacade facade = null ; 
	
		switch (userType) {
		case "admin": {
			if (userName.equals("admin") && password.equals("1234")) {
				System.out.println("Welcome Admin");
				facade = adminFacade;
			}
			else {
				System.out.println("wrong user name or password , please try again");
			}
			break ; 
		}
		
		
		case "company": {
			Company company = null; 
			if (companyRepo.existsByCompName(userName)) {
				company = companyRepo.findCompanyByCompName(userName);
				System.out.println("Your password is :  " + company.getPassword());
				if (password.equals(company.getPassword())) {
					System.out.println(" Company with " +userName+ " is logged in" );
					companyFacade.setCompanyIdLogged(company.getId());
					facade = companyFacade;
				}
				else {
					System.out.println("Wrong password entered , please try again");
				}
				
			}
			else {
				System.out.println("Company with "  + userName+ " does not exist");
			}
			
			break ; 
		}
		case "customer": {
			Customer customer = null; 
			customer = customerRepo.findCustomerByCustName(userName);
			if (customerRepo.existsByCustName(userName)) {
				if (password.equals(customer.getPassword())) {
					System.out.println(" Customer with " +userName+ " is logged in" );
					customerFacade.setCustomerLogged(customer.getId());
					facade = customerFacade;
				}
				else {
					System.out.println("Wrong password entered , please try again");
				}
			}
			else {
				System.out.println("Cstomer with name: " + userName + "does not exist");
			}
			break ; 
	}

}
		return 	facade;
}
}