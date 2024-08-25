package loop.ex;

public class ForEx3 {

    public static void main(String[] args) {
        // 누적 합 계산
        // for문 버전

        int sum = 0;
        for (int i = 1, max = 100; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
