import works.workers.Worker;

import java.time.LocalDate;

public class Main extends java.lang.Object {
    public static void main(String[] args) {
        Worker worker = new Worker("Eduardo","1995-08-02",LocalDate.now().toString());
        System.out.println(worker.getAge());
    }
}


class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*@Override
    public String toString() {
        return super.toString();
    }*/


    @Override
    public String toString() {
        return name + " is " + age;
        /*return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';*/
    }
}

class PrimarySchoolStudent extends  Student {
    private  String parentName;

    PrimarySchoolStudent(String name, int age,String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return  parentName + "'s kid, "+ super.toString();
    }
}