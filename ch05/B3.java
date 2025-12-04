//date 25.12.03 10:40
// title: UI class

package ch05;

import javax.swing.*;

public class B3 {
// 변수선언(생성은 아직 X) -> new 가 無
    JFrame jf=null; // 변수선언
    // (암기) ★☆★☆★☆ static 영역에서는 non-static변수 jf는 사용이 불가능하다. ★☆★☆★☆
    public static void main(String[] args) {
        B3 b3=new B3(); // 인스턴스화 (b3 => 인스턴스변수)
        /* === 정리 3 ===
        (중요) 주소번지 두 번 접근해야 호출이 가능함(간접 참조 방식)
        B3클래스와 JFrame클래스는 서로 의존관계가 있음.
        */
        if (b3.jf == null) {
            b3.jf=new JFrame();
        }// end of if
        b3.jf.setSize(500,400);
        b3.jf.setVisible(true);
        /* 오답 jf.setSize(500,400);
               jf.setVisible(true); */
    }// main
}// end of B3

// 정리 4로 ...
