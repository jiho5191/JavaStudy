package loop.ex;

public class ForEx2 {

    public static void main(String[] args) {
        // 처음 짝수 10개의 자연수를 출력하는 프로그램
        // for문 버전
        int num = 2;
        for (int count = 1; count <= 10; count++) {
            System.out.println(num);
            num += 2;
        }
    }
}
