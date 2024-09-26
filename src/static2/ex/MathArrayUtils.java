package static2.ex;

public class MathArrayUtils {
    // 문제2 - 수학 유틸리티 클래스

    private MathArrayUtils() {
        // private 인스턴스 생성을 막는다.
    }

    // 배열의 모든 요소를 더하여 합계를 반환하는 메서드
    public static int sum(int[] values) {
        int sumValue = 0;
        for (int i = 0; i < values.length; i++) {
            sumValue += values[i];
        }

        return sumValue;
    }

    // 배열의 모든 요소의 평균값을 계산하는 메서드
    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    // 배열에서 최소값을 찾는 메서드
    public static int min(int[] values) {
        int minValue = values[0];
        for (int i = 0; i < values.length; i++) {
            if (minValue > values[i]) {
                minValue = values[i];
            }
        }
        return minValue;
    }

    // 배열에서 최대값을 찾는 메서드
    public static int max(int[] values) {
        int maxValue = values[0];
        for (int i = 0; i < values.length; i++) {
            if (maxValue < values[i]) {
                maxValue = values[i];
            }
        }
        return maxValue;
    }
}
