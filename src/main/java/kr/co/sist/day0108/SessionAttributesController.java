package kr.co.sist.day0108;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import jakarta.servlet.http.HttpSession;


@SessionAttributes({"sesname","sesage","modelValue"})
@Controller
public class SessionAttributesController {
	/**
	 * @SessionAttributes를 사용하면
	 * Model, ModelAndView에 값을 설정하면 request,Session 객체에 값이 설정한다
	 * @param model
	 * @return
	 */
	@GetMapping("/useSessionAttributes")
	public String useSessionModel(Model model) {
		model.addAttribute("sesname", "승준");
		model.addAttribute("sesage", 27);
		model.addAttribute("modelValue", "@SessionAttributes에 설정값 ");
		return "day0108/sessionAttributesResult";
	}//method
	
	/**
	 * 
	 * Controller에서 Model 값 얻기
	 * @param model
	 * @return
	 */
	@GetMapping("/useSessionAttributesGet")
	public String useSessionModelGet(Model model) {
		String name = (String) model.getAttribute("sesname");
		Integer age = (Integer)model.getAttribute("sesage");
		
		System.out.println("******useSessionModelGet*** : " +name);
		System.out.println("******useSessionModelGet*** : " +age);
		return "day0108/sessionAttributesResult";
	}//hello

	
	/**
	 * Model에 설정된 값은 HttpSession으로는 삭제되지 않는다.
	 * @param session
	 * @return
	 */
	@GetMapping("/useSessionAttributesRemove")
	public String useSessionModelRemove(HttpSession session) {
		session.removeAttribute("sesname");
		session.removeAttribute("sesage");
		
		String name = (String) session.getAttribute("sesname");
		Integer age = (Integer)session.getAttribute("sesage");
		
		System.out.println("******useSessionModelGet*** : " +name);
		System.out.println("******useSessionModelGet*** : " +age);
		//콘솔에는 null로 나오지만 웹에는 계속 값이 나온다.
		
		return "day0108/sessionAttributesResult";
	}//hello
	
	/**
	 * Model에 설정된 값은 SessionStatus.setComplete()로 삭제한다.
	 * @param session
	 * @return
	 */
	@GetMapping("/useSessionAttributesRemove2")
	public String useSessionModelRemove2(SessionStatus ss,Model model) {
		ss.setComplete();
		
		String name = (String) model.getAttribute("sesname");
		Integer age = (Integer)model.getAttribute("sesage");
		
		System.out.println("******useSessionModelRemove2*** : " +name);
		System.out.println("******useSessionModelRemove2*** : " +age);
		return "redirect:/index.html";
	}//hello
}//class
