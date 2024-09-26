package pack;

// 전체 경로를 적는 것이 불편. import를 사용하면 됨!!
import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        // 같은 이름의 클래스가 있다면 하나만 import 할 수 있음. 자주 사용하는 것을 import 하면 됨
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
