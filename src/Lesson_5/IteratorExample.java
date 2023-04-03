package Lesson_5;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Sanya");
        arrayList1.add("Bob");
        arrayList1.add("Sonya");
        arrayList1.add("Sanya");

        Iterator<String> iterator = arrayList1.iterator();
//        while (iterator.hasNext()){
//            iterator.next();
//            iterator.remove();
//        }
//        System.out.println(arrayList1);

        System.out.println(arrayList1);
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }



    }
}
