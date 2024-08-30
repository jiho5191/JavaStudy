package array;

public class Array1Ref1 {

    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5];  // 배열 생성
        // students = 참조값(메모리 주소)
        // 배열, 객체같은 변수들은 참조형 데이터 타입을 가진다. 동적으로 메모리를 할당함

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
    }
}
