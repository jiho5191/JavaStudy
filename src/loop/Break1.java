package loop;

public class Break1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        // while (true)는 무한 반복문
        while (true) {
            sum += i;
            if (sum > 100) {
                System.out.println("합이 100보다 크면 종료: i = " + i + ", sum = " + sum);
                break;
            }
            i++;
        }
    }
}
