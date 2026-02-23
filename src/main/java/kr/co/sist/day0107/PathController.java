package kr.co.sist.day0107;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/day0107") // 상위 URL
@Controller
public class PathController {
//	@GetMapping("/day0107/req")
	@GetMapping("/req") //@RequestMapping의 상위 URL이 자동으로 앞에 붙는다.
	public String methodA() {
		return "day0107/reqResult";
	}//methodA
	
	@GetMapping("/req2")
	public String methodB() {
		return "day0107/reqResult";
	}//methodA
	
	@GetMapping("/req3")
	public String methodC() {
		return "day0107/reqResult";
	}//methodA
	
}//class
