package array;

public class Array1Ref1 {

    public static void main(String[] args) {
        int[] students;  // 배열 변수 선언
        students = new int[5];  // new는 새로 생성한다는 뜻. int[5]는 int형 변수 5개라는 뜻.
        // students = 참조값(메모리 주소)

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
    }
}
