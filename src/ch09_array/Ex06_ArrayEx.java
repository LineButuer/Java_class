package ch09_array;

import java.util.Scanner;

public class Ex06_ArrayEx {
    public static void main(String[] args) {
        /**
         * 크기가 5인 정수형 배열을 선언하고
         * 스캐너로 배열에 값을 저장한 뒤
         * 입력된 값 중에서 가장 큰 값을 출력
         */

//        int[] numbers1 = null;
//        numbers1 = new int[5];
//        int a = 0;
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < numbers1.length; i++) {
//            numbers1[i] = scanner.nextInt();
//            if (numbers1[i] > a) {
//                a = numbers1[i];
//            }
//
//
//        }
//        System.out.print(a);
//        int[] numbers2 = {1, 2, 3, 4, 5};
//
//        for (int i=0; i < numbers2.length; i++){
//            if ( numbers1[i] > numbers2[i] || numbers1[i] < numbers2[i]){
//                numbers1[i] = numbers2[i];
//            }
//            System.out.print("numbers1 = " + numbers1[i]);
//        }

        int[] numbers1 = {3, 2, 1, 5, 4};
        int temp = 0; // swap을 위한 중간 변수
        //중첩 for를 이용하여 정렬하기
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = i +1; j < numbers1.length; j++){
                if (numbers1[i] > numbers1[j]) {
                    temp = numbers1[i];
                    numbers1[i] = numbers1[j];
                    numbers1[j] = temp;
                }
            }
            System.out.println(numbers1[i]);
        }
    }
}
