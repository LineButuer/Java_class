package ch06_for;

public class Ex03_ForEx {
    public static void main(String[] args) {
        /**
         * 1부터 10까지의 합계를 출력
         */
        int i = 0;
        int k = 0;
        for(i=1; i<=10; i++){
           //  k=k+i;
            k+=i;
            System.out.println("i = " + i);
            System.out.println("k = " + k);
        } System.out.println("for문 종료 후 " + k);



    }
}
