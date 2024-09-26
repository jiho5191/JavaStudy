package ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] products = new ProductOrder[3];
        int totalPrice = 0; // 총 금액

        // createOrder()를 여러 번 사용하여 상품 주문 정보들을 생성하고 배열에 저장
        products[0] = createOrder("두부", 2000, 2);
        products[1] = createOrder("김치", 5000, 1);
        products[2] = createOrder("콜라", 1500, 2);

        // printOrders()를 사용해서 상품 주문 정보 출력
        for (int i = 0; i < products.length; i++) {
            printOrders(products[i]);
            // getTotalAmount()를 사용해서 총 결제 금액 계산
            totalPrice += getTotalAmount(products[i].price, products[i].quantity);
        }

        // 총 결제 금액 출력
        System.out.println("총 결제 금액: " + totalPrice);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productOrder = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder productOrder) {
        System.out.println("상품명: " + productOrder.productOrder + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
    }

    static int getTotalAmount(int price, int quantity) {
        int totalAmount = price * quantity;
        return totalAmount;
    }
}
