package ch10_class.ex7;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        /**
         * 실행하면 반복문으로 메뉴를 출력
         * 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈
         * 각 번호를 선택하면 Calculator 클래스에 있는 해당 메서드를 호출하여 결과를 출력함
         */

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        int i = 0;
        int a = 0;
        int b = 0;
        int selectNo;
        while (run) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4.나눗셈");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();


                if (selectNo == 1) {

                    calculator.sum(a = scanner.nextInt(), b = scanner.nextInt());

                } else if (selectNo == 2) {

                    calculator.sub(a = scanner.nextInt(), b = scanner.nextInt());

                } else if (selectNo == 3) {
                    calculator.mul(a = scanner.nextInt(), b = scanner.nextInt() );
                    int result  = calculator.mul(a, b);
                    System.out.println("result = " + result);
                } else if (selectNo == 4) {
                    int result = calculator.dlv();
                    System.out.println("result = " + result);


            }
        }


    }
}

