package oop1;

public class ValueObject {

    public static void main(String[] args) {
        // 속성(데이터, 멤버 변수)과 기능(메서드)을 ValueData에 합침

        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자: " + valueData.value);
    }
}
