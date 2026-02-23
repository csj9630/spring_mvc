package kr.co.sist.day0109;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 * Spring에서 파일 업로드 실습.
 */
@RequestMapping("/day0109")
@Controller
public class FileController {
	
	//propertie 설정 파일에 있는 업로드 디렉토리 설정 경로값을 가져온다.
	@Value("${user.upload-dir}")
	private String upload_dir;
	
	
	@GetMapping("/uploadFrm")
	public String uploadFrm() {
		return "/day0109/uploadFrm";
	}//uploadFrm
	
	/**
	 * Form 태그로 입력 받은 파일 데이터를 업로드하기
	 * @param mf 업로드 파일
	 * @param fDTO 파일 외 데이터의 DTO
	 * @return uploadResult.jsp로 결과창
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@PostMapping("/uploadFrmProcess")
	public String uploadFrmProcess(@RequestParam(value="upFile")   MultipartFile mf,
			FileDTO fDTO, Model model) throws IllegalStateException, IOException {
		System.out.println("===========File Upload Result=============");
		System.out.println(upload_dir );
		System.out.println(mf.getContentType());
		System.out.println(mf.getName());
		System.out.println(mf.getOriginalFilename());
		System.out.println(mf.getSize());
		System.out.println(mf.isEmpty());
		System.out.println("==========================================");
		
//		String fileName = System.currentTimeMillis()+"-"+ mf.getOriginalFilename();
		String fileName = UUID.randomUUID()+"-"+ mf.getOriginalFilename();
//		File upFile=new File("C:/dev/workspace/spring_mvc/src/main/resources/static/upload/"+fileName);
		File upFile=new File(upload_dir+fileName);
				
		mf.transferTo(upFile);//파일 업로드 수행
		
		
		//FileDTO에 업로드된 파일명을 설정
		fDTO.setUpFileName(fileName);
		
		model.addAttribute("fDTO", fDTO);
		
		
		
		return "/day0109/uploadResult";
	}//uploadFrmProcess
	
	
	@GetMapping("/imgView")
	public String fileView(String img) {
		return "/day0112/imgView";
	}//fileView
	
	/**
	 * 여기 컨트롤러에서 예외 처리 발생 시
	 * 지정한 오류 화면(500.jsp) 띄우고 예외 처리.
	 * @param ie
	 * @return
	 */
	@ExceptionHandler(IOException.class)
	public ModelAndView exceptionHandle(IOException ie) {
		ModelAndView mav = new ModelAndView();
		
		ie.printStackTrace();
		
		mav.setViewName("/err/500.jsp");
		mav.addObject("msg",ie.getMessage());
		return mav;
	}//
}//class
