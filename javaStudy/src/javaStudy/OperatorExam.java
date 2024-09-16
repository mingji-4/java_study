package javaStudy;

// 산술연산자 
public class OperatorExam {

	public static void main(String[] args) {
		// 부호 연산자 
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		// 증감 연산자 
		int i4 = ++i3;  // i3 = i3 + 1;
		System.out.println(i4);
		System.out.println(i3);
		int i5 = i3++;  // i3 = i3 + 1;
		System.out.println(i5);
		System.out.println(i3);
		
		
		// 변수 2개를 이용한 산술연산 
		int i = 5;
		int j = 2;
		
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		
		// 실수 연산 
		System.out.println(i / (double)j);
		
		// 모듈러 연산 
		System.out.println(i % j);
	}

}
