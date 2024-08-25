package scope;

public class Scope1 {

    public static void main(String[] args) {
        // 변수의 접근 가능한 범위를 스코프(Scope)라고 한다. 범위라는 뜻.
        int m = 10;
        if (true) {
            int x = 20;
            System.out.println("if m = " + m);  // 블록 내부에서 블록 외부는 접근 가능
            System.out.println("if x = " + x);
        }
        // System.out.println("main x = " + x); // 오류. 변수 x에 접근 불가
        System.out.println("main m = " + m);
    }
}
