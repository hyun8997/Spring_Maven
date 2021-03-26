package kr.co.goott;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SurveyController {
	
	@RequestMapping(value = "/survey/survey.Choose")
	public String processStep1() {
		return "surveyForm";
	}
	
	@RequestMapping(value = "/survey/survey.ok")
	public String processStep2(HttpServletRequest req) {
		
		String[] img = req.getParameterValues("ck");	//이름 같은 체크박스를 써서 배열로 받아오기
		
		if(img==null) {
			return "surveyForm";
		}else {
			req.setAttribute("img", img);
			return "surveySubmitted";
		}
	}
	
	
	
	
	
	
	
	
}
