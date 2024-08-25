package cond;

public class If5 {

    public static void main(String[] args) {

        // 서로 관련이 없는 독린적인 조건에서는 각자 다른 if문을 사용해야 함
        int price = 10000;  // 아이템 가격
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10,000원 이상 구매시 1,000원 할인");
        }

        if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 1,000원 할인");
        }

        System.out.println("총 할인 금액 : " + discount + "원");

        // 실행문이 하나!!일 때는 중괄호{} 없이 실행됨
        // 그러나 가독성, 유지보수성을 위해 중괄호{}를 사용해 주는 것이 좋음
        if (false)
            System.out.println("if문에서 실행됨");
            System.out.println("if문에서 실행안됨");
    }
}
