package method;

public class MethodValue2 {

    public static void main(String[] args) {
        // *** 자바는 항상 변수의 값을 복사해서 대입한다! ***
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number);
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number);
    }

    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number: " + number);
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number: " + number);
    }

    // 실행 과정
    // number의 값 5를 읽고 복사해서 number에 전달
    // number의 변경은 number에 영향을 주지 않음. 복사해서 전달했기 때문에
    // 최종 결과 -> num1 = 5, num2 = 10
}
