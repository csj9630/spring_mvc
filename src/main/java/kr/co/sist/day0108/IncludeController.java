package kr.co.sist.day0108;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IncludeController {
	@GetMapping("/include")
	public String testInclude() {
		return "day0108/include";
	}//paramForm
}//class
