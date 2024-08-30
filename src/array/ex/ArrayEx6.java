package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int num = scanner.nextInt();

        int[] numbers = new int[num];

        System.out.println(num + "개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int minNum = numbers[0];  // 가장 작은 수를 넣을 변수
        int maxNum = numbers[0];  // 가장 큰 수를 넣을 변수

        for (int i = 0; i < numbers.length; i++) {
            if (minNum > numbers[i]) {     // minNum보다 작은 값이 있으면 minNum에 대입
                minNum = numbers[i];
            }
            if (maxNum < numbers[i]) {     // maxNum보다 큰 값이 있으면 maxNum에 대입
                maxNum = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNum);
        System.out.println("가장 큰 정수: " + maxNum);
    }
}
