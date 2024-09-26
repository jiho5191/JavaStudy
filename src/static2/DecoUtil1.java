package static2;

public class DecoUtil1 {
    // 멤버 변수도 없고, 단순히 기능을 제공
    // 인스턴스가 필요한 이유는 멤버 변수(인스턴스 변수)를 사용하는 목적이 큰데, 이 메서드는 단순히 기능만을 제공함.
    // 객체 생성이 의미 없어보임

    public String deco(String str) {
        return "*" + str + "*";
    }
}
