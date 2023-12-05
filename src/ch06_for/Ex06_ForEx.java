package ch06_for;

import java.util.Scanner;

public class Ex06_ForEx {
    public static void main(String[] args) {
        /**
         * 1부터 100까지의 숫자 중에서 3의 배수만 출력하고 합계도 구하기
         *
         */

        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("첫 번째 숫자를 입력하세요.");
        num1 = scanner.nextInt();
        System.out.println("두 번째 숫자를 입력하세요.");
        num2 = scanner.nextInt();


        int sum = 0;
        for(int i = num1; i<=num2; i++){
            if(i%3==0){
                System.out.println
                        ("i = " +i );
                sum = sum+i;
            }
        }
        System.out.println("sum = " + sum);

    }
}
