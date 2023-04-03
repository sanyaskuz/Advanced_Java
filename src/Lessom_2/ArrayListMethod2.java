package Lessom_2;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethod2 {
    public static void main(String[] args) {
        Students st1 = new Students("Ivan" , 'm', 22, 3, 8.3);
        Students st2 = new Students("Nikolay" , 'm', 28, 2, 6.4);
        Students st3 = new Students("Elena" , 'f', 19, 1, 8.9);
        Students st4 = new Students("Petr" , 'm', 35, 4, 7);
        Students st5 = new Students("Mariya" , 'f', 23, 3, 7.4);

        ArrayList<Students> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        System.out.println(studentList);

        Students st6 = new Students("Mariya" , 'f', 23, 3, 7.4);
//        studentList.remove(st6);
        int id = studentList.indexOf(st6);
        System.out.println(id);


    }
}
class Students{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Students(String name, char sex, int age, int course, double avgGrade){
        this.age = age;
        this.sex = sex;
        this.avgGrade = avgGrade;
        this.course = course;
        this.name = name;
    }
    public String toString() {
        return "Student {" +
                "name :" + name + '\'' +
                ", sex :" + sex +
                ", age :" + age +
                ", course :" + course +
                ", avgGrade :" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return sex == students.sex && age == students.age && course == students.course && Double.compare(students.avgGrade, avgGrade) == 0 && Objects.equals(name, students.name);
    }


}
