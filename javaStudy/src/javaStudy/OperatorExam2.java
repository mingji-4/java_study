package javaStudy;

// 비교연산자 
public class OperatorExam2 {

	public static void main(String[] args) {
		// 단순 대입연산자 
		int i = 10;
		int j = 10;
		
		System.out.println(i == j);
		System.out.println(i != j);
		System.out.println(i < j);
		System.out.println(i <= j);
		System.out.println(i > j);
		System.out.println(i >= j);
		
		// 복합 대입연산자
		i += 10;  // i = i + 10;
		System.out.println(i);
		
		System.out.println(i -= 5);
		System.out.println(i);
	}

}