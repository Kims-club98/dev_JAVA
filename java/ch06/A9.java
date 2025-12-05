// date 25.12.05 10:50
// title: JFrame 의 title 지정

package ch06;

import javax.swing.*;

public class A9 {
    public static void main(String[] args) {
        /* * title 넣기
            jf1 => 초기 인스턴스 때 title 지정
            jf => 는 setTitle을 통해 이후 title을 지정
        */
        JFrame jf = new JFrame();
        JFrame jf1 = new JFrame("공지사항");
        jf.setTitle("[[공지사항]]");
        jf.setSize(300,300);
        jf.setVisible(true);
        jf1.setSize(300,300);
        jf1.setVisible(true);
    }
}
