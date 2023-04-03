package Lessom_2;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Sanya");
        arrayList1.add("Bob");
        arrayList1.add("Sonya");
        arrayList1.add(1, "Dodik");
        for (String s : arrayList1
             ) {
            System.out.print(s + " ");

        }
        System.out.println();

//        ArrayList<Integer> arrayList2 = new ArrayList<>();

//        arrayList2.add(9);

//        for (int i=0;i < arrayList1.size();i++){
//            System.out.println(arrayList1.get(i));
//
//        }
//        System.out.println(arrayList1.get(2));

//        arrayList1.set(1, "Bolt");

        arrayList1.remove(0);

        System.out.println(arrayList1);




    }

}
