//date 25.12.04 15:08

package ch05.aobject3;
import ch05.aobject.MemberVO;
// java.lang 패키지는 자동으로 Import됨 but 나머지는 따로 해야 함.

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class JTableDemo {
    JFrame          jf              = new JFrame();
    MemberVO[]      mvos            = new MemberVO[3];
    JPanel          jp_north        = new JPanel();
    String          cols[]          = {"아이디","이름","나이"};
    String          data[][]        = new String[30][3];
    /*  == 정리 5 ==
        1. JTable은 양식(폼) - <Table> - JTable이 데이터를 가질 수 없음
        2. Table 구조를 그려주는 클래스와 데이터셋을 만들르어주는 클래스가 분리됨
    */
    DefaultTableModel dtm_member    = new DefaultTableModel(data,cols);
    JTable          jtb_member      = new JTable(dtm_member);
    JTableHeader    header          = jtb_member.getTableHeader();
    JScrollPane     jsp_member      = new JScrollPane(jtb_member); // 스크롤바를 만들어주는 기능임
    JButton         jbtn_all        = new JButton("전체조회");
    public JTableDemo(){
        initDisplay();
    }


    // * 화면을 그리는 메서드(일부러 분리)
    public void initDisplay(){
        jf.add("North",jbtn_all);
        jf.add("Center",jsp_member);
        jf.setSize(500,400);
        jf.setVisible(true);
    }

    // * 메인 메서드(출력)
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JTableDemo jtd = new JTableDemo();
    }
}