package kr.co.sist.day0108;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;
@Controller
public class SessionController {

	@GetMapping("/useHttpSession")
	public String setSession(HttpSession session) {
		//값 할당
		session.setAttribute("sesname", "민병조");
		session.setAttribute("sesage", 1972);
		session.setAttribute("sessionValue", "HttpSession에 설정된 값");
		
		return "day0108/sessionResult";
	}//hello
	@GetMapping("/useHttpSessionGet")
	public String setSessionGetValue(HttpSession session) {
		//view -> controller로 값 얻기
		String name = (String)session.getAttribute("sesname");
		Integer age = (Integer)session.getAttribute("sesage");
		
		System.out.println("***세션 이름 : "+name);
		System.out.println("***세션 나이 : "+age);
		
		return "day0108/sessionResult";
	}//hello
	
	@GetMapping("/useHttpSessionRemove")
	public String setSessionRemoveValue(HttpSession session) {
		//*** 세션값 삭제
		// 특정 세션 속성(객체)만 제거하는 메서드, 세션 자체는 유지
		session.removeAttribute("sesname");
		session.removeAttribute("sesage");

		//*** 세션 무효화
		//세션을 완전히 만료시킨다
		//모든 세션 속성을 삭제하고 기존 세션을 무효화(invalidate) 한다.
		session.invalidate();
		
//		System.out.println("***세션 이름 : "+name);
//		System.out.println("***세션 나이 : "+age);
		
		return "day0108/sessionResult";
	}//hello
	
}//class
