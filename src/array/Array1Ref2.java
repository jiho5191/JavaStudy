package array;

public class Array1Ref2 {

    public static void main(String[] args) {
        int[] students;  // 배열 변수 선언
        students = new int[5];  // new는 새로 생성한다는 뜻. int[5]는 int형 변수 5개라는 뜻.
        // students = 참조값(메모리 주소)
        // 배열, 객체는 참조형 변수임. ( 동적으로 메모리를 할당하기 때문에 )

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
