package ch02_variables;

public class Ex05_IncreaseDecreaseOperaor {

	public static void main(String[] args) {
		// 증감연산자
		int num1=10, num2=0, num3=0;
		System.out.println(" num1: " + num1 + " num2: " + num2 + " num3: "+num3);
		num2 = ++num1;
		System.out.println(" num1: " + num1 + " num2: " + num2 + " num3: "+num3);
		num2 = ++num1;
		num3 = num1++; //계산이 끝나고 나서 증가 그러므로 num3 == 12가 됨
		System.out.println(" num1: " + num1 + " num2: " + num2 + " num3: "+num3);
	
		int result1 = num1++ + ++num2;
		System.out.println(" num1: " + num1 + " num2: " + num2 + " num3: "+num3);
		System.out.println(result1);
	
	
	
	}

}
