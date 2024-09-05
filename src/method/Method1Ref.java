package method;

public class Method1Ref {

    public static void main(String[] args) {
        // 계산1
        int sum1 = add(5, 10);  // 5, 10과 같이 메서드에 넘기는 값을 Argument(아규먼트), 인수(인자)라고 부름
        System.out.println("결과1 출력: " + sum1);

        System.out.println("===============");

        // 계산2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력: " + sum2);

        // 이런 식으로 반환값을 받지 않아도 됨
        add(100, 200);
    }

    // add 메서드(함수)
    // public : 다른 클래스에서 호출할 수 있는 메서드라는 뜻
    // static : 객체를 생성하지 않고 호출할 수 있는 정적 메서드라는 뜻
    // int : 반환 타입을 정의. 메서드의 실행 결과를 반환할 때 사용할 반환 타입을 지정
    // add : 메서드에 이름을 부여. 이 이름으로 메서드를 호출함
    // (int a, int b) : 이 변수들은 해당 메서드 안에서만 사용됨. 파라미터(=매개변수)라고 부름
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
