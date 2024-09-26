package final1.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();
        // id는 바뀌면 안되기 때문에 final 변수를 사용해서 바뀌지 않도록 해야함
        member.changeData("myId2", "lee");
        member.print();
    }
}
