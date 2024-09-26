package ref;

public class Varchange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // dataA에 있는 참조값을 읽고 복사해서 dataB에 전달. 참조값이 동일해짐

        System.out.println("dataA 참조값 = " + dataA); // ex) 참조값 x001
        System.out.println("dataB 참조값 = " + dataB);
        System.out.println("dataA.value = " + dataA.value); // 10
        System.out.println("dataB.value = " + dataB.value); // dataB는 dataA의 주소와 같음. 같은 10을 가리킴!
        System.out.println();

        // dataA 변경
        dataA.value = 20;   // x001.value = 20
        System.out.println("변경 dataA.value = " + dataA.value);
        System.out.println("dataA.value = " + dataA.value); // 20
        System.out.println("dataB.value = " + dataB.value); // 20
        System.out.println();

        // dataB 변경
        // dataB와 dataA의 참조값 같기 때문에 사실상 인스턴스(객체)는 하나임. 같은 값이 출력될 것
        dataB.value = 30;   // x001.value = 30
        System.out.println("변경 dataB.value = " + dataB.value);
        System.out.println("dataA.value = " + dataA.value); // 30
        System.out.println("dataB.value = " + dataB.value); // 30
    }
}
