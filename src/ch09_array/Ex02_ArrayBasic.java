package ch09_array;

public class Ex02_ArrayBasic {
    public static void main(String[] args) {
        int i = 0;
        int[] numbers1 = {10, 20, 30, 40, 50};
        // 배열 데이터를 출력
        System.out.println("numbers1[0] = " + numbers1[0]);
        System.out.println("numbers1[1] = " + numbers1[1]);
        System.out.println("numbers1[2] = " + numbers1[2]);
        System.out.println("numbers1[3] = " + numbers1[3]);
        System.out.println("numbers1[4] = " + numbers1[4]);

        // for문을 이용해서 배열 데이터 출력
        int sum = 0;
        int avg = 0;
        for (i=0; i< numbers1.length; i++ ){
            System.out.println("numbers1 " + i + " = " +  + numbers1[i]);

            sum = sum + numbers1[i];
            avg = sum / numbers1.length;
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + (double)avg);
        // number1에 저장된 모든 데이터의 총합, 평균 계산







    }
}
