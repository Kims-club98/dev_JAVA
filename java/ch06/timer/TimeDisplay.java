// date 25.12.05 15:47
/* title:
 == 구조 설명 ==
    1단계) TimeClient 가 TimeServer에 접속해 -> 1초에 한 번씩 현재시간을 들음
    2단계) JLabel 화면 중앙에 배치하고, 큰 글씨로 출력하기
 */
// ◎◎◎◎◎◎ Tip) 일단 전변으로 진행 후 지변으로 전환하기
package ch06.timer;

import javax.swing.*;
import java.awt.*;

public class TimeDisplay extends JFrame {
     JFrame jf_time = new JFrame();
     JLabel jlb_time = new JLabel("15:25:17",JLabel.CENTER);
     Font font = new Font("굴림체",Font.BOLD,68);

    public TimeDisplay(){
        // 생성자 안에서 화면 그리기 메서드 호출
        initDisplay();
    }

    // 화면 그리기 구성
    public void initDisplay(){
        TimeClient timeClient = new TimeClient(jlb_time);
        timeClient.start(); // TimeClient에 있는 run()이 호출됨
        jlb_time.setFont(font);
        jf_time.add("Center",jlb_time); // add 는 더하는 것이 아닌 붙여주세요 라는 의미.
        jf_time.setSize(400,200);
        jf_time.setVisible(true);
    }

    public static void main(String[] args) {
        // ★☆★☆★☆ 오늘부터 main 메서드 코드는 가능한 적게 쓰도록 노력한다. ★☆★☆★☆
        // 인스턴스화 하면 생성자가 호출된다!
        // 생성자 안에서 화면그리는 메서드 호출하기.
        TimeDisplay td= new TimeDisplay();

    }
}

// 실행법 -> Server 실행 후 -> Display 실행