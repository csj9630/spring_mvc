package kr.co.sist.day0107;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReqParamController {

	@GetMapping("/day0107/reqParam_form")
	public String paramForm() {
		return "day0107/reqParamFrm";
	}//paramForm

	//HTML Form Control 명과 parameter의 이름이 다를 때
	@PostMapping("/reqParamFrmProcess")
	public String useRequestParam(
			@RequestParam(value="name2",defaultValue = "익명") String name,
			@RequestParam(value="age2",defaultValue = "0") int age, String[] hobby) {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("취미 : "+Arrays.toString(hobby));
		
		return "day0107/paramFrmResult";
	}//useRequestParam
	
}//class
