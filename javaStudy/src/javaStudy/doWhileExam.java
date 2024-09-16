package javaStudy;

import java.util.Scanner;

public class doWhileExam {

	public static void main(String[] args) {
		int value = 0;
		// scanner: 어딘가에서 값을 입력받고 싶을 때 사용하는 변
		// System.in: 키보드 
		Scanner scan = new Scanner(System.in);
		
		do {
			// 반복할 문장들
			value = scan.nextInt();
			System.out.println("입력받은 값 :" + value);
			
		} while(value != 10);
		
		System.out.println("반복문 종료!!");
	}

}