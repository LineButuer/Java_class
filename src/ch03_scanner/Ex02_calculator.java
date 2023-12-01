package ch03_scanner;

import java.util.Scanner;

public class Ex02_calculator {

	public static void main(String[] args) {
		/**
		 * 정수 2개를 각각 스캐너로 num1, num2에 입력 받아서 입력받은 수의 합을 출력하세요.
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num1 = scanner.nextInt();
	    int num2 = scanner.nextInt();
		int sum = num1 + num2;
		System.out.println(num1 +"+"+ num2 + " = " + (sum)) ;
	
	
	
		System.out.print("이름을 입력하세요: ");
		String name = scanner.next();
		System.out.println(name);
		
		scanner.nextLine();

		System.out.print("주소를 입력하세요: ");
		String address = scanner.nextLine();
		System.out.println(address);
		
		
	}

}
