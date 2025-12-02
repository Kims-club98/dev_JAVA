// date 25.12.02 17:51
// title: 객체 배열

package ch05;

import javax.swing.*;
// Q. 객체에 들어갈 버튼 5개를 만들기(동서남북 중앙)
public class ObjectArray01 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JButton btns[] = new JButton[5]; // btn의 배열 인스턴스화
        String btn_labels[]={"동쪽[0]","서쪽[1]","남쪽[2]","북쪽[3]","중앙[4]"}; // 버튼 내역을 넣을 btn_label 배열을 만들고 넣어줌
        for(int i=0;i<btns.length;i++){ // btns.length => 5
            btns[i]=new JButton(btn_labels[i]);
        }// end of for

        jf.setSize(500,500);
        jf.add("East",btns[0]); // 동쪽 버튼 추가
        jf.add("West",btns[1]); // 서쪽 버튼 추가
        jf.add("South",btns[2]); // 남쪽 버튼 추가
        jf.add("North",btns[3]); // 북쪽 버튼 추가
        jf.add("Center",btns[4]); // 중앙쪽 버튼 추가

        jf.setVisible(true);

    }// end of main

}// end of ObjectArray01

//정리 10...