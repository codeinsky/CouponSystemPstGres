package couponSystem.rest;
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
import couponSystem.beans.Company;
import couponSystem.beans.Coupon;
import couponSystem.beans.Customer;
import couponSystem.exception.CouponSystemException;
import couponSystem.facade.AdminFacadeF;


// TODO: Auto-generated Javadoc
/**
 * The Class AdminRest.
 * ADMIN FACADE METHODS : 
 * 
 * 1. createCompany(Company)
 * 2. removeCompany(Company)
 * 3. companyDetailsUpdate(Company)
 * 4. getAllCompanies()
 * 5. getCompany(long)
 * 6. addCustomer(Customer)
 * 7. removeCustomer(Customer)
 * 8. updateCustomerDetails(Customer)
 * 9. getCustomerList()
 * 10.getCustomer(long)
 * 
 */

// example for JSON company : {"id":8,"compName":"Amdocs","password":"3333","email":"amdocs@amdocs.com"}
@CrossOrigin("*")
@RestController 
public class AdminRest {
	
	/** The admin. */
	
	@Autowired 
	AdminFacadeF admin; 
	
//	AdminFacadeF admin = new AdminFacadeF();
	
	//Company REST 
	
	/**
	 * Creates the company.
	 *
	 * @param company the company
	 */
	@RequestMapping (value="/admin/createCompany" , method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity createCompany(@RequestBody Company company , HttpServletRequest request , HttpServletResponse response) {
		try {
			ServiceFilter.serviceFilter(request, response);
		} catch (CouponSystemException e1) {
			return ResponseEntity.status(HttpStatus.CONFLICT).contentType(MediaType.APPLICATION_JSON).body(e1.getMessage());
		}
		try {
			admin.createCompany(company);
			return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body("Company : " + company.getCompName() + " created");
		} catch (CouponSystemException e) {
			// TODO Auto-generated catch bloc
			return ResponseEntity.status(HttpStatus.CONFLICT).contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}
		
	}
	
	/**
	 * Gets the all companies.
	 *
	 * @return the all companies
	 */
	@RequestMapping (value="/admin/getAllCompanies" , method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity getAllCompanies(HttpServletRequest request , HttpServletResponse response){
		try {
			ServiceFilter.serviceFilter(request, response);
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(admin.getAllCompanies());
	//	return admin.getAllCompanies();
	}
	
	/**
	 * Removes the company.
	 *
	 * @param company the company
	 */
	@RequestMapping (value="/admin/removeCompany" , method = RequestMethod.DELETE , produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity removeCompany (@RequestBody Company company , HttpServletRequest request , HttpServletResponse response) {
		try {
			ServiceFilter.serviceFilter(request, response);
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}
		admin.removeCompany(company);
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(company);
	 
		
	}
	
	/**
	 * Update company.
	 *
	 * @param company the company
	 */
	@RequestMapping(value = "/admin/companyDetailsUpdate" , method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity updateCompany(@RequestBody Company company , HttpServletRequest request , HttpServletResponse response) {
		try {
			ServiceFilter.serviceFilter(request, response);
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}
		Company updatedCopmany = admin.companyDetailsUpdate(company);
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(updatedCopmany); 
	}
	
	/**
	 * Gets the company by id.
	 *
	 * @param id the id
	 * @return the company by id
	 */
	@RequestMapping(value="/admin/getCompany/{id}" , method = RequestMethod.GET)
	public @ResponseBody ResponseEntity  getCompanyById (@PathVariable("id") int id , HttpServletRequest request , HttpServletResponse response) {
		try {
			ServiceFilter.serviceFilter(request, response);
		} catch (CouponSystemException e1) {
			return ResponseEntity.status(HttpStatus.CONFLICT).contentType(MediaType.APPLICATION_JSON).body(e1.getMessage());
		}
		try {
			Company company  =  admin.getCompany(id);
			return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(company);
		} catch (CouponSystemException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}
		
		
		//Customer REST 
	}
	
	/**
	 * Creates the customer.
	 *
	 * @param customer the customer
	 */
	@RequestMapping(value="/admin/addCustomer" , method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity  createCustomer(@RequestBody Customer customer , HttpServletRequest request , HttpServletResponse response) {
		try {
			ServiceFilter.serviceFilter(request, response);
		} catch (CouponSystemException e1) {
			return ResponseEntity.status(HttpStatus.CONFLICT).contentType(MediaType.APPLICATION_JSON).body(e1.getMessage());
		}
		try {
			Customer newCustomer = admin.addCustomer(customer);
			return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body("Customer " +newCustomer.getCustName()+ " created");
		} catch (CouponSystemException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}
	
	}
	
	/**
	 * Gets the customer by id.
	 *
	 * @param id the id
	 * @return the customer by id
	 */
	@RequestMapping(value="/admin/getCustomer/{id}" , method = RequestMethod.GET)
	public @ResponseBody ResponseEntity getCustomerById(@PathVariable("id") int id , HttpServletRequest request , HttpServletResponse response) {
		try {
			ServiceFilter.serviceFilter(request, response);
		} catch (CouponSystemException e1) {
			return ResponseEntity.status(HttpStatus.CONFLICT).contentType(MediaType.APPLICATION_JSON).body(e1.getMessage());
		}
		try {
		 Customer customer =  admin.getCustomer(id);
		  return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(customer);
		} catch (CouponSystemException e) {
			// TODO Auto-generated catch block
		  return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}
	}
	
	/**
	 * Removes the customer.
	 *
	 * @param customer the customer
	 * Removes just by ID 
	 */
	@RequestMapping(value="/admin/removeCustomer" ,  method = RequestMethod.DELETE , consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity removeCustomer(@RequestBody Customer customer , HttpServletRequest request , HttpServletResponse response) {
		try {
			ServiceFilter.serviceFilter(request, response);
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}
		Customer removedCustomer = admin.removeCustomer(customer);
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(removedCustomer);
	}
	
	/**
	 * Update customer.
	 *
	 * @param customer the customer
	 */
	@RequestMapping (value="/admin/updateCustomerDetails" , method = RequestMethod.PUT )
	public @ResponseBody ResponseEntity updateCustomer (@RequestBody Customer customer , HttpServletRequest request , HttpServletResponse response) {
		try {
			ServiceFilter.serviceFilter(request, response);
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}
		Customer updatedCustomer = admin.updateCustomerDetails(customer);
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(updatedCustomer); 
	}
	
	/**
	 * Gets the customers.
	 *
	 * @return the customers
	 */
	@RequestMapping (value="/admin/getCustomerList" , method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity ResponseEntitygetCustomers(HttpServletRequest request , HttpServletResponse response){
		try {
			ServiceFilter.serviceFilter(request, response);
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(admin.getCustomerList()); 
	}

}
