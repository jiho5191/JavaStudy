package static2.ex;

public class Car {
    // 문제1 - 구매한 자동차 수
    private String name;
    private static int totalCars;

    // 생성자
    public Car(String name) {
        System.out.println("차량 구입, 이름: " + name);
        this.name = name;
        totalCars++;
    }

    // 구매한 차량 수를 출력하는 static 메서드
    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + totalCars);
    }

}
