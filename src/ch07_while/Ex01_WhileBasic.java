package ch07_while;

public class Ex01_WhileBasic {
    public static void main(String[] args) {
        //1~3까지 출력
        for (int i=1; i<=3; i++){
            System.out.println(" i =" + i);
        }



        int i = 10; // i가 10일땐 조건이 만족 안돼서 실행이 안됨.
        while (i<=3){
            System.out.println(" i = " + i);
            i++;
        }

        int j = 10; // do는 조건이 맞지 않아도 출력 j가 10이어도 일단 한 번은 출력.
        do {
            System.out.println("j = " +j);
            j++;
        } while ( j <=3);
        System.out.println("do while 종료 후 j = " + j);

        // 무한반복
        int k =1;
        while(true) {
            System.out.println("무한 반복~~" + k);
            k++;
            if(k==100){
                break;
            }
            System.out.println("브레이크 다음 문장");
        }

        int l = 1;
        boolean run = true;
        while (run) {
            System.out.println("l = " + l);
            l++;
            if(l==100){
                run = false;
            }
            System.out.println("run = false 다음 문장");
        }


    }
}
