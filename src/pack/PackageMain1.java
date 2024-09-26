package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        Data data = new Data();
        // User는 다른 패키지에 존재함. 전체 경로를 포함해서 클래스를 적어줘야 함
        pack.a.User user = new pack.a.User();
    }
}
