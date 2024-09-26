package final1;

public class FieldInit {

    static final int CONST_VALUE = 10;
    final int value = 10;

    // FieldInit과 같이 final 필드를 필드에서 초기화하는 경우, 모든 인스턴스가 같은 값을 가짐
    // 결과적으로 메모리 낭비
    // 그래서 static과 final을 함께 사용했음
    // static final은 변수명을 모두 대문자로 사용 권장!
    // 항상 같은 값을 가지기 때문에 상수라고 부름!!
}
