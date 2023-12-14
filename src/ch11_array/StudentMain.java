package ch11_array;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentMain {

    public static void main(String[] args) {


        // Student 클래스 객체를 담기 위한 List
        // StudentList

        List<Student> studentList = new ArrayList<>();
//        studentList.add(12); // x
//        studentList.add("add") // x
        Student student1 = new Student(1L, "학생1", "현대무용", "010-2232-3333");
        studentList.add(student1);

        Student student2 = new Student(2L, "학생2", "고대무용", "010-1232-3333");
        studentList.add(student2);
        // 우선 배열 안에 필드를 넣어야 할 거 같은데
        // 필드 안에 넣었으면 그걸 호출 해야지 그리고 반복문을 이용해서 그 만들었던 것들을 안에다 집어 넣고
        // 실행하면 끝인데


        System.out.println("studentList.get(1) = " + studentList.get(1));

        Student a = studentList.get(0);
        System.out.println("a = " + a);
        System.out.println(a.getStudentMajor());

        // 1번 인덱스에 담긴 객체의 학과만 출력

        System.out.println(studentList.get(1).getStudentMajor());

        // 반복문
        for (int i=0; i < studentList.size(); i++){
            System.out.println(studentList.get(i));
            //학생 이름만 따로 출력
            System.out.println("studentList.get(i).getStudentName() = " + studentList.get(i).getStudentName());
        }

        // for each
        for (Student stu : studentList){
            System.out.println("stu = " + stu);
            // 이름만
            System.out.println("stu.getStudentName() = " + stu.getStudentName());
        }

    }
}
