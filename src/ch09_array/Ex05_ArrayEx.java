package ch09_array;

import java.util.Scanner;

public class Ex05_ArrayEx {
    public static void main(String[] args) {

        String[] name = {"하민", "태양", "성훈", "유진"};
        /**
         * 위와 같은 배열이 있을 때 1~10 사이의 숫자 중에서 하나를
         * 입력했을 때 그 숫자가 몇 번 인덱스에 있는지 출력
         */

//            Scanner sc = new Scanner(System.in);
//            System.out.print("얘 으디사노 : ");
//            String value = sc.nextLine();
//
//            for (int i = 0; i < name.length; i++) {
//                if (value.equals(name[i])) {
//                    System.out.println(value + " 금마 " + i + "번방 산다.");
//                }
//            }
        /**
         * 거스름돈 계산하기
         * 필요한 거스름돈을 입력했을 때 각 돈전별로 몇 개가 필요한지 계산
         * 예
         *      170 이라고 하면
         *      100원 1개
         *      50원 1개
         *      10원 2개
         *
         *      780원 이라고 하면
         *      500원 1개
         *      100원 2개
         *      50원 1개
         *      10원 3개
         */
        int[] coin = {500, 100, 50, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("가격을 입력하세요");


        int money = scanner.nextInt();

        // 거스름돈/동전 = 몫(갯수)
        for (int i = 0; i < coin.length; i++) {
            int result = money / coin[i];
            money = money % coin[i];

            System.out.println(coin[i] + " 원 " + result + "개");

            // 나머지를 다음 번 계산에 활용
        }
    }


}



