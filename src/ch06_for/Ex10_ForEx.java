package ch06_for;

import java.util.Scanner;

public class Ex10_ForEx {
    public static void main(String[] args) {
        /**
         * 정수를 하나 입력 받고
         * 1부터 입력 받은 정수까지의 정수 중에서
         * 2의 배수, 3의 배수를 제외한 수의 총 합 출력
         *
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("해위~ 숫자를 넣어 주세요");
        int i = scanner.nextInt();
        int sum = 0;
        int y = 0;
//        for(int x = 1; x<=i; x++){
//            if(x%2==0 || x%3==0){
//                y=y+x;
//            }sum = sum+x;
//        } System.out.println(sum-y);

        for(int x = 1; x<=i; x++){
            if(x%2!=0 && x%3!=0){
                sum = sum+x;
            }
        } System.out.println(sum);


    }
}
