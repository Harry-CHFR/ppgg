package ch1_collection.exception.checked;

import ch1_collection.exception.Order;

public class CheckedExceptionEx1 {

    public static void main(String[] args) {

        /**
         * 그냥 Exception 예외를 던지는 메서드는
         * 코드 작성 때 부터 try - catch 로 안 감싸면
         * 동작 조차 안한다
         */
        try {

            Order 해장국 = new Order("해장국", 10000, 1);
            int totalPrice = 해장국.totalPrice3(); // 3번 메서드 - Exception


            Order 김밥 = new Order("김밥", 10000, 0);
//            int totalPrice2 = 김밥.totalPrice2(); // 2번 메서드 - RuntimeException
            int totalPrice2 = 김밥.totalPrice3(); // 2번 메서드 - Exception

        } catch (RuntimeException e) {
            System.out.println("RuntimeException 제가 막았어요");
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Exception 제가 막았어요");
            e.printStackTrace();
        }


        System.out.println("여기 오나요?");

    }

}
