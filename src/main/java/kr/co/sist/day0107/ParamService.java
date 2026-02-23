package kr.co.sist.day0107;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ParamService {
	public void businessLogic(ParamDTO pDTO) {
		System.out.println("업무로직 처리 : "+pDTO);
	}
	
	public List<ParamDTO> searchParam(){
		List<ParamDTO> list = new ArrayList<ParamDTO>();
		list.add(new ParamDTO("민병조",20 ,new String[] {"운동","유튜브"},null,null));
		list.add(new ParamDTO("박제영",24 ,new String[] {"독서","등산"},null,null));
		list.add(new ParamDTO("임성우",21 ,new String[] {"게임","영화","음악"},null,null));
		list.add(new ParamDTO("이지원",25 ,new String[] {"3d","4d","5d"},null,null));
		list.add(new ParamDTO("최승준",29 ,new String[] {},null,null));
		
		return list;
	}//
	
}//class
