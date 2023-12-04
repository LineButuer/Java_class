package ch04_if;

import java.util.Scanner;

public class Ex06_IfExample {

	public static void main(String[] args) {
		/**
		 * 정수 하나를 입력받아서
		 * 3의 배수인지, 5의 배수인지 또는 3과 5의 공배수인지, 아무것도 아닌지를 출력
		 */

		int num1 =0;
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		String what = "";
		
		
		if(num1%3 ==0 && num1%5==0) {
			what ="3과 5의 공배수";
		}else if(num1%3==0) {
			what = "3의 배수";
		}else if(num1%5==0) {
			what = "5의 배수";
		}else {
			what = "그 외";
		}
		System.out.println("이 값은 " + what + "입니다.");
	
		
	}

}
