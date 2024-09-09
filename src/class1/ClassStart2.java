package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        // 배열 사용의 한계
        // 한 학생의 데이터가 3개의 배열로 나누어짐. 데이터를 변경할 때 매우 조심해서 작업해야 함
        // 사람이 관리하기에 좋은 방식이 아님!!
        String[] studentNames = {"학생1", "학생2", "학생3", "학생4"};
        int[] studentAges = {15, 16, 17, 20};
        int[] studentGrades = {90, 80, 70, 60};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + "  나이: " + studentAges[i] + "  성적: " + studentGrades[i]);
        }
    }
}
