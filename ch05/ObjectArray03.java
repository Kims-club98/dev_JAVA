// date 25.12.02 18:12
//title: GridLayout(비율대로 N분의 1)

package ch05;

import javax.swing.*;
import java.awt.*;

public class ObjectArray03 {
    public static void main(String[] args) {
        // JFrame 디폴트 레이아웃은 무었이었나 ==> BorderLayout
        JFrame jf = new JFrame();
        jf.setLayout(new GridLayout(3,2));
        JButton btns[] = new JButton[5]; // btn의 배열 인스턴스화
        String btn_labels[]={"동쪽[0]","서쪽[1]","남쪽[2]","북쪽[3]","중앙[4]"}; // 버튼 내역을 넣을 btn_label 배열을 만들고 넣어줌
        for(int i=0;i<btns.length;i++){ // btns.length => 5
            btns[i]=new JButton(btn_labels[i]);
            jf.add(btns[i]);
        }// end of for

        jf.setSize(500,500);
        jf.setVisible(true);

    }// end of main
}// end of ObjectArray03
