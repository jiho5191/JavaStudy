package method.ex;

public class MethodEx2Ref {

    public static void main(String[] args) {
        repeat(3, "Hello, world!");
        repeat(5, "Hello, java!");
        repeat(7, "Hello!");
    }

    public static void repeat(int n, String message) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
