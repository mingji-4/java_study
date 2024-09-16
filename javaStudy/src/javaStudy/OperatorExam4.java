package javaStudy;

// 논리연산자   
public class OperatorExam4 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		// 논리곱 
		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		
		// 논리합 
		System.out.println(b1 || b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b2);
		
		int score = 68;
		if(score <= 100 && score >= 70) {
			System.out.println("성공");
		} else {
			System.out.println("실");
		}
		
		// 배타적 논리합 
		System.out.println(b1 ^ b2);
		System.out.println(b1 ^ b3);
		
		// 논리 부정 
		System.out.println(!b1);
	}

}