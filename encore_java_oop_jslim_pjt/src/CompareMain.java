import java.util.Comparator;

import com.encore.compare.Teacher;

public class CompareMain {

	public static void main(String[] args) {
		/*
		 * 기본타입은 크기를 비교하여 정렬할 수 있다.
		 * 객체를 비교할 때는 Comparable(compareTo(T)) vs Comparator(compare(T , T)) 
		 * 해당 비교를 통해서 객체 정렬 할 수 있는 것.
		 * 객체를 비교하기 위해서는 우선 기준을 잡아야 함.(객체가 소유하고 있는 변수를 선정) 
		 * 객체는 Comparable 또는 Comparator 인테페이스를 구현하고 메서드 오버라이딩 해야함.
 		 */
		/* 기본 데이터 타입은 연산자를 통해서 쉽게 비교할 수 있지만 객체는 어떻게 비교할까요?
		
		int x = 1 ; 
		int y = 2 ; 
		if(x > y) {
			System.out.println(-1);
		} else if( x == y) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
		*/
		
		Teacher tea01 = new Teacher(20, 5);
		Teacher tea02 = new Teacher(30, 2);
		
		Teacher tea03 = new Teacher(Integer.MAX_VALUE, Integer.MAX_VALUE); 
		
		// int flag = tea01.compareTo(tea02) ;
		/*
		int flag = tea03.compare(tea01, tea02) ; 
		if( flag == 1) {
			System.out.println("양수가 리턴되었을 때 ");
			System.out.println("오름차순 정렬이라면 자리 변경 필요하고, 내림차순 정렬이라면 자리 변경이 없음"); 
		} else if(flag == 0 ) {
			System.out.println("0 리턴되었을 때 ");
			System.out.println("데이터가 같음");
		} else {
			System.out.println("음수가 리턴되었을 때 ");
			System.out.println("오름차순 정렬이라면 자리 변경 필요없고, 내림차순 정렬이라면 자리 변경이 필요");
		}
		*/
		
		// Thread 익명의 클래스, 람다식
		Comparator<Teacher> comp = new Comparator<Teacher>() {
			@Override
			public int compare(Teacher obj01, Teacher obj02) {
				if (obj01.getAge() > obj02.getAge()) {
					return 1 ; 
				} else if( obj01.getAge() == obj02.getAge()) {
					return 0 ;
				} else {
					return -1 ;
				}
			}
		};
		int flag = comp.compare(tea02, tea03) ; 
		if( flag == 1) {
			System.out.println("양수가 리턴되었을 때 ");
			System.out.println("오름차순 정렬이라면 자리 변경 필요하고, 내림차순 정렬이라면 자리 변경이 없음"); 
		} else if(flag == 0 ) {
			System.out.println("0 리턴되었을 때 ");
			System.out.println("데이터가 같음");
		} else {
			System.out.println("음수가 리턴되었을 때 ");
			System.out.println("오름차순 정렬이라면 자리 변경 필요없고, 내림차순 정렬이라면 자리 변경이 필요");
		}
		
		// System.out.println("만약 기준을 여러개 잡고 싶다면? (나이를 기준으로 동일하다면 반을 기준으로 정렬) ") ;
		
	}
}











