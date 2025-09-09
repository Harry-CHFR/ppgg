package ch1_collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {

    // psvm Tab

    public static void main(String[] args) {


        // 다향성
        List<Integer> intList1 = new ArrayList<Integer>();
        List<Integer> intList2 = new ArrayList<>();
        List<Integer> intList3 = new ArrayList<>();


        intList1.add(1);
        intList1.add(2);
        intList1.add(3);
        intList1.add(3);
        intList1.add(3);

        // 1,2,3 예상
        System.out.println("intList1 = " + intList1);

        intList2.add(4);
        intList2.add(5);
        intList2.add(6);

        boolean check1 = intList1.addAll(intList2);
        boolean check2 = intList1.addAll(intList3);

        System.out.println("check1 = " + check1);
        System.out.println("check2 = " + check2);



        // 두번째 리스트를 첫번째 리스트에 더한다

        // 1,2,3,4,5,6 예상
        System.out.println("intList1 = " + intList1);






    }

}
