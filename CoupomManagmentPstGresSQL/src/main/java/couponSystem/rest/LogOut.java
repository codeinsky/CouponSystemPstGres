package couponSystem.rest;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import couponSystem.facade.ClientCouponFacade;

@CrossOrigin("*")
@RestController 
public class LogOut {

		@RequestMapping(value = "/logout", method = RequestMethod.GET)
		public @ResponseBody  ResponseEntity loggingOut(HttpServletRequest request , HttpServletResponse response) throws IOException {
		//	HttpSession mySession = request.getSession();
			ClientCouponFacade facade = (ClientCouponFacade) request.getSession().getAttribute("facade");	
			if (facade != null) {
				request.getSession().invalidate();
				System.out.println("session exist and was invalidated");
				return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.TEXT_PLAIN).body("Thank you for visiting our site");
			} 
			else {
				System.out.println("You have no facade");
				return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.TEXT_PLAIN).body("UnRegistrered User !!! Bye ");
			}
		//	response.sendRedirect("/login.html");
			
		}
}
