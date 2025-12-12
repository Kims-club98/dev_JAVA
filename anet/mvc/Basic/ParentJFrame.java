package anet.mvc.Basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ParentJFrame extends JFrame implements ActionListener { // 규칙1: 추상 메서드에서는 Override가 필수이다.
    ChildjDialog childJDialog = new ChildjDialog(this);
    JPanel jp_north = new JPanel(); //속지 역할 수행(북)
    JButton btn_insert = new JButton("입력");
    JButton btn_update = new JButton("수정");
    JButton btn_delete = new JButton("삭제");
    JButton btn_select = new JButton("조회");
    JButton btn_detail = new JButton("상세조회");
    JScrollPane jp_center = new JScrollPane();

    public void refresh(){
        System.out.println("refresh 호출 성공");
    }// end of refresh

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        // 1. 입력버튼이 클릭되었을 때
        if (source == btn_insert){
            System.out.println("입력");
            childJDialog.setTitle("입력");
            // 아래 코드를 추가하는 이유는 최초 setVisable파라미터 값이 false이므로
            childJDialog.setVisible(true);
        }
        // 2. 수정 버튼 클릭 시
        if (source == btn_update){
            System.out.println("수정");
            childJDialog.setTitle("수정");
            childJDialog.setVisible(true);
        }
        // 3. 상세조회 틀릭 시
        if(source == btn_detail){
            System.out.println("상세조회");
            childJDialog.setTitle("상세조회");
            childJDialog.setSize(150,150);
            childJDialog.setVisible(true);
        }
        // 4. 삭제버튼 클릭 시
        if(source == btn_delete){
            System.out.println("삭제");
            childJDialog.setTitle("삭제");
        }
        //5. 조회버튼 클릭 시
        if(source == btn_select){
            System.out.println("조회");
            childJDialog.setTitle("조회");
        }
    }// Override actionPerfomed 끝

    public void initDisplay(){
        btn_insert.addActionListener(this);
        btn_update.addActionListener(this);
        btn_delete.addActionListener(this);
        btn_select.addActionListener(this);
        btn_detail.addActionListener(this);
        jp_north.setLayout(new FlowLayout(FlowLayout.RIGHT));
        jp_north.add(btn_insert);
        jp_north.add(btn_update);
        jp_north.add(btn_delete);
        jp_north.add(btn_select);
        jp_north.add(btn_detail);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
    }//initDisplay 끝

    public static void main(String[] args) {
        ParentJFrame frame = new ParentJFrame();
        frame.initDisplay();
    }// main 끝
}
