package ch05.aobject2.design;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Spring Boot 에서는 개발자가 직접 인스턴스화 하지 않음!
// 주의! ) 생성자에는 return type이 없다. (void, static 기입 NO)
public class JFrame01Event implements ActionListener {
    JFrame01View jv = null; // new ___ 하면 복사본이 됨, 원본을 위해 null 이후 작성
    public JFrame01Event(JFrame01View jv){
        System.out.println("JFrame01Event 생성자 호출 성공");
        this.jv=jv;
    }// jframe01

    @Override
    public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand();
        System.out.println(command);
        if("조회".equals(command)){
            System.out.println("조회번튼이 클릭");
           jv.jlogic.getlist();
        }// e.f if(조회 equal)
    }// e.f actionPerfomed
}// e.f JFrame01Event
