package ch10_class.ex4;

public class StudentMain {
    public static void main(String[] args) {
        // 기본 생성자로 student1 객체 생성
        Student student1 = new Student();
        student1.studentName = "학생1";
        student1.studentNumber = "01011";
        student1.studentMajor = "통계1";
        System.out.println("student1.studentName = " + student1.studentName);
        // 매개변수 있는 생성자로 student2 객체 생성
        Student student2 = new Student("학생2", "010-2222-2222", "logistics" );
        System.out.println("student2.studentName = " + student2.studentName);
        System.out.println("student2.studentNumber = " + student2.studentNumber);
        System.out.println("student2.studentMajor = " + student2.studentMajor);
    }

}
