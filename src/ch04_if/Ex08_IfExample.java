package ch04_if;

import java.util.Scanner;

public class Ex08_IfExample {

	public static void main(String[] args) {
		/**
		 * 서로 다른 정수 3개를 입력받아서 가장 큰 정수 출력하기 (같은 숫자는 입력하지 않는다고 가정) 입력 예 첫번째숫자: 두번째숫자:
		 * 세번째숫자:
		 * 
		 * 출력 예 가장 큰 숫자는 00입니다.
		 */

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("첫 번째 숫자를 입력하세요.");
		num1 = scanner.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		num2 = scanner.nextInt();
		System.out.println("세 번째 숫자를 입력하세요.");
		num3 = scanner.nextInt();
		int number = 0;

		if (num1 > num2) {
			if (num1 > num3) {
				number = num1;
			} else {
				number = num3;
			}
		} else if (num2 > num1) {
			if (num2 > num3) {
				number = num2;
			} else  {
				number = num3;
			}
		}
		System.out.println("The biggest number is " + number);
		System.out.println("hi");
	}

}
