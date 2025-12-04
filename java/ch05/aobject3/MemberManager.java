package ch05.aobject3;
//java.lang패키지는 자동으로 임포트 되지만 나머지는 따로 해야 함.
import jdbc.MemberVO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class MemberManager implements ActionListener {
    JFrame          jf              = new JFrame();
    MemberVO[]      mvos            = new MemberVO[3];
    JPanel          jp_north        = new JPanel();
    String          cols[]          = {"아이디","이름","나이"};
    String          data[][]        = new String[0][3];
    DefaultTableModel dtm_member    = new DefaultTableModel(data,cols);
    //JTable은 양식(폼) - <table> - JTable이 데이터를 가질 수 없음
    //테이블구조를 그려주는 클래스와 데이터셋을 만들어주는 클래스가 분리됨
    JTable          jtb_member      = new JTable(dtm_member);
    JTableHeader    header          = jtb_member.getTableHeader();
    JScrollPane     jsp_member      = new JScrollPane(jtb_member);
    JButton         jbtn_all        = new JButton("조회");
    public MemberManager(){
        //생성자 안에서 내 안에 선언된 메서드를 호출할 땐
        //인스턴스 변수가 필요없음.
        initDisplay();
    }
    //화면 그리기 구현
    //front-end와 back-end 경계되는부분
    public void initDisplay(){
        System.out.println("initDisplay");
        jbtn_all.addActionListener(this);
        jf.add("North",jbtn_all);//북쪽에 버튼 배치하기
        jf.add("Center",jsp_member);//중앙에 배치하기
        jf.setSize(500,400);//가로세로 크기
        jf.setVisible(true);//화면 보여줌
    }
    public void getMemberList(){
        MemberVO mvo = new MemberVO();
        mvo.setMem_id("apple");
        mvo.setMem_name("사과");
        mvo.setMem_age(20);
        mvos[0] = mvo;
        mvo = new MemberVO();
        mvo.setMem_id("banana");
        mvo.setMem_name("바나나");
        mvo.setMem_age(30);
        mvos[1] = mvo;
        mvo = new MemberVO();
        mvo.setMem_id("cherry");
        mvo.setMem_name("체리");
        mvo.setMem_age(40);
        mvos[2] = mvo;
    }
    public static void main(String[] args) {
        MemberManager mm = new MemberManager();
        //mm.initDisplay();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("조회버튼을 눌렀을 때만 호출됨.-개발자가 호출하는게 아님");
        String command = e.getActionCommand();//버튼의 라벨을 읽어옴.
        //조회 버튼 누른거야? 네

        if("조회".equals(command)){
            // ↓ 메서드의 역할은 MemberVO[]의 의미있는 데이터를 초기화 하는 부분이다.
            // 즉 아래 메서드를 주석으로 막으면 초기화가 되지 않음 -> null, null, null -> NullpointException
            getMemberList(); //-> 객체 배열의 초기화기 되지 않음.(초기화버튼)

            //조회 버튼을 눌렀을 때 기존에 있는 행은 모두 삭제하는
            //코드를 작성하시오.
            //행의 수가 0보다 크다면 기존에 조회된 결과가 남아있음.
            while(dtm_member.getRowCount() > 0){
                /* 왜 0만 지우는가? -> DefaultTableModel의 행이 지워질 때마다 행의 Index 값이 1씩 줄어드니까
                                    큰 숫자부터 지우게 되면 지워진 다음에 행의 인덱스 값이 1 줄어들면서 존재하지 않으므로
                                    맨앞에 부터 지움
                 */
                dtm_member.removeRow(0);
            }

            for(int i=0;i<mvos.length;i++){
                MemberVO mvo = mvos[i];
                Vector<Object> v = new Vector<>();
                v.add(mvo.getMem_id());
                v.add(mvo.getMem_name());
                v.add(mvo.getMem_age());
                dtm_member.addRow(v);
            }// end of for
        }// end of if
    }
}