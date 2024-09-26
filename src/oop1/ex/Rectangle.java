package oop1.ex;

public class Rectangle {
    // 객체 지향 프로그래밍을 위한 데이터와 기능이 들어간 클래스
    int width;
    int height;

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
