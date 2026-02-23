package kr.co.sist.day0107;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ParamController {
	@Autowired
	private ParamService ps;
	
	@GetMapping("/param_form")
	public String paramForm() {
		return "day0107/paramFrm";
	}//paramForm
	
	/**
	 * HttpServletRequest를 사용한 web Parameter 받기
	 * - web param 처리 효율은 좋지 않지만
	 * - 접속자의 정보를 얻을 때 사용한다.(ip, port,...)
	 * @param request
	 * @return
	 */
	@PostMapping("/request")
	public String useRequest(HttpServletRequest request) {
		System.out.println("--------서버명-----------"+request.getServerName());
		//접속자의 정보(ip, user-agent)를 획득한다.
		String ip = request.getRemoteAddr();
		System.out.println("접속자 ip "+ip);
		String ua = request.getHeader("User-Agent");
		System.out.println("접속자 User-Agent"+ua);

		//파라메터 받기
		String name = request.getParameter("name");
		String age= request.getParameter("age");
		String[] hobby= request.getParameterValues("hobby");
		
		//DTO를 생성하고 값을 할당.
		ParamDTO pDTO = new ParamDTO();
		pDTO.setName(name);
		pDTO.setAge(Integer.parseInt(age));
		pDTO.setHobby(hobby);

		ps.businessLogic(pDTO);
		
		return "day0107/paramResult";
	}//paramForm
	
	@PostMapping("/primitive")
	public String usePrimitive(String name, int age, String[] hobby) {
		
		//DTO를 생성하고 값을 할당.
		ParamDTO pDTO = new ParamDTO();
		pDTO.setName(name);
		pDTO.setAge(age);
		pDTO.setHobby(hobby);

		ps.businessLogic(pDTO);
		
	
		return "day0107/paramResult";
	}//usePrimitive
	
	//제일 간단함.
	@PostMapping("/dto")
	public String useDTO(HttpServletRequest request, ParamDTO pDTO) {
		//접속자의 정보(ip, user-agent)를 획득한다.
		String ip = request.getRemoteAddr();
		String ua = request.getHeader("User-Agent");
		
		pDTO.setIp(ip);
		pDTO.setUserAgent(ua);

		ps.businessLogic(pDTO);
		
	
		return "day0107/paramResult";
	}//usePrimitive
		
}//class
