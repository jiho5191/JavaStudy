package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // 정적 메서드는 참조값 없이 호출함. 그래서 인스턴스 변수, 메서드를 사용할 수 없음
        // instanceValue++;    // 인스턴스 변수 접근, compile error
        // instanceMethod();   // 인스턴스 메서드 접근, compile error

        staticValue++;         // 정적 변수 접근
        staticMethod();        // 정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++;    // 인스턴스 변수 접근
        instanceMethod();   // 인스턴스 메서드 접근

        staticValue++;      // 정적 변수 접근
        staticMethod();     // 정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
