package javaStudy;

public class forExam {

	public static void main(String[] args) {
		int total = 0;
	
		for(int i = 1; i <= 100; i++) {
//			if(i % 2 != 0) {
//				continue;
//				// continue: 그 아래에 해당하는 구문을 실행하는 것이 아니라 그 위에 있는 구문을 실행
//			}
			
			total = total + i;
			if(i == 50) {
				break;
			}
		}
		
		System.out.println(total);
	}

}