package kr.co.goott.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/member/login.do", method = RequestMethod.GET)		
																//enum 객체, 주소로 들어올때 어떤 method로 올지 설정, 제한
	public String loginProcess1() {
		return "login/login";
	}
	
	
	
	
	
	
	
	
}
