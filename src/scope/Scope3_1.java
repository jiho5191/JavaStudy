package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        // 지역변수 사용해야 하는 이유
        // 1. 비효율적인 메모리 사용
        // 2. 코드 복잡성 증가
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
