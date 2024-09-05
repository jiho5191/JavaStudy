package method;

public class MethodCasting2 {

    public static void main(String[] args) {
        // 자동 형변환
        int number = 100;
        printNumber(number);    // double이 더 큰 숫자 범위이므로 자동 형변환 적용
    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
