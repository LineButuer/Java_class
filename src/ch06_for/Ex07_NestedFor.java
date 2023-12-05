package ch06_for;

import java.util.Scanner;

public class Ex07_NestedFor {
    public static void main(String[] args) {
        /**
         * 중첩 for문
         */
        System.out.println("구구단 시작");




        for(int a = 1; a <=9; a++) {
            System.out.println(a + " 단");
            for (int j = 1; j <= 9; j++) {

                System.out.print(a + " x " + j + " = " + (a * j) + " ");

            }System.out.println(" ");
        }


        }

    }

