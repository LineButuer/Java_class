package ch06_for;

public class Ex01_ForBasic {
    public static void main(String[] args) {
       int i = 1;
       int j = 1;
        for(i = 1; i <=9; i++){
            for(j = 1; j<=9; j++){
                System.out.println(i*j);
            }
            System.out.println(i + "단");
        }
    // 반복 변수 초기값이 조건을 만족하지 않는다면

    for(int a = 10; a <= 4; a++){
        System.out.println("보이나요?");
        System.out.println("a = " + a);
    }
    // 반복문 종료 후에도 반복변수를 사용하려면
        int k = 0;
        for ( k = 0; k < 3 ; k++) {
            System.out.println("k = " + k);
        }
        System.out.println("반복문 종료 후 k = " + k);

    }
}
