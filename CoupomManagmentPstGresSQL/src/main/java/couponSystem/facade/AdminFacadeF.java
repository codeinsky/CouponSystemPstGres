package couponSystem.facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import couponSystem.beans.Company;
import couponSystem.beans.Customer;
import couponSystem.repos.CompanyRepo;
import couponSystem.repos.CouponsRepo;
import couponSystem.repos.CustomerRepo;




// TODO: Auto-generated Javadoc
/**
 * The Class AdminFacadeF.
 * Includes all Admins business logic methods 
 */
@Service
public class AdminFacadeF extends ClientCouponFacade{
	
	@Autowired 
	CompanyRepo companyRepo; 
	
	@Autowired 
	CouponsRepo couponsRepo; 
	
	@Autowired 
	CustomerRepo customerRepo; 
	
	
	/**
	 * Creates the company.
	 * Method receives Company bean. Checks if already exist company with 
	 * same name, If not performs createCopmany method. 
	 * @param company the company
	 */

	public void createCompany(Company company) {
	
		if (companyRepo.existsByCompName(company.getCompName())) {
			System.out.println("Company with name " + company.getCompName() + " already exists" );
		}
		else {
		companyRepo.save(company);
			System.out.println("Company Created");
		}
		

	}

	
	/**
	 * Removes the company.
	 * Method receives company bean.
	 * Gets all coupons belongs to the company.
	 * Uses helper method helperDAO.removeWhere 
	 * by Coupon Id removes all coupons from tables(Coupon,Customer_Coupon, Copmany_Coupon)
	 * removes the company from Company table as well
	 * @param company the company
	 */
	
	public void removeCompany(Company company) {
		companyRepo.delete(company);
		System.out.println("Company removed");
	}

	/**
	 * Company details update.
	 * Receives Company bean,  the company from DataBase by Id.
	 * Checks if User tries to update name (different name):
	 * 		-if yes, denies the action 
	 * 		-if no updates(overwrites all attributes)  
	 * @param company the company
	 */
	
	public void companyDetailsUpdate(Company company) {
		// COMPANY NAME CAN NOT BE CHANGED
		Company comp= companyRepo.findById(company.getId()).get();
		if(comp.getCompName().equals(company.getCompName())) {
			companyRepo.save(company);
		}
		else {
			System.out.println("Company name can not be changed");
		}
	}

	/**
	 * Gets the all companies.
	 * 
	 * @return the all companies existing in Data Base
	 */
	
	public Iterable<Company> getAllCompanies() {
		Iterable<Company> companies = null;
		companies = companyRepo.findAll();
		return companies;
	}

	/**
	 * Gets the company by ID 
	 *
	 * @param id the id
	 * @return the company
	 */

	public Company getCompany(int id) {
		Company company = null; 
		company = companyRepo.findById(id).get();
		return company;
	}

	/**
	 * Adds the customer.
	 * Receives Customer bean. Methods checks if Customer with that name 
	 * all ready exists and if yes denies the action. 
	 * If no Customer with the name creates new Id for the new customer 
	 * and adds it to the Data Base in Customer table new row. 
	 * @param customer the customer
	 */
	public void addCustomer(Customer customer) {
		// need check if there is already customer with same name
		
			if (customerRepo.existsByCustName(customer.getCustName())) {
				System.out.println("Customer with that name already exists");
			} else {
				
				customerRepo.save(customer); // creating new customer
				System.out.println("Customer created");
			}
		

	}

	/**
	 * Removes the customer.
	 * Removes Customers Coupon from data base table Customer_Coupon. 
	 * Removes the customer from Customer table as well.
	 * @param customer the customer
	 */

	public void removeCustomer(Customer customer) {
		customerRepo.delete(customer);
		System.out.println("Customer with name : " +customer.getCustName() +" Removed");
		// need to remove all other tables 
	}

	/**
	 * Update customer details.
	 * Retries Customer from Data Base by ID. 
	 * Checks if Admin tries to update Copamany name , denies the action.
	 * If Customer Name is the same updates all attributes.   
	 * @param customer the customer
	 */
	
	public void updateCustomerDetails(Customer customer) {
		Customer cust = null; 
		cust = customerRepo.findById(customer.getId()).get();
		if(cust.getCustName().equals(customer.getCustName())) {
			customerRepo.save(customer);
			System.out.println("Customer Updated");
		}
		else {
			System.out.println("Customer name can not be chnaged");
		}
	}

	/**
	 * Gets the customer list.
	 *
	 * @return the customer list
	 */

	public Iterable<Customer> getCustomerList() {
		Iterable<Customer> customerList = null;
		customerList = customerRepo.findAll();
		return customerList;
	}

	/**
	 * Gets the customer by ID. 
	 *
	 * @param id the id
	 * @return the customer
	 */
	
	public Customer getCustomer(int id) {
		Customer customer = null;
		customer = customerRepo.findById(id).get();
		return customer;
	}
}
