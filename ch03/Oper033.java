//date 25.12.01 15:34
// JFrame 창 만들기.
package ch03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oper033 implements ActionListener {
    JFrame jf = new JFrame();
    JTextField jtf_first = new JTextField(5);
    JTextField jtf_second = new JTextField(5);
    JButton btn_account = new JButton("계산");
    JTextField jtf_result = new JTextField(10);

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj=e.getSource(); //이벤트가 감지된 주소번지를 가져옴.
        // 버튼을 클릭하였을 때(if 문)
        if(obj==btn_account){
            System.out.println("계산버튼 클릭됨"); // btn_account 버튼일 눌릴 때마다 계산버튼 클릭됨이 출력됨.
        } // end of obj==btn_account의 조건식)

        String sFirst = jtf_first.getText();
        int iFirst=Integer.parseInt(sFirst);
        String sSecond = jtf_second.getText();
        int isecond=Integer.parseInt(sSecond);
        jtf_result.setText("덧셈을 처리한 결과값이 온다.");
        /* +++++ 정리 10 +++++
           1. setText 메서드는 JTextField가 제공하는 것, 파라미터 type은 String type올 정해져 있다.
        */
        // 다음 result 의 차이점 확인해볼 것.
        jtf_result.setText("100");
        //jtf_result.setText(100);
        jtf_result.setText(String.valueOf(100));
        // 덧셈결과
        jtf_result.setText(String.valueOf(iFirst+isecond));

    }// end of actionPerfomed


    public static void main(String[] args) {
        Oper033 op033 = new Oper033();
        // ★ 아래 코드가 없으면 actionPerfomed 메서드가 호출되지 않음 ↓
        op033.btn_account.addActionListener(op033);
        op033.jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        op033.jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        op033.jf.add(op033.jtf_first);
        op033.jf.add(op033.jtf_second);
        op033.jf.add(op033.btn_account);
        op033.jf.add(op033.jtf_result);
        op033.jf.setSize(400,300);
        op033.jf.setVisible(true);
    } // end of main
}//end if Oper033(implements ActionListener)