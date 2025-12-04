// date 25.12.04 12:02
// title:

package ch05.aobject2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrame01 implements ActionListener {
    // 선언부 - 전변선언하기 ======
    JFrame jf = new JFrame();
    JButton btn = new JButton("조회");

    // 생성자  ==========
    public JFrame01(){
        System.out.println("디폴트 생성자 호출");
        this.initDisplay();
    } // JFrame01

    public void initDisplay(){
        System.out.println("initDisplay 출력");
        // 하단 코드에서의 this ==> 현재 메모리에 로딩된 JFrame임 => 이벤트가 감지된 버튼과 버튼이 클릭되었을 때 처리 담당할
        // 클래스 연결이 필요함(IF 아래 코드를 누락하면 이벤트 감지가 일어나지 않음)
        // 이벤트 처리를 담당하는 이벤트 핸들러 클래스를 연결.(이벤트 핸들러 클래스: actionPreformed라는 추상 메서드를 구현한 클래스를 말함)
        btn.addActionListener(this);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add("North",btn);
        jf.setSize(500,400);
        jf.setVisible(true);
    }// initDisplay

    public static void main(String[] args) {
        JFrame01 jFrame01 = new JFrame01();
    } // main

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        System.out.println(command);// 클릭 할 때마다 감지되어 해당 메서드 호출함
        if("조회".equals(command)){
            System.out.println("조회 버튼이 클릭됨");
        }// if
    }// actionperformed

    // 오라클 서버에서 select한 결과를 받아오는 메서드
    public Object getList(){ // 목록을 가져오는 메서드
        System.out.println("오라클 연동해서 목록 가져오기 처리");
        return null;
    }// getList

}// JFrame01
