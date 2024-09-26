package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;   // 값이 존재하지 않음. null은 참조형에서만 사용 가능
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;    // data 변수는 앞서 만든 Data 인스턴스를 더는 참조하지 않음
        System.out.println("3. data = " + data);
    }
}
