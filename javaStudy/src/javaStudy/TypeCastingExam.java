package javaStudy;

// 기본형 타입 변환
public class TypeCastingExam {

	public static void main(String[] args) {
		// int -> long : 묵시적 형변환
		int x = 50000;
		long y = x;
		
		// long -> int : 강제 형변
		long x2 = 5;
		int y2 = (int) x2;

	}

}