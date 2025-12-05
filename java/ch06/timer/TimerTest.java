// date 25.12.05 15:07
// title: TimeServer 테스트 목적 파일
package ch06.timer;

public class TimerTest {
    public static void main(String[] args) {
        TimeServer ts = new TimeServer(null);
        System.out.println(ts.getTime());
    }

}
