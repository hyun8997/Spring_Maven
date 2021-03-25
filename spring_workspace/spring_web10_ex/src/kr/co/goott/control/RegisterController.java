package kr.co.goott.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.goott.dto.MemberDTO;

@Controller
public class RegisterController {
	
	@RequestMapping(value = "/register/step1.do")		/*이 주소가 들어오면 이동하도록*/
	public String processStep1() {
		return "step1";
	}
	
	@RequestMapping(value = "/register/step2.do")
	public String processStep2(HttpServletRequest req) { /* 위의 스탭1에서 약관 동의한걸 브라우저에서 받아오도록 열어둠 */
		
		String ck = req.getParameter("ck");		//체크박스를 name="ck"로 보냈음
		
		if(ck==null) {	//그냥 정보가 넘어왔는지 아닌지 체크
			return "step1";
		}else {
			return "step2";
		}
//		return "step2";
	}
	
//	@RequestMapping(value = "/register/step3.do")
//	public String processStep3(
//			//@RequestParam(value = "no", defaultValue = 0)int no,	//바로 형변환해서 받을 수 있음
//			@RequestParam(value = "id", defaultValue = "aaa", required = true)String id,		
//												//annotation 옵션들 디폴트값을 주거나, 필수로 데이터가 들어가야 하는지 여부 설정
//			@RequestParam(value = "pwd")String pwd, 
//			@RequestParam(value = "confirm")String confirm, 
//			@RequestParam(value = "email")String email,
//			Model model) {	//모델 객체를 선언해서 받은 데이터를 전달 할 수있음
//		
////		String id = req.getParameter("id");				//이렇게 받는 기능을 annotation으로도 구현 가능
//																	//HttpServletRequest 대신 사용
//		
//		MemberDTO dto = new MemberDTO();
//		dto.setId(id);
//		dto.setPwd(pwd);
//		dto.setConfirm(confirm);
//		dto.setEmail(email);
//		
//		
//		//사용자가 입력한 정보를 db에 등록 기능 안넣었음, 예시
//		// MysqlDAO dao = new MysqlDAO();
//		// dao.insertOne(dto);
//		
//		
//		//db 동작했다고 치고 출력용 데이터 전달하기
//		model.addAttribute("dto", dto);
//		
//		
//		return "welcome";
//	}
//	
	
	
	//받는 데이터가 엄청 많을때 (100개 이상?)
	//3줄로 위의 코드와 같은 동작 함
	@RequestMapping(value = "/register/step3.do")
	public String processStep3(@ModelAttribute() MemberDTO dto, Model model) {	//자동으로 dto로 받아옴
		
		model.addAttribute("dto", dto);
		
		return "welcome";
	}
	
	
//	@RequestMapping(value = "/main")		//이 코드를 컨테이너에서 처리하도록
//	public String processStep4() {			//요청 경로와 뷰 이름을 모두 알고 있는 경우
//		return "main";								//컨트롤개발자 대신 뷰 개발자가 할 수 있음
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
