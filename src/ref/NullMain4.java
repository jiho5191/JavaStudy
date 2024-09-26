package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();  // BigData 안에 있는 인스턴스 Data에 참조값 부여
        System.out.println("bigData.count = " + bigData.count); // null
        System.out.println("bigData.data = " + bigData.data);   // 0

        System.out.println("bigData.data.value" + bigData.data.value);
    }
}
