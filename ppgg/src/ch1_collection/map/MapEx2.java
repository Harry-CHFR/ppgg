package ch1_collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapEx2 {

    public static void main(String[] args) {

        // new HashMap<부를때타입, 그때 나오는리턴타입>()

        /**
         * Map 을 만들껀데
         * Key 타입은 String
         * Value 타입은 Integer
         */
        Map<String, Object> dataMap = new HashMap<String, Object>();

        dataMap.put("applePrice", 100);
        dataMap.put("username", "ksj");
        dataMap.put("age", 20);
        dataMap.put("role", "ADMIN");

        System.out.println("dataMap = " + dataMap);

        // String 클래스에는 대문자 변형 메서드와 소문자 변형 메서드가 있다

        String username = (String) dataMap.get("username");
        String text = username.toUpperCase();
        System.out.println("text = " + text);

        int applePrice = (int) dataMap.get("applePrice");
        System.out.println("applePrice = " + applePrice);

        Integer applePrice2 = Integer.parseInt(String.valueOf(dataMap.get("applePrice")));
        System.out.println("applePrice2 = " + applePrice2);

    }
}
