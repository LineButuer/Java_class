package ch07_while;

public class Ex07_WhileEx {
    public static void main(String[] args) {
        /**
         * 1 + (-2) + 3 + (-4) + 5 + (-6) ~~
         * 처럼 계산을 했을 때 합계가 100이 됐을 때의 숫자를 출력
         * 정답 : 199
         *
         */
//        int i = 1;
//        int j = 0;
//        int sum = 0;
//        boolean run = true;
//        while (run){
//            i+=2;
//            System.out.println(i);
//            j-=2;
//            if(j%2==0){
//                System.out.println(" j = " + j);
//            }
//            sum = i+j;
//            if(sum==100){
//                run = false;
//            }
//        }System.out.println("sum  = " + sum);

//        // 합계용 변수
//        int sum =0;
//        //1,2,3,4,5,6,7,8~~
//        int count = 1;
//        //1, -2, -3, -4 ~~
//        int num = 0;
//        // 부호용 변수
//        int s =1;
//        boolean run =true;
//        while (run){
//            sum+=num;
//            if(sum>=100){
//                run = false;
//            }else {
//                num = s * count;
//                s = -s; //1, -1, 1, -1
//                count++;
//            }
//            System.out.println("num = " + num);
//            System.out.println("sum = " +sum);
//
//        }

        int sum = 0;
        int i = 1;
        int c = 1;
        int num = 0;
        boolean run = true;

        while (run) {
            sum += num;
            if (sum >= 100) {
                run = false;

            } else {
                num = i * c;
                c = c * -1;
                i++;
            }
            System.out.println("sum = " + sum);
            System.out.println("num = " + num);
        }


    }
}
