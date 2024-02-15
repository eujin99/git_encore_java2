import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;

/*
 List 계열의 자료구조는 순서가 있고(내부적으로 인덱스를 0 ~ 관리), 중복 허용, 객체를(Object 상속받는 타입) 담으며, 동적이다.
 Set  계열의 자료구조는 순서가 없고, 중복 허용, 객체를(Object 상속받는 타입) 담으며, 동적이다.
*/
public class ListDemoMain {

	public static void main(String[] args) {
		
		// List<Person> col01 = new ArrayList()  ;
		
		List<Person> col01 = new Vector()  ;
		// col01.add("A") ;
		// col01.add("B") ;
		// col01.add(1) ; -- error 제너릭스 문법을 적용하면 타입의 안정성 체크로 컴파일시 오류
		
		col01.add( new StudentDTO() ) ; 
		col01.add( new StudentDTO() ) ;
		col01.add( new TeacherDTO() ) ; 
		
		System.out.println("배열의 길이는 length , 자료구조는 size() : " + col01.size() )   ; 
		System.out.println("데이터를 가져온다면 : " + col01.get(0)+ "\t" + col01.get(1) ) ;
		System.out.println("제너릭스 문법을 적용하지 않을 때 반환되는 타입은 Object "); 
		System.out.println("런 타임 시점에 객체에 접근하기 위해서는 캐스팅이 필요 ");
		System.out.println("데이터를 가져온다면 : " + ((StudentDTO)col01.get(0)).personInfo() ) ; 
		System.out.println("데이터를 가져온다면 : " + col01.get(0).personInfo() ) ;
		System.out.println("데이터를 가져온다면 : " + col01.get(2).personInfo() ) ; 
		
				
		List<String> col02 = new LinkedList() ; 
		col02.add("B");
		col02.add("C");
		col02.add("D");
		System.out.println( col02.get(1) ) ;
		
		
		Set<String> col03 = new HashSet() ; 
		col03.add("C");
		col03.add("C");
		col03.add("C");
		System.out.println(col03);
		
	}

}


