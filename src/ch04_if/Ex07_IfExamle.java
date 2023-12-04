package ch04_if;

import java.util.Scanner;

public class Ex07_IfExamle {

	public static void main(String[] args) {
		/**
		 * 성적 출력 예제 응용
		 * 입력값 : 학년(year), 점수(score)
		 * 처리
		 * 	- 1~3학년은 60점 이상이면 합격
		 *  - 4학년은 70점 이상이어야 합격
		 */

		int score =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("학년을 입력하세요.");
		int year1 = scanner.nextInt();
		System.out.println("점수를 입력하세요.");
		score = scanner.nextInt();
		String year2 = "";
		
		

		if(year1 >=1 && year1 < 5 && score <= 100 && score >=0) {
			
			if(year1 ==4 && score >=70) {
			year2 = "합격";
		
			}else if(year1<4 && score >= 60) {
			year2 = "합격";
			
			}else {
			year2 = "불합격";
			}
			System.out.println("귀하는 " + year2+  "입니다.");
	
		}else {
		System.out.println("나띵.");
		
		}
	}
}
