package kr.co.sist.day0109;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RequestMapping("/day0109")
@Controller
public class CookieController {

	@GetMapping("/useCookie")
	public String useCookie() {
		return "/day0109/useCookie";
	}//useCookie
	
	@GetMapping("/addCookie")
	public String addCookie( HttpServletResponse response, Model model ) {
		
		//쿠키생성
		Cookie nameCookie=new Cookie("name", "임성우");
		Cookie ageCookie=new Cookie("age", "25");
		
		//생존시간 설정
		nameCookie.setMaxAge(60*60);
		ageCookie.setMaxAge(60*60);
		
		//쿠키심기
		response.addCookie(nameCookie);
		response.addCookie(ageCookie);
		
		model.addAttribute("result",  true);
		
		return "/day0109/useCookie";
	}//addCookie
	
	@GetMapping("/readCookie")
	public String readCookie( HttpServletRequest request, Model model) {
		
		//쿠키들 읽기 (JSESSIONID - x )
		Cookie[] cookies=request.getCookies();
		boolean flag=false;
		for(Cookie readCookie :cookies) {
			if(!"JSESSIONID".equals(readCookie.getName())) {
				model.addAttribute(readCookie.getName(), readCookie.getValue());
				flag=true;
			}//end if
		}//for
		model.addAttribute("readFlag", flag);
		
		System.out.println("쿠키 이름 : " +model.getAttribute("name"));
		System.out.println("쿠키 나이 : " +model.getAttribute("age"));
		
		return "/day0109/readCookie";
	}//readCookie
	
	@GetMapping("/readCookieAnnotation")
	public String readCookie2(
			@CookieValue(value="name",defaultValue = "민병조") String name, 
			@CookieValue(value="age",defaultValue ="0" ) String age) {
		
		System.out.println("쿠키 이름 : " + name);
		System.out.println("쿠키 나이 : " + age);
		
		return "/day0109/readCookie2";
	}//readCookie2
	
	@GetMapping("/removeCookie")
	public String removeCookie( HttpServletResponse response, Model model ) {
		
		//쿠키생성
		Cookie nameCookie=new Cookie("name", "");
		Cookie ageCookie=new Cookie("age", "");
		
		//생존시간 설정
		nameCookie.setMaxAge(0);
		ageCookie.setMaxAge(0);
		
		//쿠키심기
		response.addCookie(nameCookie);
		response.addCookie(ageCookie);
		
		model.addAttribute("result",  false);
		
		return "/day0109/useCookie";
	}//addCookie

	
}//class









