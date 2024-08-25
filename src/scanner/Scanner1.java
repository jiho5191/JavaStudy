package scanner;

import java.util.Scanner;   // 자바 라이브러리에 있는 스캐너를 불러옴

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    // scanner라는 변수를 선언

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();    // 입력을 String으로 가져온다.   * 주의 * 타입이 다르면 오류가 발생함
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요: ");
        int intValue = scanner.nextInt();   // 입력을 Int로 가져온다.
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleValue);
    }
}
