package ref;

public class NullMain2 {

    public static void main(String[] args) {
        // NullPointerException
        // 참조값 없이 객체를 찾아가면 NullPointerException이라는 예외가 발생함
        // 객체를 참조할 때는 .(dot)(포인터 역할)을 사용함. 참조값이 null이라면 값이 없다는 뜻.
        Data data = null;
        data.value = 10;    // NullPointerException 예외 발생
        System.out.println("data = " + data.value);
    }
}
