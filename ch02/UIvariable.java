package ch02;

import javax.swing.*;

public class UIvariable {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        /*
            *** 정리 6 ***
            1. JFrame 클래스에서는 setSize와 setVisible메서드가 선언되어 있다.
            2. 인스턴스 변수로 호출이 가능하다.
            3. 호출할 때는 파라미터ㅢ 타입과 갯수를 맞춰야 한다.
            -- insert
                창의 가로크기를 정하는 변수를 선언하시오
                창의 세로크기를 정하는 변수를 선언하시오
         */
        int width = 500;
        int height = 400; // -> 변수 정의
        width = 800;
        jf.setSize(width, height);
        boolean isView = true;
        isView=false;
        isView=true;
        // if.setVisable (상수값 대신에 변수를 작성하시오)
        // setVisible()의 파라미터 자리에 boolean 타입이 와야 함
        // 만일 true이면 보이고, false면 화면에 보이지 않음.
        jf.setVisible(isView);
        // 인스턴스 만들고 -> 변수 선언하고 -> setSize(창만들고) -> setVisible(시각화)
    }// end of main
}// end of UIvariable
