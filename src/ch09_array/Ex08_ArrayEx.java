package ch09_array;

import java.util.Scanner;

public class Ex08_ArrayEx {
    public static void main(String[] args) {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        int[] std = null;
        std = new int[3];
        int[] score = null;
        score = new int[3];
        int temp = 0;
        boolean run = true;
        int i = 0;
        int j = 0;
        while (run) {
            System.out.println("1.학생수 입력  2.점수 입력  3.점수 목록  4.분석  5.종료");
            System.out.print("선택 - ");
            a = scanner.nextInt();

            if (a == 5) {
                run = false;
                System.out.println("시스템 종료");
            } else if (a == 1) {
                System.out.print("학생 수 - ");
                std[i] = scanner.nextInt();
            } else if (a ==2){
                for (i=0; i< std.length; i++){
                    System.out.print(i+1 + " 번 학생 점수");
                    score[i]=scanner.nextInt();
                }
            }else if (a == 3) {

                for (i = 0; i < score.length; i++) {
                    for (j = i + 1; j < score.length; j++) {
                        if (i > j) {
                            temp = score[i];
                            score[i] = score[j];
                            score[j] = temp;
                        }
                    }
                    System.out.println((i + 1) + " 번 " + "학생 점수 " + score[i]);
                }
            }else if (a ==4){

            }
        }
    }
}
