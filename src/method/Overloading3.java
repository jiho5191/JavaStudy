package method;

public class Overloading3 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));      // 1번 함수가 없어져도 자동 형변환으로 실행 가능
        System.out.println("1: " + add(1.2, 1.5));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
