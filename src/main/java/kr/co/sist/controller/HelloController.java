//package kr.co.sist.controller;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//
//@Controller
//public class HelloController {
//	
//	
//	/**
//	 * get 요청이 최상위 경로로 들어오면 hello 보여주기.
//	 * @return
//	 */
////	@RequestMapping(value="/",method = RequestMethod.GET)
//	@GetMapping("/")
//	public String hello(Model model) {
//		model.addAttribute("name", "승준");
//		model.addAttribute("date", new SimpleDateFormat("yyyy-MM-dd EEEE kk:mm:ss").format(new Date()));
//		return "hello";
//	}//hello
//}//class
