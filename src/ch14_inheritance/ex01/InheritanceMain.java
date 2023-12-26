package ch14_inheritance.ex01;

public class InheritanceMain {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        parentClass.setName("이름1");
        parentClass.setAge(10);
        System.out.println("parantClass = " + parentClass);
        parentClass.hello();


        ChildClass childClass = new ChildClass();
        childClass.setName("자식이름1");
        childClass.setAge(100);
        System.out.println("childClass = " + childClass);
        childClass.hello();

        // 좌변: 부모 타입의 객체, 우변: 자식 클래스 생성자
        ParentClass parentClass1 = new ChildClass();
        parentClass1.hello();
        parentClass1= new ParentClass();
        parentClass1.hello();

        // 좌변: 자식 타입의 객체, 우변: 부모 클래스 생성자
//        ChildClass childClass1 = new ParentClass();
    }
}
