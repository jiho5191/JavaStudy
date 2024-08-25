package loop.ex;

public class NestedEx1 {

    public static void main(String[] args) {
        // 중첩 for문으로 구구단 출력
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "X" + j + "=" + i * j);
            }
        }
    }
}
