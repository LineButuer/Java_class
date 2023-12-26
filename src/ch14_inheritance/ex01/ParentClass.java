package ch14_inheritance.ex01;

public class ParentClass {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParentClass(){
        System.out.println("부모 기본 생성자");
    }
    public void hello(){
        System.out.println("ParentClass.hello");
    }

    @Override
    public String toString() {
        return "ParentClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
