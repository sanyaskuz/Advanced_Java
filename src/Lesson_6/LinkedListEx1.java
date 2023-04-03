package Lesson_6;


import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Students2 st1 = new Students2("Ivan" , 3);
        Students2 st2 = new Students2("Sanya" , 2);
        Students2 st3 = new Students2("Masha" , 1);
        Students2 st4 = new Students2("Fetr" , 4);
        Students2 st5 = new Students2("Elena" , 3);


        LinkedList<Students2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);

        System.out.println("LinkedList " + student2LinkedList);
//        System.out.println(student2LinkedList.get(2));
        Students2 st6 = new Students2("Nikita" , 1);
        Students2 st7 = new Students2("Oleg" , 4);
        student2LinkedList.add(st6);
        System.out.println("LinkedList " + student2LinkedList);
        student2LinkedList.add(1, st7);
        System.out.println("LinkedList " + student2LinkedList);
        student2LinkedList.remove(1);
        System.out.println("LinkedList " + student2LinkedList);







    }


}
class Students2 {
    private String name;

    private int course;


    public Students2(String name,  int course) {

        this.course = course;
        this.name = name;
    }

    public String toString() {
        return "Student {" +
                "name :" + name + '\'' +
                ", course :" + course +
                '}';
    }
}
