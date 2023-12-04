package ch06_for;

public class Ex02_ForEx {
    public static void main(String[] args) {
        //1~10 까지 순서대로 출력
        //2~4 까지 순서대로 출력
        //54321 출력



        int i = 1;
        for(i = 1; i <=10; i++){
            System.out.println("i = " + i);
        }

        int j =2;
        for(j=2; j<=10; j+=2){
            System.out.println("j = " +j);
        }

        int k=5;
        for(k=5; k>=1; k--){
            System.out.println("k = " +k);
        }
    }
}
