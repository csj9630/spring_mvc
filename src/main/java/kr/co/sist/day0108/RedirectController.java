package kr.co.sist.day0108;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping(value="/redirect", method = {GET,POST})
	public String redirect() {
		return "redirect:/reqChain3";
	}//
	
}
