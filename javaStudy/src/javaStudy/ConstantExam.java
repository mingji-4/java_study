package javaStudy;

// 상수 : 한 번 저장한 값을 변경할 수 없음 
public class ConstantExam {

	public static void main(String[] args) {
		// 변수 
		int i;
		i = 10;
		i = 5;
		// 변수 결과 => 마지막 값인 5가 출력 
		
		// 상수 : 대문자로 사용하기 , 단어와 단어 사이를 언더바로 구분 
		final int J;
		J = 10;
		// J = 5; 다른 값 불가능 
		
		double circleArea;
		final double PI = 3.14159;
		circleArea = 3 * 3 * PI;
		
		final int OIL_PRICE = 1450;
		int totalPrice = 50 * OIL_PRICE;

	}

}
