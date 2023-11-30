package ch02_variables;

public class Ex01_ArithmeticOperator {

	public static void main(String[] args) {
		// 산술연산자
		/**
		 * num1, num2 두 개의 정수형 변수를 선언하고 값은 마음대로
		 * 두 변수의 +, -, *, /, % 연산결과를 print()를 활용하여 출력해봅시다.
		 * 출력방법
		 * System.out.println(num1 + num2)
		 */
		int num1 = 29, num2 = 30;
		
		System.out.println(num1+num2 + "->" + "덧셈" );
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
	
	
		int sumResult = num1 + num2;
		System.out.println(sumResult);
		
		int subResult = num1 - num2;
		System.out.println(subResult);
		
		int mulResult = num1 * num2;
		System.out.println(mulResult);
		
		int divResult = num1 / num2;
		System.out.println(divResult);
		
		int remainResult = num1 % num2;
		System.out.println(remainResult);
		
		boolean a = true;
		System.out.println(!a);
	
		String name = "이태양";
		
		System.out.println(name);
	}

}
