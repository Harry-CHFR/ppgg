package ch1_collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapEx5 {

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
        userBookMap.put("태희", javaBook);

        System.out.println("userBookMap = " + userBookMap);



        for (String key : userBookMap.keySet()) {
//            System.out.println("key = " + key);
            // key = 철수
            Book book = userBookMap.get(key);
            System.out.println(key + " 님이 구매한 책 = " + book);
        }

    }
}
