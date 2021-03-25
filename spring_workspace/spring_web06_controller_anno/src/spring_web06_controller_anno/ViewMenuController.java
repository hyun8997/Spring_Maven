package spring_web06_controller_anno;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewMenuController {

	@RequestMapping(value = "viewData1.do")
	public ModelAndView show1(HttpServletRequest req) {
		return new ModelAndView("view", "message1", req.getParameter("message"));
	}
	
	@RequestMapping(value = "viewData2.do")
	public String show2(HttpServletRequest req) {
		req.setAttribute("message2", req.getParameter("message"));
		return "view";
	}
	
		
}
