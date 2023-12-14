package ch11_array;

public class Student {
    /**
     * 필드
     * 관리번호(id)
     * 이름(studentName)
     * 학번(studentNumber)
     * 학과(studentMajor)
     * 전화번호(studentMobile)
     *
     * getter/setter
     *
     * 생성자 2가지
     *
     * toString
     */

//    관리번호(id)
    private Long id;
//     * 이름(studentName)
    private String studentName;
//     * 학번(studentNumber)
    private String studentMajor;
//     * 학과(studentMajor)
    private String studentMobile;
//     * 전화번호(studentMobile)


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }
    public Student(){

    }
    public Student(Long id, String studentName, String studentMajor, String studentMobile) {
        this.id = id;
        this.studentName = studentName;
        this.studentMajor = studentMajor;
        this.studentMobile = studentMobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                '}';
    }
}
