package operator.ex;

public class OperationEx3 {

    public static void main(String[] args) {
        // int형 변수 score를 선언하고, score가 80점 이상이고, 100점 이하이면 true를 출력, 아니면 false를 출력하세요
        int score = 79;
        boolean result = score >= 80 && score <= 100;
        System.out.println(result);
    }
}
