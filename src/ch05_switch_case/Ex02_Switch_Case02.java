package ch05_switch_case;

import java.util.Scanner;

public class Ex02_Switch_Case02 {
    public static void main(String[] args) {
        /*
        switch case 를 이용한 간단한 사전
        이 사전에는 딱 4개의 단어만 들어 있음.
        desk(책상), chair(의자), monitor(모니터), mouse(마우스)

        프로그램을 실행 하면 영어 단어를 입력 받고 위의 네 단어중 하나를 입력 했을 때 해당 의미를 출력 해줌.
        사전에 없는 단어를 입력 하면 사전에 없는 단어 입니다 라고 출력.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("단어를 입력하세요");
        String word = scanner.next();


    switch (word){
        case "책상":
           word ="desk.";
            break;
        case "의자":
            word = "chair.";
            break;
        case "모니터":
            word = "monitor.";
            break;
        case "마우스":
            word = "mouse.";
            break;
        default:
            word = "이해할 수 없습니다.";

    }
        System.out.println(word);








    }
}
