package cond.ex;

public class EvenOddEx {

    public static void main(String[] args) {
        int x = 55;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println(x + "는 " + result + "입니다.");
    }
}
