package ch10_class.ex9;

public class StudentMain {
    public static void main(String[] args) {
        // 기본 생성자로 student 클래스 객체 만들고 setter를 이용하여 필드값 채우기

        Student student = new Student();
        student.setStudentName("name");




        String studentName = student.getStudentName();
        System.out.println("studentName = " + studentName);



        // 모든 필드를 매개변수로 하는 생성자로 student 클래스 객체 만들기

        student.setStudent("정대만", "고등학생", "010-0002-9999", 19);
       

        // 각각의 객체에서 print 메서드 호출하여 필드값 출력


        String studentMajor = student.getStudentMajor();
        System.out.println("studentMajor = " + studentMajor);

        String studentMobile = student.getStudentMobile();
        System.out.println("studentMobile = " + studentMobile);

        int studentNumber = student.getStudentNumber();
        System.out.println("studentNumber = " + studentNumber);

        student.print();
        System.out.println("Student = " + student);
    }
}
