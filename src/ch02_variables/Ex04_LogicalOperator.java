package ch02_variables;

public class Ex04_LogicalOperator {

	public static void main(String[] args) {
		// 논리연산자
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true || false);

		
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = true;
		bool2 = bool3;
		
		boolean result = bool1 && bool2;
		
		
		
		
		System.out.println(result);
		// num1, num2 정수형 변수에 각각 10, 20을 대입하여 선언하고
		// num1 > num2 결과를 result1 에 저장하고
		// num1 != num2 결과를 resul2 에 저장해서
		// result1 && result2 결과를 result3 에 저장한 뒤 
		// result3의 값을 출력
		
		int num1 =10, num2= 20;
		
		boolean result1 = num1 > num2;
		boolean result2 = num1 != num2;
		
		boolean result3 = result1 && result2;
		
		System.out.println(result3);
		
	
 }

}
