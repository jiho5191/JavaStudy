package static2;

public class DecoUtil2 {

    // static을 붙여 메서드를 만들면 인스턴스 생성없이 클래스 명.(dot)메서드 명으로 바로 호출 가능
    public static String deco(String str) {
        return "*" + str + "*";
    }
}
