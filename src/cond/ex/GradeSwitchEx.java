package cond.ex;

public class GradeSwitchEx {

    public static void main(String[] args) {
        String grade = "D";
        switch (grade) {
            case "A" :
                System.out.println("\"A\": \"탁월한 성과입니다!\"");
                break;
            case "B" :
                System.out.println("\"B\": \"종은 성과입니다!\"");
                break;
            case "C" :
                System.out.println("\"C\": \"준수한 성과입니다.\"");
                break;
            case "D" :
                System.out.println("\"D\": \"향상이 성과입니다.\"");
                break;
            case "F" :
                System.out.println("\"F\": \"불합격입니다.\"");
                break;
            default:
                System.out.println("나머지: \"잘못된 학점입니다.\"");
        }
    }
}

