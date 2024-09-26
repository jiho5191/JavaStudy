package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        // 참조형의 메서드 호출
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);   // 10
        changeReference(dataA); // 복사한 값이 참조값이기 때문에 메서드를 사용하면 같은 인스턴스에 접근.
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);   // 20
    }

    static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
