package ch1_collection.exception;

public class ExceptionEx2 {

    public static void main(String[] args) {

        Order 해장국 = new Order("해장국", 10000, 1);
        int totalPrice = 해장국.totalPrice();


        Order 김밥 = new Order("김밥", 10000, 0);
        int totalPrice2 = 김밥.totalPrice();

        System.out.println("여기 도착 하나요?");
        /**
         * 이 주문서 데이터를 DB 에 넣어서 기록할 건데
         * 구매 수량이 0인건, 현실 세계에서는 산게 아닌데 ?
         */





    }
}
