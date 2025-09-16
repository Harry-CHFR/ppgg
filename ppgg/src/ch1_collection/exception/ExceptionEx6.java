package ch1_collection.exception;

public class ExceptionEx6 {

    public static void main(String[] args) {


        int summaryPrice = 0;

        // 1. 하나의 구문
        try {
            Order 해장국 = new Order("해장국", 10000, 1);
            int totalPrice = 해장국.totalPrice2();
            summaryPrice = summaryPrice + totalPrice;


            Order 김밥 = new Order("김밥", 10000, 0);
            int totalPrice2 = 김밥.totalPrice2();
            summaryPrice = summaryPrice + totalPrice2;

            System.out.println("여기 도착 하나요?");
            /**
             * 이 주문서 데이터를 DB 에 넣어서 기록할 건데
             * 구매 수량이 0인건, 현실 세계에서는 산게 아닌데 ?
             */
            // Exception e = [...]  ... 부분은 자바가 직접 넣어준다
        } catch (Exception e) {
            String message = e.getMessage();

            //! 혹시 OrderException 인스턴스(객체) 인데 부모 타입으로 쓰셧나요 ?
            if(e instanceof OrderException) {   // 예
                OrderException e2 = (OrderException) e; // 옷 바꿔입기 (형 변환)
                Order exceptionOrder = e2.getExceptionOrder();
                System.out.println("예외가 난 주문 => " + exceptionOrder);
            }

            System.out.println("message = " + message);
            System.out.println("----------------------------------");
            e.printStackTrace();
        }



    }
}
/**
 *
 * 언체크드 익셉션 힘
 *
 * 사용자가 [결제] 버튼 클릭
 * 1. 상품에서 재고를 뺌
 * 2. 주문서 작성
 * 3. 결제 실행  <- 💥 예외 발생 (카드사 셧다운됨)
 * ...
 *
 * 롤백가능
 *
 *
 */
