package pack;

// 전체 경로를 적는 것이 불편. import를 사용하면 됨!!
// *은 모든 클래스를 부름. a 하위 패키지를 부르는 것은 아님!!!!!
import pack.a.*;

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        // User는 다른 패키지에 존재함. 전체 경로를 포함해서 클래스를 적어줘야 함
        User user = new User();
    }
}
