package kr.co.sist.day0107;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ParamDTO {
	private String name;
	private int age;
	private String[] hobby;
	private String ip,userAgent;
	
}
