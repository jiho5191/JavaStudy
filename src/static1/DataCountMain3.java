package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count); // Data3.count와 같이 클래스에 직접 접근

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        // 추가
        // 인스턴스를 통한 클래스 변수 접근
        Data3 data4 = new Data3("D");
        System.out.println("D count = " + data4.count); // 인스턴스를 통한 접근은 권장하지 않음

        Data3 data5 = new Data3("E");
        System.out.println("E count = " + data5.count);
        // data4, data5 같은 count를 사용하지만 다른 count를 사용하는 것 처럼 보이기 때문에 권장 x

        // 클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
