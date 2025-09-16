package ch1_collection.exception;

/**
 * 주문
 */
public class Order {

    // private, public, protect

    private String goodsName;   // 상품명
    private Integer price;      // 가격
    private Integer amount;     // 수량


    public Order(String goodsName, Integer price, Integer amount) {
        this.goodsName = goodsName;
        this.price = price;
        this.amount = amount;
    }


    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 최종 지불 가격
     */
    public int totalPrice() {

        //* 검증
        if(this.amount <= 0) {
            throw new RuntimeException("구매 수량이 0 입니다, 거부!!!");
        }

        if(this.price <= 0) {
            throw new RuntimeException("가격이 0원 입니다, 거부!!!");
        }

        System.out.println("상품명 : " + this.goodsName + ", 계산 하실 금액은 : " + (this.amount * this.price) + " 입니다");
        return this.amount * this.price;
    }

    /**
     * 토탈 가격2
     * @exception OrderException
     * @return
     */
    public int totalPrice2() {

        //* 검증
        if(this.amount <= 0) {
            throw new OrderException("구매 수량이 0 입니다, 거부!!!", this);
        }

        if(this.price <= 0) {
            throw new OrderException("가격이 0원 입니다, 거부!!!", this);
        }

        System.out.println("상품명 : " + this.goodsName + ", 계산 하실 금액은 : " + (this.amount * this.price) + " 입니다");
        return this.amount * this.price;
    }

    public int totalPrice3() throws Exception {

        //* 검증
        if(this.amount <= 0) {
            throw new Exception("구매 수량이 0 입니다, 거부!!!");
        }

        if(this.price <= 0) {
            throw new Exception("가격이 0원 입니다, 거부!!!");
        }

        System.out.println("상품명 : " + this.goodsName + ", 계산 하실 금액은 : " + (this.amount * this.price) + " 입니다");
        return this.amount * this.price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "goodsName='" + goodsName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
