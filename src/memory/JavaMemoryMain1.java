package memory;

public class JavaMemoryMain1 {

    public static void main(String[] args) {
        // 스택 영역의 변화
        // 스택 구조이기 때문에 main 메서드가 가장 먼저 실행됐지만 가장 늦게 끝남!
        System.out.println("main start");   // 1
        method1(10);
        System.out.println("main end");     // 6
    }

    static void method1(int m1) {
        System.out.println("method1 start");    // 2
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");      // 5
    }

    static  void method2(int m2) {
        System.out.println("method2 start");    // 3
        System.out.println("method2 end");      // 4
    }
}
