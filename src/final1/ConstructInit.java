package final1;

public class ConstructInit {

    // final을 필드에 사용할 경우 생성자를 통해서 값을 입력받고 이 이후에는 값을 바꿀 수 없음
    final int value;

    // 생성자 (alt + Insert)
    public ConstructInit(int value) {
        this.value = value;
    }
}
