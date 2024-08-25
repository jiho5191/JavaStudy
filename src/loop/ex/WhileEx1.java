package loop.ex;

public class WhileEx1 {

    public static void main(String[] args) {
        // 처음 10개의 자연수를 출력하는 프로그램
        // while문 버전
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        // 같은 의미
        while (count <= 10) {
            System.out.println(count++);
        }
    }
}
