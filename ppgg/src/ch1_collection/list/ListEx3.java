package ch1_collection.list;

import java.util.*;

public class ListEx3 {

    // psvm Tab

    /**
     * 디버깅 팁
     * 줄 라인에 브레이크 포인트를 좌클릭으로 지정한다 (빨간색)
     * F8 : 한 라인 실행
     * F9: 다음 와드 까지 실행, 마지막 와드가 없다면 쭉감
     */
    public static void main(String[] args) {

        List<Bag> bagList1 = createBagList(10);
        for (Bag bag : bagList1) {
            System.out.println("[1] bag = " + bag);
        }

        System.out.println();
        System.out.println();

        List<Bag> bagList2 = createBagList(5);

        for (int i = 0; i < bagList2.size(); i++) {
            Bag bag = bagList2.get(i);
            System.out.println("[2] bag = " + bag);
        }


        Set<String> stringSet = new HashSet<>();
        stringSet.add("1");
        stringSet.add("2");
        System.out.println("stringSet = " + stringSet);
        int size = stringSet.size();


        // 같은 파일에서 static 클래스명 생략 가능
//        ListEx3.createBagList(10);
//        createBagList(10);


    }

    public static List<Bag> createBagList(int count) {

        List<Bag> bagList = new ArrayList<>();

        for(int i = 1; i <= count; i++) {
            // 컨트롤 P 누르면 파라미터 인자 셋팅값 볼수 있음
            Bag bag = new Bag("홍길동" + i, (100 * i));
            bagList.add(bag);
        }

        return bagList;
    }




}
