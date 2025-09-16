package ch1_collection.exception;

import java.util.Objects;

public class OrderException extends RuntimeException {

    // alt + insert -> 생성자
    private Order exceptionOrder;


    public OrderException(Order exceptionOrder) {
        // 컴파일러가 super() 호출
        this.exceptionOrder = exceptionOrder;
    }

    public OrderException(String message, Order exceptionOrder) {
        super(message);
        this.exceptionOrder = exceptionOrder;
    }

    public OrderException(String message, Throwable cause, Order exceptionOrder) {
        super(message, cause);
        this.exceptionOrder = exceptionOrder;
    }

    public OrderException(Throwable cause, Order exceptionOrder) {
        super(cause);
        this.exceptionOrder = exceptionOrder;
    }

    public OrderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Order exceptionOrder) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.exceptionOrder = exceptionOrder;
    }


    public Order getExceptionOrder() {
        return exceptionOrder;
    }

}
