package javaStudy;

// 연산자 우선순위  
public class OperatorExam3 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 15;
		
		// *
		System.out.println(a - b * c);
		// ()
		System.out.println((a - b) * c);
		
		// &&: 양쪽이 모두 true일 때만 true를 반환 
		System.out.println(a > 5 && b > 5);
		// ||: 한쪽만 true여도 true를 반환 
		System.out.println(a > 5 || b > 5);
		 
		System.out.println(++a - 5);
		System.out.println(a);
		
		System.out.println(a++ - 5);
		System.out.println(a);
	}

}