package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();   // 참조형을 final로 선언. 참조값을 바꿀 수 없음
        // data = new Data();   // 새 참조값으로 변경 불가능

        // 참조 대상의 값은 변경은 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
