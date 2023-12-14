package ch11_array;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex01_ListBasic {
    public static void main(String[] args) {

//       정수를 담는
        List<Integer> intList = new ArrayList<>();
//        ArrayList<Integer> intList2 = new ArrayList<>();
//        List<Integer> intList3 = new ArrayList<>();
        // 10 이라는 데이터를 추가
        System.out.println(intList.add(10));
        System.out.println("intList.size() = " + intList.size());
        intList.add(1000);
        System.out.println("intList.size() = " + intList.size());
        // 1번 인덱스에 999를 추가
        intList.add(1, 999);
        System.out.println("intList.size() = " + intList.size());
        // 0번 인덱스에 담긴 데이터 출력
        System.out.println("intList.get(0) = " + intList.get(0));
        System.out.println("intList.get(1) = " + intList.get(1));
        System.out.println("intList.get(2) = " + intList.get(2));
        //remove()
        intList.remove(1);
        System.out.println("intList.get(0) = " + intList.get(0));
        System.out.println("intList.get(1) = " + intList.get(1));
//        System.out.println("intList.get(2) = " + intList.get(2));

        //String을 담는 strList 선언
        List<String> strList = new ArrayList<>();
        strList.add("안녕");
        strList.add(1, "hello");
        strList.add("bye");
        System.out.println("strList.get(0) = " + strList.get(0));
        System.out.println("strList.get(2) = " + strList.get(1));
        System.out.println();
        String str1 = strList.get(1);
        System.out.println("str1 = " + str1);

        //for 문을 이용하여 intList에 담긴 데이터를 모두 출력
        for(int i =0; i< intList.size(); i++){

            System.out.println("intList.get " + i +" = " + intList.get(i));
        }

        // for each
        for(int a : intList){
            System.out.println("a = " + a);
        }

        intList.forEach(integer -> {
            System.out.println("i = " + integer);
        });
        // for 문을 이용하여 strList에 담긴 데이터를 모두 출력
        for (int i = 0; i<strList.size(); i++){
            System.out.println("strList.get "  + i +" = "+ strList.get(i));
        }
        // 출력을 하려면 배열이 필요 어차피 위에 다 만들어져 있으니 그냥 for문만 만들어서 하면 될듯
        // 문장을 돌릴 정수만 설정해주고 하나씩 올라가게 하면서 하면 될 듯?


        for(String a : strList){
            System.out.println("a = " + a);
        }
    }
}
