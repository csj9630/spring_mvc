package kr.co.sist.day0108;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class useSession {

	@GetMapping("/useHttpSession2")
	public String useSessionValue(HttpSession session, Model model	) {
		System.out.println("session에 존재하는 값 : "+session.getAttribute("sessionValue"));
		System.out.println("Modek(sessionAttribute)에 존재하는 값 : "+model.getAttribute("modelValue"));
		
		return "day0108/sessionResult2";
	}//method
}//class
