package ch1_collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx4 {

    public static void main(String[] args) {


        /**
         * "어떤 사람의 책" 이 구조를 데이터로 만들려고 Map 의 자료형을 사용함
         * userBookMap.get("근찰스") => 근찰스의 책
         * userBookMap.get("524") => 524의 책
         */
        Map<String, Book> userBookMap = new HashMap<String, Book>();

        Book javaBook = new Book("이것이 자바다", 35000);
        Book pythonBook = new Book("혼자 공부하는 파이썬", 20000);

        userBookMap.put("철수", javaBook);
        userBookMap.put("영희", pythonBook);

        System.out.println("userBookMap = " + userBookMap);


        Book 철수의책 = userBookMap.get("철수");
        System.out.println("철수의책 = " + 철수의책);

        Book 영희의책 = userBookMap.get("영희");
        System.out.println("영희의책 = " + 영희의책);

        // 최종 합산 가격
        int price = 철수의책.getPrice() + 영희의책.getPrice();
        System.out.println("price = " + price);

    }
}
