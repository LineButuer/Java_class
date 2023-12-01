package ch02_variables;

public class Ex02_ComparisonOperator {

	public static void main(String[] args) {
		System.out.println(10>5);
		System.out.println(5>10);
		
		boolean result = 60 < 40;
		System.out.println(result);
		result = (8 == 100);
		System.out.println(result);
		
		result = false;
		boolean bool1 = true;
		System.out.println(result);
		result = bool1;
		System.out.println(result);
		System.out.println(bool1);
	}

}
