package ch07_while;

import java.util.Scanner;

public class Ex06_WhileEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 숫자 입력용 변수
        int num = 0;
        // 합계용 변수
        int sum = 0;
        // 갯수용 변수
        int count = 0;
        boolean run = true;
        System.out.println("정수를 입력하고 마지막에 0을 입력하세요 : ");
        while (run) {
            num = scanner.nextInt();
            System.out.println("num = " + num);
            if (num == 0) {
                run = false;
            } else {
                // 합계 계산
                sum += num;
                // 입력된 숫자 갯수 +1
                count++;
            }
        }
        int avg1 = sum / count;
        System.out.println("avg1 = " + avg1);
        double avg2 = sum / count;
        System.out.println("avg2 = "+ avg2);
        double avg3 = (double) sum / count;
        System.out.println("avg3 = " + avg3);

//        boolean run2 = true;
//        boolean run = true;
//        int count = 0;
//        int sum = 0;
//        int avg = 0, a = 0;
//        //스페이스바 할때마다 반복문 새로 만들어짐.


//        while (run2) {
//            System.out.println("정수를 입력하고 마지막에 0을 입력하시요");
//            count = 0;
//            while (run) {
//                a = scanner.nextInt();
//                sum += a;
//                if (a != 0) {
//                    count++;
//                } else {
//                    run = false;
//                    avg = sum / count;
//                    System.out.println("입력한 숫자는 " + count + "입니다.");
//                    System.out.println("평균은 " + avg + "입니다.");
//
//                }
//            }run = true;


    }
}





