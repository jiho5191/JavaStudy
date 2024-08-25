package loop.ex;

public class WhileEx2 {

    public static void main(String[] args) {
        // 처음 짝수 10개의 자연수를 출력하는 프로그램
        // while문 버전
        int count = 1;
        int num = 2;

        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }
    }
}
