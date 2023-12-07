package ch09_array;

import java.util.Scanner;

public class Ex05_ArrayEx {
    public static void main(String[] args) {

                    String[] name = {"하민", "태양", "성훈", "유진"};
            /**
             * 위와 같은 배열이 있을 때 1~10 사이의 숫자 중에서 하나를
             * 입력했을 때 그 숫자가 몇 번 인덱스에 있는지 출력
             */

            Scanner sc = new Scanner(System.in);
            System.out.print("얘 으디사노 : ");
            String value = sc.nextLine();

            for (int i = 0; i < name.length; i++) {
                if (value.equals(name[i])) {
                    System.out.println(value + " 금마 " + i + "번방 산다.");
                }
            }
        }
    }


