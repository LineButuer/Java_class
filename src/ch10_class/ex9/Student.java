package ch10_class.ex9;

public class Student {
    /*
        필드
        이름 (studentName)
        학번 (studentNumber)
        학과 (studentMajor)
        전화번호 (studentMobile)

     */
    // 이름 (studentName)
    private String studentName;
    int studentNumber;
    private String studentMajor;
    private String studentMobile;

    public void setStudentName (String studentName){

        this.studentName=studentName;
        System.out.println("studentName = " + studentName);
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public void setStudent (String studentName, String studentMajor, String studentMobile, int studentNumber){
        this.studentName = studentName;
        this.studentMajor = studentMajor;
        this.studentMobile = studentMobile;
        this.studentNumber = studentNumber;
        System.out.println("studentName = " + studentName + ", studentMajor = " + studentMajor + ", studentMobile = " + studentMobile + ", studentNumber = " + studentNumber);

    }

    public String getStudentMajor(){
        return studentMajor;
    }

    public String getStudentMobile(){
        return studentMobile;
    }

    public int getStudentNumber(){
        return studentNumber;
    }

    public String getStudentName(){

        return studentName;





    }

    /**
     * method name : toString
     * return type : String
     * parameter : x
     * @return
     */




    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentNumber=" + studentNumber +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                '}';
    }

    public void print(){
        System.out.println("이름 " + studentName + " 학번 " + studentNumber + " 학과 " + studentMajor + " 전화번호 " + studentMobile);
    }




    // 각 필드의 getter / setter 메서드

    // 기본 생성자

    // 모든 필드를 매개변수로 하는 생성자

    // 필드에 저장된 값을 출력하는 print () 메서드






}
