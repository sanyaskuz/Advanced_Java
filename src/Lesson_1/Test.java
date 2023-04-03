package Lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList <String> arrayList1 = new ArrayList<>();
        arrayList1.add("Sanya");
        arrayList1.add("Bob");
        arrayList1.add("Sonya");


        System.out.println(arrayList1);
        ArrayList <String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Sanya");
        arrayList2.add("Djorsh");

        List<String> arrayList3 = new ArrayList<>();

        ArrayList <String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4);

        System.out.println(arrayList1 == arrayList4);



    }
}
