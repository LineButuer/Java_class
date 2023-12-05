package ch06_for;

import java.util.Scanner;

public class Ex07_NestedFor {
    public static void main(String[] args) {
        /**
         * 중첩 for문
         */

        int i = 0;
        int j = 0;

        for (i = 1; i <= 9; i++) {
            System.out.println(i + " 단 ");
            for (j = 1; j <= 9; j++) {
                if (j < 9) {
                    System.out.print(i + "x" + j + " = " + (i * j) + "  ");
                } else {
                    System.out.println(i + "x" + j + " = " + (i * j));
                    System.out.println("\t");
                }

            }

        }


    }

}

