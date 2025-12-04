package ch05.aobject2.design;
// 조회버튼에 주소번지를 가짐 -> 클릭하면 -> 감지 -> actionPerformed메서드 호출
//But 그 안에 없다?

import javax.swing.*;

// 주의: static은 넣으면 안된다.
public class JFrame01View {
    JFrame jf = new JFrame();
    JButton btn = new JButton("조회");

    JFrame01Event jevent = new JFrame01Event(this);
    JFrame01Logic jlogic = new JFrame01Logic();
    public JFrame01View(){
    initDisplay();
    }
    public void initDisplay(){
        // 아래 코드가 있어야 actionPerformed가 호출될 수 있음.
        System.out.println("initDisplay 호출 성공");
        btn.addActionListener(jevent);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add("North",btn);
        jf.setSize(500,400);
        jf.setVisible(true);
    }// e.initDisplay

    public static void main(String[] args) {
        JFrame01View jv = new JFrame01View();
    }
}// e.JFrame01View
