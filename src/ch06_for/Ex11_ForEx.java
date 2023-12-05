package ch06_for;

public class Ex11_ForEx {
    public static void main(String[] args) {
        /**
         * 별찍기
         * 출력
         * *
         * **
         * ***
         * ****
         * *****
         *
         */
        int i = 0;
        int j = 0;
        int sum=0;
        String star = "*";
        for(i=0; i<=10; i++){
           for(j=0; j<i; j++){

               System.out.print(star);
            } System.out.println(" ");

        }


    }
}
