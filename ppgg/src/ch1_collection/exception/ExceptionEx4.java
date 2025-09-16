package ch1_collection.exception;

public class ExceptionEx4 {

    public static void main(String[] args) {

        int summaryPrice = 0;

        // 1. 하나의 구문
        try {
            Order 해장국 = new Order("해장국", 10000, 1);
            int totalPrice = 해장국.totalPrice();
            summaryPrice = summaryPrice + totalPrice;


            Order 김밥 = new Order("김밥", 10000, 0);
            int totalPrice2 = 김밥.totalPrice();
            summaryPrice = summaryPrice + totalPrice2;

            System.out.println("여기 도착 하나요?");
            /**
             * 이 주문서 데이터를 DB 에 넣어서 기록할 건데
             * 구매 수량이 0인건, 현실 세계에서는 산게 아닌데 ?
             */
            // Exception e = [...]  ... 부분은 자바가 직접 넣어준다
        } catch (Exception e) {
            String message = e.getMessage();
            System.out.println("message = " + message);
            System.out.println("----------------------------------");
            e.printStackTrace();
        } finally {
            System.out.println("에러가 나든 말든 난 반드시 이걸 실행할거야");
            System.out.println("오늘 하루 동안 지출 비용 : " + summaryPrice);

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
