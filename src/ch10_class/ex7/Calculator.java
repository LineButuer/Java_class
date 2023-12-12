package ch10_class.ex7;

import java.util.Scanner;

public class Calculator {


    /**
     * 덧셈 메서드
     * method name: sum
     * parameter: int 타입 2개
     * return: x
     * 실행내용
     *  - 매개변수로 전달 받은 2개 값의 합을 출력
     */

    public void sum (int param1, int param2){
        int result = param1 + param2;
        System.out.println("result = " + result);
    }


    /**
     * 뺄셈 메서드
     * method name: sub
     * parameter: int 타입 2개
     * return: x
     * 실행내용
     *  - 매개변수로 전달 받은 2개 값의 차를 출력
     */

    public void sub(int param3, int param4){
        System.out.println("param3 = " + param3 + ", param4 = " + param4);
        int result = param3 - param4;
        System.out.println("result = " + result);
    }




    /**
     * 곱셈 메서드
     * method name: mul
     * parameter: int 타입 2개
     * return: int 타입
     * 실행내용
     *  - 매개변수로 전달 받은 2개 값의 곱 결과를 리턴
     */


    public int mul (int param, int param2 ){


        System.out.println("param * param2 = " +(param* param2));
    return param * param2;}



        /**
         * 나눗셈 메서드
         * method name: div
         * parameter: 없음
         * return: int 타입
         * 실행내용
         *  - 스캐너로 나눗셈에 필요한 정수 2개를 입력받음
         *  - 나눗셈 결과를 리턴
         */

    public int dlv() {

            Scanner scanner = new Scanner(System.in);


        int div1 = scanner.nextInt();
        int div2 = scanner.nextInt();
        return div1/div2;
        }









    }




    /**
     * 나눗셈 메서드
     * method name: div
     * parameter: 없음
     * return: int 타입
     * 실행내용
     *  - 스캐너로 나눗셈에 필요한 정수 2개를 입력받음
     *  - 나눗셈 결과를 리턴
     */



