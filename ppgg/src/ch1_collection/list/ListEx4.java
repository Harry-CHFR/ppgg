package ch1_collection.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListEx4 {


    public static void main(String[] args) {


        List<Bag> bagList = new ArrayList<>();

        for(int i = 1; i<=10; i++) {
            Bag bag = new Bag("홍길동" + i, i * 100);
            bagList.add(bag);
        }

        System.out.println("bagList = " + bagList);

/*
        List<Bag> filterList = bagList
                .stream()
                .filter((bag) -> bag.getPrice() >= 500)
                .filter((bag) -> bag.getPrice() >= 800)
                .toList();

        System.out.println("filterList = " + filterList);
*/


        List<Bag> filterList = new ArrayList<>();

        for (Bag bag : bagList) {
            if(bag.getPrice() >= 500) {
                filterList.add(bag);
            }
        }

        System.out.println("filterList = " + filterList);


    }




}
