package kr.co.sist;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * WebMvcConfigurer : 정적 리소스 매핑, 인터셉터 등록, CORS 설정 등이 가능함
 * 배포 후에도 HDD 파일에 접근할 수 있게 매핑.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	
	//propertie 설정 파일에 있는 업로드 디렉토리 설정 경로값을 가져온다.
	@Value("${user.upload-dir}")
	private String uploadDir;

	/**
	 *HDD의 경로를 Web Broswer에서 인식할 수 있도록 정적 리소스 매핑
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		registry.addResourceHandler("/upload/**").addResourceLocations("file:///"+uploadDir);
		//웹브라우저에서 사용할(매핑할) 이름 : 정적 리소스로 컨트롤러를 안 거치고 서비스된다.
		//HDD의 실제 경로 : file 프로토콜로 이 디렉터리를 건드리겠다.
		//file 프로토콜(운영체제에서 파일에 접근할 때 사용하는 프로토콜)
	}

}//class
