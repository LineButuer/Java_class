package ch09_array;

import java.util.Scanner;

public class Ex07_ArrayEx {
    public static void main(String[] args) {
        /**
         * 스캐너로 입력 받은 숫자의 크기를 갖느 배열을 만들어 봅시다.
         * 예를 들어 5를 입력하면
         * 크기가 5인 배열이 만들어져야함.
         *
         */


        int[] numbers  = null;
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("몇 칸짜리 배열을 만들꺼여");
        numbers = new int[size];
        if(size>0){

            System.out.println("numbers = " + numbers.length);
        } else{
            numbers = null;
    }
        System.out.println("numbers = " + numbers.length);



    }
}
