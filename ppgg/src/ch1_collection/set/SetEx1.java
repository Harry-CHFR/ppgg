package ch1_collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

    public static void main(String[] args) {


        /**
         * Set Collection
         * 1. 순서가 없음
         * 2. 중복을 제거하는 효과가 있음
         * 3. 유니크한 값을 모으고 싶을때 이 Set 컬렉션을 사용함
         * ex)
         * 단 한번이라도 상품 구매내역이 있는 회원을 추출 하고 싶을때
         */

        // List<Integer> intList = new ArrayList<Integer>();
        // List<Integer> intList = new ArrayList<>();

        Set<Integer> intSet = new HashSet<Integer>();
//        Set<Integer> intSet = new HashSet<>();

        // 같은 값은 덮어씌어 진다
        intSet.add(1);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);

        // 출력
        System.out.println("intSet = " + intSet);

        // 비어있나?
        System.out.println("intSet.isEmpty() = " + intSet.isEmpty());

        // 특정 값 지우기
        System.out.println("1 을 지워 봅니다. 성공 여부 = " + intSet.remove(1));
        System.out.println("100 을 지워 봅니다. 성공 여부 = " + intSet.remove(100));


        // 1이 있나?
        System.out.println("intSet.contains(1) = " + intSet.contains(1));

        // 10이 있나?
        System.out.println("intSet.contains(10) = " + intSet.contains(10));

        for (Integer num : intSet) {
            System.out.println("num = " + num);
        }






    }
}
