package method;

public class Method2 {

    public static void main(String[] args) {
        // 반환 타입이 없기 때문에 앞에 변수 작성 x. ex) String header = printHeader(); 하면 오류남
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    // 반환할 내용이 없으면 void로 표현
    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return;
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
    }
}
