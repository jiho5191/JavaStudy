package access;

public class SpeakerMain {

    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        // 스피커 클래스에 최대 음량을 정해뒀지만 접근을 제어하지 않으면 외부에서 직접 접근했을 때 막을 방법이 없음
        System.out.println("volume 필드 직접 접근 수정");
        // speaker.volume = 200;   // private 접근 오류
        speaker.showVolume();
    }
}
