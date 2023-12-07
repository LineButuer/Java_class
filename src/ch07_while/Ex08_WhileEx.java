package ch07_while;

import java.util.Scanner;

public class Ex08_WhileEx {
    public static void main(String[] args) {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int money = 0;
        int sum = 0;
        int b = 0;


        while (run) {
            System.out.println("1.예금  2.출금  3.잔고  4.종료");
            System.out.print("선택 - ");
            a = scanner.nextInt();
            if (a == 4) {
                run = false;
                System.out.println("종료합니다.");
            }else if (a == 3) {
                System.out.println("현재 잔액는 " + sum + " 입니다.");
            }else if (a == 2) {
                System.out.print("출금액 - ");
                b = scanner.nextInt();
               if(sum<b){
                   System.out.println("출금할 금액이 잔액 보다 많습니다.");
                   System.out.println("현재 잔액은 "+sum+" 입니다.");
               }else{
                sum = (sum - b);
                System.out.println("현재 잔액은 " + sum + "입니다.");}
            }
            else if (a == 1) {
                System.out.print("입금 금액 ");
                money = scanner.nextInt();

                sum = (money+sum);
                System.out.println("현재 잔액은 " + sum + " 입니다.");

            }
            else{
                System.out.println("입력한 값의 범위를 넘었다 새끼야");
            }
        }

    }
}
