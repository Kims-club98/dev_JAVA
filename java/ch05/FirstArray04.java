//date 25.12.03 11:10
// title: 낱말카드 만들기

package ch05;

import javax.swing.*;
import java.awt.*;
/* === 정리 4 ===
    1. 배열(Array):
        - 같은 타입의 데이터 여러 개를 한 번에 저장하기 위한 변수 선언
        - 이름 1개로 어려개를 관리함(btns_label -> {..,..,..}
        - 배열을 사용할 때 항상 반복문(for문)을 같이 사용됨.
       한계 > 제한된 크기, 끼워넣기 불가, 같은 type만 받음(String은 String만...), index로만 접근(직관성 issue)

 */
public class FirstArray04 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setLayout(new GridLayout(3,2));
        JButton btns[] = new JButton[6];
        String btns_label[] = new String[]{"1:1대화","대화명 변경","나가기","글자색 변경","이모티콘","방 만들기"};// 변수 선언(line 10~12)
        for(int i=0;i<btns.length;i++){ // 6번을 반복하는 for문
            btns[i]=new JButton(btns_label[i]);
            jf.add(btns[i]);
            // insert here

        }// end of for문
        jf.setSize(600,700);
        jf.setVisible(true);
    }// end of main
}// end of FirstArray04
