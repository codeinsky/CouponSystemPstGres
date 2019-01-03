package couponSystem.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import companiesOBJ.companiesOBJs;
import couponSystem.beans.Company;
import couponSystem.beans.Coupon;
import couponSystem.beans.Customer;
import couponSystem.exception.CouponSystemException;
import couponSystem.facade.AdminFacadeF;
import couponSystem.facade.ClientCouponFacade;
import couponSystem.facade.CompanyFacadeF;
import couponSystem.facade.CustomerFacadeF;
import couponSystem.logIn.LogInService;
import couponSystem.repos.CompanyRepo;
import couponSystem.repos.CouponsRepo;
import couponsOBJ.couponsOBJs;
import customersOBJ.customersOBJs;



// TODO: Auto-generated Javadoc
/**
 * The Class CoupomManagmentPstGresSqlApplicationTests.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CoupomManagmentPstGresSqlApplicationTests {
	
	/** The admin facade F. */
	@Autowired
	AdminFacadeF adminFacadeF;
	
	/** The company facade F. */
	@Autowired 
	CompanyFacadeF companyFacadeF; 

	/** The coupon repo. */
	@Autowired 
	CouponsRepo couponRepo; 
	
	/** The company repo. */
	@Autowired 
	CompanyRepo companyRepo; 
	
	/** The customer facade F. */
	@Autowired
	CustomerFacadeF customerFacadeF; 
	
	/** The log in service. */
	@Autowired
	LogInService logInService; 
	
	/**
	 * Context loads.
	 */
	@Test
	public void contextLoads() {
	}
	
//	@Test 
//	public void clearCoupon() {
//		couponRepo.deleteAll();
//	}
	
	/**
 * Admin create company test 1.
 *
 * @throws CouponSystemException the coupon system exception
 */
@Test 
	public void adminCreateCompanyTest1() throws CouponSystemException {
		adminFacadeF.createCompany(companiesOBJs.comp1);
	}
	
	/**
	 * Admin create company test 2.
	 *
	 * @throws CouponSystemException the coupon system exception
	 */
	@Test 
	public void adminCreateCompanyTest2() throws CouponSystemException {
		adminFacadeF.createCompany(companiesOBJs.comp2);
	}
	
	/**
	 * Admin remove company test.
	 */
	@Test 
	public void adminRemoveCompanyTest() {
		adminFacadeF.removeCompany(companiesOBJs.comp2);
	}

	/**
	 * Admin update company.
	 */
	@Test 
	public void adminUpdateCompany() {
		Company companyCh = companiesOBJs.comp3 ; 
		companyCh.setEmail("changed@email.com");
		companyCh.setId(26);
		adminFacadeF.companyDetailsUpdate(companyCh);
	}
	
	/**
	 * Admin update company sama name.
	 */
	@Test 
	public void adminUpdateCompanySamaName() {
		Company companyCh = companiesOBJs.comp4 ; 
		companyCh.setCompName("Apple_changed");
		adminFacadeF.companyDetailsUpdate(companyCh);
	}
	
	/**
	 * Admin get all compnaies.
	 */
	@Test 
	public void adminGetAllCompnaies() {
		System.out.println(adminFacadeF.getAllCompanies());
	}
	
	/**
	 * Admin get comapny by id.
	 *
	 * @throws CouponSystemException the coupon system exception
	 */
	@Test 
	public void adminGetComapnyById() throws CouponSystemException {
		System.out.println(adminFacadeF.getCompany(26));
	}
	
	/**
	 * Admin create customer.
	 *
	 * @throws CouponSystemException the coupon system exception
	 */
	@Test 
	public void adminCreateCustomer() throws CouponSystemException {
		adminFacadeF.addCustomer(customersOBJs.customer1);
	}
	
	/**
	 * Admin create customer same name.
	 *
	 * @throws CouponSystemException the coupon system exception
	 */
	@Test 
	public void adminCreateCustomerSameName() throws CouponSystemException {
		adminFacadeF.addCustomer(customersOBJs.customer2);
	}
	
	/**
	 * Admin create customer same name 2.
	 *
	 * @throws CouponSystemException the coupon system exception
	 */
	@Test 
	public void adminCreateCustomerSameName2() throws CouponSystemException {
		adminFacadeF.addCustomer(customersOBJs.customer3);
	}
	
	/**
	 * Admin remove customer.
	 */
	@Test 
	public void adminRemoveCustomer() {
		adminFacadeF.removeCustomer(customersOBJs.customer4);
	}
	
	/**
	 * Admin custmer update.
	 */
	@Test 
	public void adminCustmerUpdate() {
		Customer cust = customersOBJs.customer1;
		cust.setCustName("PeterNEW1");
		adminFacadeF.updateCustomerDetails(cust);
	}
	
	/**
	 * Admin custmer update 2.
	 */
	@Test 
	public void adminCustmerUpdate2() {
		Customer cust = customersOBJs.customer1;
		cust.setPassword("changedPassword");
		adminFacadeF.updateCustomerDetails(cust);
	}
	
	/**
	 * Admin customer get all customers.
	 */
	@Test 
	public void adminCustomerGetAllCustomers() {
		System.out.println(adminFacadeF.getCustomerList());
	}
	
	/**
	 * Admin get customer by id.
	 *
	 * @throws CouponSystemException the coupon system exception
	 */
	@Test 
	public void adminGetCustomerById() throws CouponSystemException {
		System.out.println(adminFacadeF.getCustomer(1));
	}
	

	 
	
//	@Test 
//	public void companyCreateCoupon() {
//		companyFacadeF.setCompanyIdLogged(4);
//		companyFacadeF.createCoupon(couponsOBJs.coupon4);
//		companyFacadeF.createCoupon(couponsOBJs.coupon7);
//		companyFacadeF.createCoupon(couponsOBJs.coupon9);
//		companyFacadeF.createCoupon(couponsOBJs.coupon10);
//		
//	}
	
//	@Test 
//	public void companyCreateCoupon2() {
//		companyFacadeF.setCompanyIdLogged(26);
//		companyFacadeF.createCoupon(couponsOBJs.coupon2);
//		
//	}
	
	/**
 * Company coupon update.
 */
@Test 
	public void companyCouponUpdate() {
		Coupon coupon = couponRepo.findById(63).get();
		coupon.setAmount(20);
		coupon.setMessage("ChangedMessage");
		companyFacadeF.updateCoupon(coupon);
	}
	
	/**
	 * Company get coupon by id.
	 *
	 * @throws CouponSystemException the coupon system exception
	 */
	@Test 
	public void companyGetCouponById() throws CouponSystemException {
		companyFacadeF.setCompanyIdLogged(26);
		System.out.println("My coupon is " + companyFacadeF.getCouponById(50));
	}
	
	
	/**
	 * Company get my coupons.
	 */
	@Test 
	public void companyGetMyCoupons() {
		companyFacadeF.setCompanyIdLogged(26);
		System.out.println("All my coupons are :" +   companyFacadeF.getAllCoupons());
	}
	
	/**
	 * Test sort coupons by.
	 *
	 * @throws CouponSystemException the coupon system exception
	 */
	@Test 
	public void testSortCouponsBy() throws CouponSystemException {
		companyFacadeF.setCompanyIdLogged(4);
		System.out.println("My sorted coupons are : " + companyFacadeF.sortCouponBy("TYPE","FOOD"));
	}
	
	/**
	 * Test sort coupons by 1.
	 *
	 * @throws CouponSystemException the coupon system exception
	 */
	@Test 
	public void testSortCouponsBy1() throws CouponSystemException {
		companyFacadeF.setCompanyIdLogged(4);
		System.out.println("My sorted coupons are : " + companyFacadeF.sortCouponBy("TYPE","SPORTS"));
	}
	
	/**
	 * Test sort coupons by 3.
	 *
	 * @throws CouponSystemException the coupon system exception
	 */
	@Test 
	public void testSortCouponsBy3() throws CouponSystemException {
		companyFacadeF.setCompanyIdLogged(4);
		System.out.println("My sorted coupons by PRICE are : " + companyFacadeF.sortCouponBy("PRICE","5"));
	}
	
	/**
	 * Test sort coupons by 4.
	 *
	 * @throws CouponSystemException the coupon system exception
	 */
	@Test 
	public void testSortCouponsBy4() throws CouponSystemException {
		companyFacadeF.setCompanyIdLogged(4);
		System.out.println("My sorted coupons by DATE are : " + companyFacadeF.sortCouponBy("DATE","2025-01-01"));
	}
	
	/**
	 * Test buy A coupon.
	 *
	 * @throws CouponSystemException the coupon system exception
	 */
	@Test 
	public void testBuyACoupon() throws CouponSystemException {
		customerFacadeF.setCustomerLogged(1);
		customerFacadeF.purchaseCoupon(60);
		
	}
	
	
	/**
	 * Test get my coupons.
	 */
	@Test 
	public void testGetMyCoupons() {
		customerFacadeF.setCustomerLogged(3);
		System.out.println("All my coupons are : " + customerFacadeF.getAllMyCoupons());
		
	}
	
	/**
	 * Test sort my coupons.
	 */
	@Test 
	public void testSortMyCoupons() {
		customerFacadeF.setCustomerLogged(5);
		System.out.println("Coupons per type : "  + customerFacadeF.getMyCouponsSortedByType("TYPE", "FOOD"));
		System.out.println("Coupons per type : "  + customerFacadeF.getMyCouponsSortedByType("TYPE", "SPORTS"));
		System.out.println("Coupons per price : "  + customerFacadeF.getMyCouponsSortedByType("PRICE", "200"));
		System.out.println("Coupons per DATE: "  + customerFacadeF.getMyCouponsSortedByType("DATE", "2025-01-01"));
		System.out.println("Coupons per DATE: "  + customerFacadeF.getMyCouponsSortedByType("DATE", "2017-01-01"));
	}
	
	/**
	 * Test log in.
	 */
	@Test 
	public void testLogIn() {
		System.out.println(logInService.logIn("admin", "admin", "12345") instanceof ClientCouponFacade);
		System.out.println(logInService.logIn("admin", "admin", "1234") instanceof ClientCouponFacade);
		System.out.println(logInService.logIn("company", "IBM", "newOnee") instanceof ClientCouponFacade);
		System.out.println(logInService.logIn("customer", "Ivan", "bbbbb") instanceof ClientCouponFacade);
		System.out.println(logInService.logIn("company", "IBM", "newOne") instanceof ClientCouponFacade);
		System.out.println(logInService.logIn("customer", "Ivan", "bbbb") instanceof ClientCouponFacade);
	}
	
	/**
	 * Test get all coupns.
	 */
	@Test 
	public void testGetAllCoupns() {
		System.out.println("You can buy : "  + customerFacadeF.getAllCouponsToBuy());
	}



}
