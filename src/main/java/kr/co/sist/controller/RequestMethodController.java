package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class RequestMethodController {
	//하나의 메서드에서 서로 다른 URL로 요청되어야할 때는 배열로 처리하여 한번에 받기.
	@GetMapping({"/get","/get2","/get3"})
	public String getTest() {
		return "day0106/get";
	}//getTest
	
	@PostMapping("/post")
	public String postTest() {
		return "day0106/post";
	}//postTest
	
	@RequestMapping(value="/getPost",method={RequestMethod.GET,RequestMethod.POST})
	public String getPostTest(HttpServletRequest request, Model model) {
		model.addAttribute("method", request.getMethod());
		return "day0106/getPost";
	}//postTest
	
	
}//class
