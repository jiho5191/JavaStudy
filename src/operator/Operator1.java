package operator;

public class Operator1 {

    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a- b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b;    // int(정수형)이기 때문에 소수점 표현 안됨. 2로 표현됨.
        System.out.println("a / b = " + div);
        // 숫자는 0으로 나눌 수 없음

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}
