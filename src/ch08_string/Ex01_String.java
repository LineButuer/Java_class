package ch08_string;

import java.util.Scanner;

public class Ex01_String {
    public static void main(String[] args) {
//        String str1 = "안녕";
//        String str2 = "안녕";
//        String str3 = new String(  "안녕");
//    //str1, str2 같은지
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println(str1.equals((str3)));


        String talk = "";
        // 프로그램을 종료하는 키워드인 종료가 절대로 바뀌지 않을 경우
        boolean run = true;
        final String Exit = "종료";
        //final 키워드를 붙인 변수는 변수값을 바꿀 수 없음.
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("메세지를 입력하세요.");
//        System.out.println("프로그램을 종료하려면 '종료'를 입력하세여");
//
//        while(run){
//            talk = scanner.next();
//            System.out.println(talk);
//            if(talk.equals(Exit)){
//                run = false;
//                System.out.println("종료");
//            }
//        }

        System.out.println("메세지를 입력하세요");
        System.out.println("종료를 입력하면 종료됩니다.");
        do{
            System.out.print(">");
            talk = scanner.nextLine();
            System.out.println(talk);
            if(talk.equals(Exit)){
                run=false;
            }
        }while(run);




    }
}
