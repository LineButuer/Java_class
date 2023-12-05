package ch06_for;

import java.util.Scanner;

public class Ex05_ForEx {
    public static void main(String[] args) {
        /**
         * 두 개의 정수를 입력받아서 시작값부터 끝값까지의 합계 출력
         * 입력 예
         *  시작값 : 110
         *  끝값 : 555
         *  출력 예
         *  110 부터 555 까지의 합은 000 입니다.
         *
         */

        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        System.out.println("첫 번째 숫자를 입력하세요.");
        num1 = scanner.nextInt();
        System.out.println("두 번째 숫자를 입력하세요.");
        num2 = scanner.nextInt();

        for( int i = num1; i <= num2;  i++){
            sum = sum+i;
            if(i < num2){
                System.out.print(i + " + ");
            }else{
                System.out.print(i + " = ");
            }

        }System.out.println(sum);


    }
}
