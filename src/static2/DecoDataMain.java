package static2;

// import static static2.DecoData.staticCall;
// import static static2.DecoData.*;    // 다른 모든 static method를 사용함

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();  // 자주 사용하는 static 메서드가 있다면 alt + Enter 해서 import 하면 됨

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가
        // 인스턴스를 통한 접근도 가능함 ( 추천 안함 )
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        DecoData.staticCall();
    }
}