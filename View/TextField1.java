package view;

import javax.swing.*;

public class TextField1 {
    //선언부
    JFrame jf = new JFrame();
    JButton btn_send = new JButton("전송");
    //화면그리기 메서드 구현
    public void initDisplay(){
        System.out.println("initDisplay 호출");
        boolean isView = false;
        //insert here
        int width = 500;
        int height = 400;
        jf.add("South", btn_send);
        jf.setSize(width,height);
        //화면에 출력하려면 true 비활성화 하려면 false를 준다.
        isView = true;
        jf.setVisible(isView);
        //재정의 위치가 틀렸다.
        //isView = true;
    }// end of initDisplay

    //메인메서드 구현
    public static void main(String[] args) {
        TextField1 tf1 = new TextField1();
        tf1.initDisplay();
    }// end of main
}// end of Textfield