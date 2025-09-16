package ch1_collection.exception.checked;

import ch1_collection.exception.Order;

public class CheckedExceptionEx2 {


    /**
     * throws Exception 지우면 에러
     */
//    public static void main(String[] args) {
    public static void main(String[] args) throws Exception {

        /**
         * 그냥 Exception 예외를 던지는 메서드는
         * 코드 작성 때 부터 try - catch 로 안 감싸면
         * 동작 조차 안한다
         */
        Order 김밥 = new Order("김밥", 10000, 0);
        int totalPrice = 김밥.totalPrice3();

        System.out.println("여기 오나요?");



    }

}
