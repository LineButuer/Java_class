package ch01_variables;

public class Ex01_Variables {

	public static void main(String[] args) {
		// 본인의 이름(name), 나이(age), 키(height), 주소(address), 전화번호(mobile)를 입력할 수 있는 변수를 각각 선언
		// 를 입력할 수 있는 변수를 각각 선언해봅시다.
		// 변수 선언
		// string; // 변수를 무조건 넣어줘야 함 
		String name = "이태양";
		int age = 30;
		double height = 165.5;
		String address = "인천 서구 이음6로 33";
		String mobile = "010-5436-9397";
		
		// 변수값 출력
		System.out.println("이름	: " + name +" / "+ age +" / " + height +" / "+address + " / " + mobile);
		System.out.println("나이	: " + age +" / " + height +" / "+address + " / " + mobile);
		System.out.println("키	: "+height +" / "+address + " / " + mobile);
		System.out.println("주소	: "+address + " / " + mobile);
		System.out.println("번호	: "+mobile);

	}

}
