package loop;

public class DoWhile1 {

    public static void main(String[] args) {
        // do-while 문은 조건에 만족하지 않아도 한 번은 현재 값을 출력
        int i = 10;
        do {
            System.out.println("현재 숫자는: " + i);
            i++;
        } while (i < 3);
    }

}
