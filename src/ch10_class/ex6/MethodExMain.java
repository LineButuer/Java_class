package ch10_class.ex6;

import java.util.Arrays;

public class MethodExMain {
    public static void main(String[] args) {
        MethodEx methodEx = new MethodEx();
        System.out.println("호출 전");
        // method 호출
        methodEx.method1();
        System.out.println("호출 후");
        // method2 호출
        methodEx.method2("10");
        String str1 = "오늘은 화요일";
        methodEx.method2(str1);

        // method3 호출
        String result = methodEx.method3();
        System.out.println("result = " + result);
        System.out.println(methodEx.method3());

        int result1 = methodEx.method4();
        System.out.println("result1 = " + result1);

        String result3 = methodEx.method5("값", 20);
        System.out.println("result3 = " + result3);

        int result2 = methodEx.method6(3000000, 500000000);
        System.out.println("result2 = " + result2);

    }
}




