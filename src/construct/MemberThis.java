package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        // 필드 이름과 매개변수의 이름이 서로 다르면 앞에 this. 생략해도 됨
        nameField = nameParameter;
    }
}
