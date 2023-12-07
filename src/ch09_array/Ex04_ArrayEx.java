package ch09_array;

import java.util.Scanner;

public class Ex04_ArrayEx {
    public static void main(String[] args) {
        int num[] = {5, 2, 1, 3, 4, 7, 6, 9, 10, 8};
        Scanner scanner = new Scanner(System.in);

int b = 0;
        while (true) {
            int num1 = scanner.nextInt();
            int i = 0;
            for (i = 0; i < num.length; i++) {
                if (num[i] == num1) {

                    System.out.println(i);
                }

            }

        }
    }
}
