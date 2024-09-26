package access.ex;

public class Item {
    // 문제 - 쇼핑 카트
    private String name;
    private int price;
    private int quantity;

    // 생성자
    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // ShoppingCart 클래스에서 장바구니 상품 출력할 때 쓰일 메서드
    public String getName() {
        return name;
    }

    // ShoppingCart 클래스에서 장바구니 상품 출력할 때 쓰일 메서드
    public int getTotalPrice() {
        return price * quantity;
    }
}
