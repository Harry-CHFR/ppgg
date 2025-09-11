package ch1_collection.list;

public class Bag {

    private String owner;
    private Integer price;


    // 기본 생성자
    public Bag() {

    }

    // 생성자 1
    public Bag(String owner) {
        this.owner = owner;
    }

    // 생성자 2
    public Bag(Integer price) {
        this.price = price;
    }

    // 생성자 3
    public Bag(String owner, Integer price) {
        this.owner = owner;
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "owner='" + owner + '\'' +
                ", price=" + price +
                '}';
    }
}
