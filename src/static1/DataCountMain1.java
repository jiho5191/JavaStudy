package static1;

public class DataCountMain1 {

    public static void main(String[] args) {
        // 이 프로그램은 제대로 작동하지 않음
        // 객체를 생성할 때마다 Data1 인스턴스는 새로 만들어짐. 그리고 인스턴스에 포함된 count 변수도 새로 만들어짐
        // 객체 개수를 셀 수 없기 때문에 잘못만들어진 프로그램
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count = " + data1.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count = " + data1.count);
    }
}
