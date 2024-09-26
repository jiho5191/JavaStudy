package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        // 기본형의 메서드 호출
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);   // 10
        changePrimitive(a); // a를 복사해서 넣은 것이기 때문에 메서드 안에서만 값이 바뀜
        System.out.println("메서드 호출 후: a = " + a);   // 10
    }

    public static void changePrimitive(int x) {
        x = 20;
    }
}
