package couponSystem.rest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import couponSystem.facade.ClientCouponFacade;
import couponSystem.logIn.LogInService;



@Controller
public class LogIn {

	@Autowired 
	LogInService loginService; 
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public  String doPostRedirect(
			// declare parameters sent by the user!
			/*
		<p> NAME : <input name="name" type="text"></p>
		<p> PASSWORD : <input name="pwd" type="password"></p>
		use must call the parameters like the text box name attribute
			 */
				@RequestParam String name, @RequestParam String pwd, @RequestParam String usertype,
				HttpServletRequest request
			)
	{
		
		// check which usertype we got!
		ClientCouponFacade cf = loginService.logIn(usertype, name, pwd); // should be get instance
		
		if (cf == null) // login failed!
		{
			System.out.println("wrong Log in , go back");
			return "redirect:https://couponsystemv1.herokuapp.com/login.html";
		}

		// success!
		System.out.println("Log in Succefull");
		request.getSession().setAttribute("facade", cf);
		
		// now redirect to the correct page!
		switch (usertype)
		{
			case "admin":
					return "redirect:https://couponsystemv1.herokuapp.com/admin/index.html";
			case "company":
					return "redirect:https://couponsystemv1.herokuapp.com/company/index.html";
			case "customer":
					return "redirect:https://couponsystemv1.herokuapp.com/customer/index.html";
		}
		
		return "redirect:https://couponsystemv1.herokuapp.com/login.html";
	}
			
			
}