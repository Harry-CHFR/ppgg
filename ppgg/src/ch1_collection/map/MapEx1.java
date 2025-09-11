package ch1_collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

    public static void main(String[] args) {

        // new HashMap<부를때타입, 그때 나오는리턴타입>()

        /**
         * Map 을 만들껀데
         * Key 타입은 String
         * Value 타입은 Integer
         *
         * Map 대신에 Class 로 사용하는게 더 좋은데
         * 가벼운 데이터 다룰때는 map 을 사용하기도함
         */
        Map<String, Integer> priceMap = new HashMap<String, Integer>();

        priceMap.put("apple", 1000);
        priceMap.put("banana", 2000);

        System.out.println("priceMap = " + priceMap);

        ////////////////////////////////////////////////////////////////////////////////
        //! 실제 상황


        // Key 이름으로 Value 를 가져오기
//        Integer applePrice = priceMap.get("Key 이름");

        Integer applePrice = priceMap.get("apple");
        System.out.println("applePrice = " + applePrice);

        Integer bananaPrice = priceMap.get("banana");
        System.out.println("bananaPrice = " + bananaPrice);


    }
}
