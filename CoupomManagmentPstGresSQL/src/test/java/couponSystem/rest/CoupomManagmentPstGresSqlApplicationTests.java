package couponSystem.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import companiesOBJ.companiesOBJs;
import couponSystem.beans.Company;
import couponSystem.beans.Coupon;
import couponSystem.beans.CouponType;
import couponSystem.beans.Customer;
import couponSystem.facade.AdminFacadeF;
import couponSystem.facade.CompanyFacadeF;
import couponSystem.facade.CustomerFacadeF;
import couponSystem.repos.CouponsRepo;
import couponsOBJ.couponsOBJs;
import customersOBJ.customersOBJs;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CoupomManagmentPstGresSqlApplicationTests {
	
	@Autowired
	AdminFacadeF adminFacadeF;
	
	@Autowired 
	CompanyFacadeF companyFacadeF; 

	@Autowired 
	CouponsRepo couponRepo; 
	
	@Autowired
	CustomerFacadeF customerFacadeF; 
	
	@Test
	public void contextLoads() {
	}
	
//	@Test 
//	public void clearCoupon() {
//		couponRepo.deleteAll();
//	}
	
	@Test 
	public void adminCreateCompanyTest1() {
		adminFacadeF.createCompany(companiesOBJs.comp1);
	}
	
	@Test 
	public void adminCreateCompanyTest2() {
		adminFacadeF.createCompany(companiesOBJs.comp2);
	}
	
	@Test 
	public void adminRemoveCompanyTest() {
		adminFacadeF.removeCompany(companiesOBJs.comp2);
	}

	@Test 
	public void adminUpdateCompany() {
		Company companyCh = companiesOBJs.comp3 ; 
		companyCh.setEmail("changed@email.com");
		companyCh.setId(26);
		adminFacadeF.companyDetailsUpdate(companyCh);
	}
	
	@Test 
	public void adminUpdateCompanySamaName() {
		Company companyCh = companiesOBJs.comp4 ; 
		companyCh.setCompName("Apple_changed");
		adminFacadeF.companyDetailsUpdate(companyCh);
	}
	
	@Test 
	public void adminGetAllCompnaies() {
		System.out.println(adminFacadeF.getAllCompanies());
	}
	
	@Test 
	public void adminGetComapnyById() {
		System.out.println(adminFacadeF.getCompany(26));
	}
	
	@Test 
	public void adminCreateCustomer() {
		adminFacadeF.addCustomer(customersOBJs.customer1);
	}
	
	@Test 
	public void adminCreateCustomerSameName() {
		adminFacadeF.addCustomer(customersOBJs.customer2);
	}
	
	@Test 
	public void adminCreateCustomerSameName2() {
		adminFacadeF.addCustomer(customersOBJs.customer3);
	}
	@Test 
	public void adminRemoveCustomer() {
		adminFacadeF.removeCustomer(customersOBJs.customer4);
	}
	
	@Test 
	public void adminCustmerUpdate() {
		Customer cust = customersOBJs.customer1;
		cust.setCustName("PeterNEW1");
		adminFacadeF.updateCustomerDetails(cust);
	}
	
	@Test 
	public void adminCustmerUpdate2() {
		Customer cust = customersOBJs.customer1;
		cust.setPassword("changedPassword");
		adminFacadeF.updateCustomerDetails(cust);
	}
	
	@Test 
	public void adminCustomerGetAllCustomers() {
		System.out.println(adminFacadeF.getCustomerList());
	}
	
	@Test 
	public void adminGetCustomerById() {
		System.out.println(adminFacadeF.getCustomer(1));
	}
	

	 
	
	@Test 
	public void companyCreateCoupon() {
		companyFacadeF.setCompanyIdLogged(4);
		companyFacadeF.createCoupon(couponsOBJs.coupon4);
		companyFacadeF.createCoupon(couponsOBJs.coupon7);
		companyFacadeF.createCoupon(couponsOBJs.coupon9);
		companyFacadeF.createCoupon(couponsOBJs.coupon10);
		
	}
	
	@Test 
	public void companyCreateCoupon2() {
		companyFacadeF.setCompanyIdLogged(26);
		companyFacadeF.createCoupon(couponsOBJs.coupon2);
		
	}
	
	@Test 
	public void companyCouponUpdate() {
		Coupon coupon = couponRepo.findById(63).get();
		coupon.setAmount(20);
		coupon.setMessage("ChangedMessage");
		companyFacadeF.updateCoupon(coupon);
	}
	
	@Test 
	public void companyGetCouponById() {
		companyFacadeF.setCompanyIdLogged(26);
		System.out.println("My coupon is " + companyFacadeF.getCouponById(50));
	}
	
	
	@Test 
	public void companyGetMyCoupons() {
		companyFacadeF.setCompanyIdLogged(26);
		System.out.println("All my coupons are :" +   companyFacadeF.getAllCoupons());
	}
	@Test 
	public void testSortCouponsBy() {
		companyFacadeF.setCompanyIdLogged(4);
		System.out.println("My sorted coupons are : " + companyFacadeF.sortCouponBy("TYPE","FOOD"));
	}
	
	@Test 
	public void testSortCouponsBy1() {
		companyFacadeF.setCompanyIdLogged(4);
		System.out.println("My sorted coupons are : " + companyFacadeF.sortCouponBy("TYPE","SPORTS"));
	}
	
	@Test 
	public void testSortCouponsBy3() {
		companyFacadeF.setCompanyIdLogged(4);
		System.out.println("My sorted coupons by PRICE are : " + companyFacadeF.sortCouponBy("PRICE","5"));
	}
	
	@Test 
	public void testSortCouponsBy4() {
		companyFacadeF.setCompanyIdLogged(4);
		System.out.println("My sorted coupons by DATE are : " + companyFacadeF.sortCouponBy("DATE","2025-01-01"));
	}
	
	@Test 
	public void testBuyACoupon() {
		customerFacadeF.setCustomerLogged(1);
		customerFacadeF.purchaseCoupon(60);
		
	}
	
	
	@Test 
	public void testGetMyCoupons() {
		customerFacadeF.setCustomerLogged(3);
		System.out.println("All my coupons are : " + customerFacadeF.getAllMyCoupons());
		
	}
	
	@Test 
	public void testSortMyCoupons() {
		customerFacadeF.setCustomerLogged(5);
		System.out.println("Coupons per type : "  + customerFacadeF.getMyCouponsSortedByType("TYPE", "FOOD"));
		System.out.println("Coupons per type : "  + customerFacadeF.getMyCouponsSortedByType("TYPE", "SPORTS"));
		System.out.println("Coupons per price : "  + customerFacadeF.getMyCouponsSortedByType("PRICE", "200"));
		System.out.println("Coupons per DATE: "  + customerFacadeF.getMyCouponsSortedByType("DATE", "2025-01-01"));
		System.out.println("Coupons per DATE: "  + customerFacadeF.getMyCouponsSortedByType("DATE", "2017-01-01"));
	}



}
