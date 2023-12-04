package ch04_if;

import java.util.Scanner;

public class Ex05_IfExample {

	public static void main(String[] args) {
		/**
		 * 정수 하나를 입력 받아서 양수, 음수, 0인지를 출력
		 */

		int num1 = 0;
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		String what ="";
		if (num1 > 0) {
			what = "양수";
		} else if(num1 == 0) {
			what = "0";
		} else {
			what = "음수";
		}
		System.out.println("값은" + what + "입니다.");
		
		
		
		
		
		
	}

}
