package couponSystem.facade;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import couponSystem.beans.Company;
import couponSystem.beans.Customer;
import couponSystem.exception.CouponSystemException;
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
	 * @throws CouponSystemException 
	 */

	public Company createCompany(Company company) throws CouponSystemException {
		Company createdCompany = null;
		if (companyRepo.existsByCompName(company.getCompName())) {
			System.out.println("Company with name " + company.getCompName() + " already exists" );
			throw new CouponSystemException("Company with name " + company.getCompName() + " already exists");
		}
		else {
		createdCompany = companyRepo.save(company);
			System.out.println("Company Created");
		}
		return createdCompany ; 

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
	
	public void  removeCompany(Company company) {
		if (companyRepo.existsById(company.getId())) {
			companyRepo.delete(company);
			System.out.println("Company removed");
		}
		else {
			System.out.println("Company does not exist");
		}
		
	}

	/**
	 * Company details update.
	 * Receives Company bean,  the company from DataBase by Id.
	 * Checks if User tries to update name (different name):
	 * 		-if yes, denies the action 
	 * 		-if no updates(overwrites all attributes)  
	 * @param company the company
	 */
	
	public Company companyDetailsUpdate(Company company) {
		// COMPANY NAME CAN NOT BE CHANGED
		Company updatedCompany = null; 
		Company comp= companyRepo.findById(company.getId()).get();
		if(comp.getCompName().equals(company.getCompName())) {
			companyRepo.save(company);
			updatedCompany = company; 
		}
		else {
			System.out.println("Company name can not be changed");
		}
		return updatedCompany;
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
	 * @throws CouponSystemException 
	 */

	public Company getCompany(int id) throws CouponSystemException {
		Company company = null; 
		if (companyRepo.existsById(id)) {
		company = companyRepo.findById(id).get();

		}
		else {
			System.out.println("Company with ID: " + id + " does not exist");
			throw new CouponSystemException("Company with ID: " + id + " does not exist");
			// place for exception 
		}
		return company;
	}

	/**
	 * Adds the customer.
	 * Receives Customer bean. Methods checks if Customer with that name 
	 * all ready exists and if yes denies the action. 
	 * If no Customer with the name creates new Id for the new customer 
	 * and adds it to the Data Base in Customer table new row. 
	 * @param customer the customer
	 * @throws CouponSystemException 
	 */
	public Customer addCustomer(Customer customer) throws CouponSystemException {
		Customer newCustomer = null; 
		// need check if there is already customer with same name
		
			if (customerRepo.existsByCustName(customer.getCustName())) {
				System.out.println("Customer with that name already exists");
				throw new CouponSystemException("Customer with that name already exists");
			} else {
				
				newCustomer = customerRepo.save(customer); // creating new customer
				
				System.out.println("Customer created");
			}
		return newCustomer;

	}

	/**
	 * Removes the customer.
	 * Removes Customers Coupon from data base table Customer_Coupon. 
	 * Removes the customer from Customer table as well.
	 * @param customer the customer
	 */

	public Customer removeCustomer(Customer customer) {
		Customer removedCustomer = null;
		customerRepo.delete(customer);
		removedCustomer = customer;
		System.out.println("Customer with name : " +customer.getCustName() +" Removed");
		return removedCustomer;
		// need to remove all other tables
		
	}

	/**
	 * Update customer details.
	 * Retries Customer from Data Base by ID. 
	 * Checks if Admin tries to update Copamany name , denies the action.
	 * If Customer Name is the same updates all attributes.   
	 * @param customer the customer
	 */
	
	public Customer updateCustomerDetails(Customer customer) {
		Customer updatedCustomer = null;
		Customer cust = null; 
		cust = customerRepo.findById(customer.getId()).get();
		if(cust.getCustName().equals(customer.getCustName())) {
			customerRepo.save(customer);
			updatedCustomer = customer;
			System.out.println("Customer Updated");
		}
		else {
			System.out.println("Customer name can not be chnaged");
		}
		return updatedCustomer;
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
	 * @throws CouponSystemException 
	 */
	
	public Customer getCustomer(int id) throws CouponSystemException {
		Customer customer = null;
		if (customerRepo.existsById(id)) {
		customer = customerRepo.findById(id).get();
		}
		else {
			System.out.println("Customer with ID: " + id + " does not exist");
			throw new CouponSystemException ("Customer with ID: " + id + " does not exist"); 
		}
		return customer;
	}
}
