package ref;

public class InitMain {

    public static void main(String[] args) {
        // 멤버 변수(필드): 클래스에 선언, 자동 초기화
        // 지역 변수: 메서드에 선언, 매개변수도 지역 변수의 한 종류, 수동 초기화

        InitData data = new InitData();
        System.out.println("value1 = " + data.value1);  // 초기값 0
        System.out.println("value2 = " + data.value2);
    }
}
