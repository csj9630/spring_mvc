package kr.co.sist.day0108;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
@Controller
public class ReqChainController {

	@RequestMapping(value="/reqChain", method = {GET,POST})
	public String reqChainA(HttpServletRequest request) {
		System.out.println("----------reqChainA  : "+request.getHeader("referer"));
		return "forward:/reqChain2";
	}//
	@RequestMapping(value="/reqChain2", method = {GET,POST})
	public String reqChainB(HttpServletRequest request, Model model) {
		System.out.println("----------reqChainB  : "+request.getHeader("referer"));
		
		model.addAttribute("name", "민병조");
		model.addAttribute("age", 25);
		
		return "forward:/reqChain3";
	}//
	@RequestMapping(value="/reqChain3", method = {GET,POST})
	public String reqChainC(HttpServletRequest request) {
		System.out.println("----------reqChainC  : "+request.getHeader("referer"));
		return "day0108/reqChainResult";
	}//
}//class
