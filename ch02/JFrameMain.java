package ch02;


import javax.swing.*;

public class JFrameMain {
    public static void main(String[] args) {
        //인스턴스화를 각각 하였으므로, type은 같지만 서로 다른 객체
        JFrame jf1 = new JFrame();
        JFrame jf2 = new JFrame();
        jf1.setSize(500,300);
        jf1.setVisible(true);
        jf2.setSize(300,500);
        jf2.setVisible(true);
    }// end of main
}// end of JFrameMain

/* 결과
* 500/300 사이즈의 창과 300/500 사이즈의 창이 둘 다 등장함
* Type은 같지만 다른 객체임
* */