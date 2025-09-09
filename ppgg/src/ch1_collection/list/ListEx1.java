package ch1_collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

    // psvm Tab

    public static void main(String[] args) {


        /**
         * List
         * 배열의 상위 개념
         * 그러다 보니, 순서가 존재 한다
         * 대신에 고정된 길이로 처음부터 제한 하지않는다 (고무줄)
         *
         * 리스트는 처음 생성할때 타입을 개발자가 정한다
         * new ArrayList<Integer>();
         * new ArrayList<String>();
         * 이런식으로
         */

        // 생성자
        List<Integer> list1 = new ArrayList<Integer>();

        // 편의 방식
        List<Integer> list2 = new ArrayList<>();

        // 초기 용량도 생성자에서 파라미터로 넘겨줄 수 있다
        List<Integer> list3 = new ArrayList<>(10);


        ArrayList<Integer> arrayList = new ArrayList<>();


        // 다향성
        List<Integer> intList = new ArrayList<Integer>();
        List<String> stringList = new ArrayList<>();



        intList.add(1);
        intList.add(2);
        intList.add(3);

        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

        for(int i = 0; i < intList.size(); i++) {
            Integer intValue = intList.get(i);
            System.out.println("intValue = " + intValue);
        }

        System.out.println("---------------------------");

        for (String stringValue : stringList) {
            System.out.println("stringValue = " + stringValue);
        }





    }

}
