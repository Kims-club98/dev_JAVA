// date 25.12.08 14:37

package ch06;

import javax.swing.*;

class C2{

}

public class C2Main {
    JFrame jf1=new JFrame();
    JFrame jf2=new JFrame("제목");
    public static void main(String[] args) {
        C2Main cm = new C2Main();
        cm.jf1.setSize(300,300);
        cm.jf1.setVisible(true);
        cm.jf2.setSize(400,300);
        cm.jf2.setVisible(true);
    }
}
