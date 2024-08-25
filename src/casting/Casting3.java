package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647;  // int 최고값
        long maxIntOver = 2147483648L;  // int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue;   // 형 볌환
        System.out.println("maxIntValue casting = " + intValue);

        // int형 초과 범위 입력 -> 오버플로우 발생
        intValue = (int) maxIntOver;    // 형 변환
        System.out.println("maxIntOver casting = " + intValue);
    }
}
