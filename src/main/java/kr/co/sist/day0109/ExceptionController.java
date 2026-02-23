package kr.co.sist.day0109;

import java.sql.SQLException;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/day0109")
@Controller
public class ExceptionController {

	
	@GetMapping("/exceptionHandle")
	public String work( String num )throws NumberFormatException {
		
		int intNum=Integer.parseInt(num);
		System.out.println("입력 값 : "+ num+", 변환 값 : "+ intNum);
		
		return "day0109/useException";
	}//work
	
	@GetMapping("/exceptionHandle2")
	public String work( )throws NumberFormatException {
		
		if(new Random().nextBoolean()) {
			throw new NumberFormatException("내가 발생시킨 예외!!!");
		}//end if
		
		return "day0109/useException";
	}//work
	
	@GetMapping("/exceptionHandle3")
	public String work3( )throws SQLException {
		
		if(new Random().nextBoolean()) {
			throw new SQLException("SQL 예외!!!");
		}//end if
		
		return "day0109/useException";
	}//work
	
	@ExceptionHandler({ NumberFormatException.class, SQLException.class })
//	public ModelAndView exceptionHandle( NumberFormatException nfe) {
	public ModelAndView exceptionHandle( Exception nfe ) {
		nfe.printStackTrace();
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("/err/500");
		mav.addObject("msg", nfe.getMessage());
		
		return mav;
	}
	
	
	
}//class
