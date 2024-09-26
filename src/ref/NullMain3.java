package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count); // null
        System.out.println("bigData.data = " + bigData.data);   // 0

        // NullPointerException 예외 발생
        System.out.println("bigData.data.value" + bigData.data.value);  // null.value 이기 때문에 오류
    }
}
