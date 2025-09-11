package ch1_collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx3 {

    public static void main(String[] args) {

        // new HashMap<부를때타입, 그때 나오는리턴타입>()

        /**
         * Map 을 만들껀데
         * Key 타입은 String
         * Value 타입은 Integer
         */
        Map<String, String> userInfoMap = new HashMap<String, String>();

        userInfoMap.put("username", "청춘오이사");
        userInfoMap.put("age", "20");
        userInfoMap.put("role", "ADMIN");

        Set<Map.Entry<String, String>> entries = userInfoMap.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }


    }
}
