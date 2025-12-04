//date 25.12.03 11:41
// title: implements ActionListener

package ch05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* === 정리 5 ===
   - 내 안에 actionPerfomed메서드가 들어옴
   - 내(FirstArray05)가 ActionListener 인터페이스 구현체 클래스가 되었다.
   - 인터페이스는 단독으로 인스턴스화 할 수 없음(구현체 클래스가 있어야 하기 때문)
   - 인터페이스는 안에 있는 메서드는 추상 메서드 이다(기능에 대해 결정할 수 없음)
     -> 왜 결정할 수 없는가? -> 어느 Device에 들어갈 지 모름
   - 인터페이스에 정의된 메서드는 그 장치에서 그 기능이 필요하다는 가이드(메서드 오버리이딩)
   - 원형 훼손 없이 기능을 구현해줘!(==Return type, Parameter 개수, type을 건들지 않고 기능만 구현요청)*/
public class FirstArray05 implements ActionListener {
    public static void main(String[] args) {
        FirstArray05 fa5=new FirstArray05(); // 인스턴스화
        JFrame jf = new JFrame();
        jf.setLayout(new GridLayout(3,2));
        JButton btns[] = new JButton[6];
        String btns_label[] = new String[]{"1:1대화","대화명 변경","나가기","글자색 변경","이모티콘","방 만들기"};// 변수 선언(line 10~12)
        for(int i=0;i<btns.length;i++){ // 6번을 반복하는 for문
            btns[i]=new JButton(btns_label[i]);
            jf.add(btns[i]);
            btns[i].addActionListener(fa5);
            // insert here

        }// end of for문
        jf.setSize(600,700);
        jf.setVisible(true);
    }// end of main

    // 부모 가진 메서드 원형을 재정의한다(매서드 오버라이드)
    // 하단 메서드는 개발자가 직접 호출 불가능 - main - 콜백(callback)
    @Override
    public void actionPerformed(ActionEvent e) {
        // 6개 버튼 중 무었이 눌렸는지 구분해야 함 -> if 문 활용(필수)
        Object obj = e.getSource(); // type은 맞춰야 함(String - Object XX)
        String buttonLabel= e.getActionCommand(); // getActionCommand => String을 받아야 함.
        System.out.println(buttonLabel+" , "+obj);
        if("글자색변경".equals(buttonLabel)){
            System.out.println("글자색 변경을 누르셨나요?");
        }// end of if

    }//end of actionPerfomed
}// end of FirstArray05
