//date 25.12.05 11:11
// title

package ch06;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MemberTable {
    //1. 선언부
    JFrame jf = new JFrame();
    JPanel jp = new JPanel();// FlowLayout
    String [][] data = new String[0][3];
    // 2차배열 인스턴스/ 1차 String 인스턴스 후 model 에 대입 ↓
    String[] cols = new String[]{"아이디","이름","나이"};
    DefaultTableModel model = new DefaultTableModel(data,cols);
    // 2개의 클래스 연결을 위해 jt 에 model을 파라미터로 넣기 ↓
    JTable jt = new JTable(model);
    // JScrollpane 의 옵션 부여 ↓ (정책 상 VERTICAL_SCROLLBAR_AS_NEEDED가 먼저 기입)
    JScrollPane jsp = new JScrollPane(jt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                                        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    JButton btn_select=new JButton("조회");
    JButton btn_inert=new JButton("입력");
    JButton btn_update=new JButton("수정");
    JButton btn_delete=new JButton("삭제");

    //2. 생성자
    public MemberTable(){
        initDisplay();
    }

    //3. 화면처리부
    public void initDisplay(){
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫게 되면 프로세스가 자동으로 종료 됨.
        jp.setBackground(Color.orange);
        jp.setLayout(new FlowLayout(FlowLayout.RIGHT));
        jp.add(btn_select);
        jp.add(btn_inert);
        jp.add(btn_update);
        jp.add(btn_delete);
        jf.add("North",jp);
        jf.add("Center",jsp);
        jf.setSize(400,400);
        jf.setVisible(true);

    }

    //4. main
    public static void main(String[] args) {
        MemberTable mt = new MemberTable();
    }
}
