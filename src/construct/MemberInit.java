package construct;

public class MemberInit {
    // 멤버 변수
    String name;
    int age;
    int grade;

    // 추가
    void initMember(String name, int age, int grade) {
        // 멤버 변수와 메서드의 매개변수 이름이 같으면 매개변수가 우선 순위를 가짐
        // this. 하면 인스턴스 자신의 참조값을 가리킴
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
