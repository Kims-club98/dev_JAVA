// 부모가 죽으면 자식도 같이 죽음
package anet.mvc.Basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChildjDialog extends JDialog implements ActionListener {
    JButton btn_ok = new JButton("확인");
    JButton btn_cancel = new JButton("취소");
    JScrollPane jsp = new JScrollPane();
    JPanel jp_south = new JPanel();
    ParentJFrame pj = null;
    public ChildjDialog (JFrame owner){
        super(owner,"Child JBialog",false);
        // 아래 낮말카드를 쓸 수 있다.
        pj = (ParentJFrame) owner;
        initDisplay();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if(obj == btn_ok){
            pj.refresh();
        }
    }

    public void  initDisplay(){
        this.setTitle("입력|수정|상세보기");
        jp_south.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp_south.add(btn_ok);
        jp_south.add(btn_cancel);
        this.add("South",jp_south);
        this.add("Center",jsp);
        this.setSize(300,300);
        this.setVisible(false); // 테스트 시 true로 확인하기
        //this.disapose()
    }

    public static void main(String[] args) {
        ParentJFrame frame = new ParentJFrame();
        frame.initDisplay();
    }// end of main
}
