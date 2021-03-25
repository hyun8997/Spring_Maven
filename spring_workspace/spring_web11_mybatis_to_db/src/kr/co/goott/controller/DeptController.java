package kr.co.goott.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.goott.dao.DAO;
import kr.co.goott.dto.DeptDTO;

@Controller
public class DeptController {
	
	// new는 모두 컨테이너에서 처리되야 함
	@Autowired
	DAO dao;
	
	// 세터를 설정해두면 컨테이너에서 dao가 알아서 new됨
	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
	
	@RequestMapping(value = "/deptList")
	public String list(Model model) {
		
		// model 단 호출 - dao 호출
		List<DeptDTO> list = dao.selectAll();	//호출해서 데이터 받아둠
		
		model.addAttribute("list", list);	//모델을 통해 데이터 보내기
		
		return "list";
	}
	
	@RequestMapping(value = "/insert")
	public String processStep1() {
		return "insertForm";
	}
	
	/*
	spring mvc 파라미터 값을 가져오기
	1. 요청객체 이용 : (HttpServeletRequest req)
	2. annotation : (@RequestParam("deptno")int deptno, ...) - get		(@RequestBody) - post
	3. 객체 : (@ModelAttribute() DeptDTO, ...)
	*/
	
	@RequestMapping(value = "/insertOk")
	public String processStep2(@ModelAttribute() DeptDTO deptDto) {
		dao.insertOne(deptDto);
		
		return "redirect:/deptList";
	}
	
	
	
}
