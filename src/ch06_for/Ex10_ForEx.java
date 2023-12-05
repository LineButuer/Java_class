package ch06_for;

import java.util.Scanner;

public class Ex10_ForEx {
    public static void main(String[] args) {


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
        }




    }
}
