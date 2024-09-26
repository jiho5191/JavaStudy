package oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args) {
        // 절차 지향 프로그래밍 3 - 메서드 추출
        // 각 기능이 모듈화 되었음
        // 절차 지향 프로그래밍 한계 -> 데이터와 기능이 분리되어 있음. 데이터는 MusicPlayerData에 기능은 MusicPlayerMain3에 존재

        MusicPlayerData data = new MusicPlayerData();   // 음악 플레이어와 관련된 데이터가 들어간 class

        // 음악 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 중가
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태
        showStatus(data);

        // 음악 플레이어 끄기
        off(data);
    }

    // 음악 플레이어 켜기
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    // 음악 플레이어 끄기
    static void off(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    // 볼륨 증가
    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    // 볼륨 감소
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    // 음악 플레이어 상태
    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
