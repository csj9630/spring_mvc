package kr.co.sist.day0107;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@RequestMapping("/data")
@Controller
public class DataSendController {

	// "/요청명",GET/POST 둘 다 요청 가능.
//	@RequestMapping(value="/useRequest", method= {RequestMethod.GET,RequestMethod.POST})
	@RequestMapping(value="/useRequest", method= {GET,POST}) //static import 받아서 짧게 쓰기.
	public String useRequest(HttpServletRequest request, Model model) {
		System.out.println("-----------"+request);
		System.out.println("-----------"+model);
		
	
		ParamDTO pDTO = new ParamDTO();
		pDTO.setName("임성우");
		pDTO.setAge(25);
		pDTO.setHobby(new String[] {"게임","축구","음악감상"});
		
		request.setAttribute("data", pDTO); //request : forward로 이동한 페이지에서 사용 가능(redirect는 안된다)
		
		return "data/dataResult";
	}//useRequest
	
	
	@RequestMapping(value="/useModel", method= {GET,POST})
	public String useModel(HttpServletRequest request, Model model) {
		
		ParamDTO pDTO = new ParamDTO();
		pDTO.setName("임성우");
		pDTO.setAge(25);
		pDTO.setHobby(new String[] {"게임","축구","음악감상"});
		
		model.addAttribute("data",pDTO); //request : forward로 이동한 페이지에서 사용 가능(redirect는 안된다)
		model.addAttribute("ip",request.getRemoteAddr());
		model.addAttribute("ua",request.getHeader("User-Agent"));
		
		
		ParamService ps = new ParamService(); //이번엔 auto wired를 안 쓰는 방식
		model.addAttribute("psData", ps.searchParam());
		
		return "data/dataResult";
	}//useModel

	@RequestMapping(value="/useModelAndView", method= {GET,POST})
	//반환형을 ModelAndView 설정
	public ModelAndView useModelAndView(HttpServletRequest request, Model model) {
		ParamDTO pDTO = new ParamDTO();
		pDTO.setName("박현우");
		pDTO.setAge(123);
		pDTO.setHobby(new String[] {"독서","스키"});
		
		//ModelAndView 클래스 생성
		ModelAndView mav = new ModelAndView();
		
		//view명 설정
		mav.setViewName("data/dataResult");
		mav.addObject("data",pDTO); //request : forward로 이동한 페이지에서 사용 가능(redirect는 안된다)
		mav.addObject("ip",request.getRemoteAddr());
		mav.addObject("ua",request.getHeader("User-Agent"));
		
		
		ParamService ps = new ParamService(); //이번엔 auto wired를 안 쓰는 방식
		mav.addObject("psData", ps.searchParam());
		
		return mav;
	}//useModelAndView
	
}//class
