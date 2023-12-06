package ch07_while;

import java.util.Scanner;

public class Ex05_WhileEx {
    public static void main(String[] args) {
        /**
         * random()매서드를 이용해서 1~100 사이의 숫자를 하나 만들고
         * 반복문 안에서 해당 숫자를 맞출 때까지 계속 숫자를 입력 받도록 하고
         * 숫자를 맞추면 종료하고 몇 번만에 맞췄는지를 출력해줌
         *
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("1부터 10 까지의 숫자를 입력하세요.");
//        int a = scanner.nextInt();
//        int b = (int)(Math.random()*10+1);
//        int i = 0;
//        boolean run =true;
//
//        while (run){
//            i++;
//            if(a!=b){
//                System.out.println("1부터 10 까지의 숫자를 입력하세요.");
//                a = scanner.nextInt();
//            }else{
//                run = false;
//                System.out.println("맞췄습니다.");
//                System.out.println("당신의 도전 횟수는 " + i + "번 입니다.");
//            }
//
//        }

        Scanner scanner = new Scanner(System.in);
        int input = 0, count = 0;
        boolean run = true;
        System.out.println("up&down");
        int answer = (int)(Math.random()*100+1);
        while (run){
            count++;
            System.out.println("숫자를 입력하세요.");
            input = scanner.nextInt();
            if(input > answer){
                System.out.println("더 작은 수를 입력하세요.");

            } else if (input<answer) {
                System.out.println("더 큰 수를 입력하세요.");
            } else {
                System.out.println("정답입니다.");
                System.out.println("당신은 " + count + " 번 시도하셨습니다.");
            run = false;
            }

        }






    }
}
