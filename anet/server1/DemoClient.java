// date 25.12.09 10:12
// title:
package anet.server1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class DemoClient extends JFrame implements ActionListener {
    Socket          socket = null;
    ObjectInput     ois    = null;
    ObjectOutput    oos    = null;
    String        nickName = null;


    public void init(){
        try {
                      socket = new Socket("127.0.0.1",3000); // 서버와 TCP 연결
                      ois = new ObjectInputStream(socket.getInputStream()); // 말하기(서버 -> 클라이언트 오는 객체 읽는 스트림)
                      oos = new ObjectOutputStream(socket.getOutputStream()); // 청취 output (클라이언트 -> 서버를 쓰는 스트림)
                      // 내가 접속한 사실을 상대에게 알린다.
            oos.writeObject(100+"#"+nickName);// 사용자 입력 대화명
        } catch (Exception e) {
            e.printStackTrace();
        }// end of try
    }// end of init ㉡

// ♣ main -> 프로그램 진입
    public static void main(String[] args) {
        DemoClient dc=new DemoClient(); // 인스턴스화 -> 전변에서 메서드를 가져와서 써야지!~
        dc.initDisplay(); // 화면으로 출력하기 ㉠
        dc.init(); // 소켓 생성 후 생성된 소켓으로 IO클래스를 생성해야 함. ㉡
    }// end of main

//  ♣ 출력부분
    public void initDisplay(){
        nickName=JOptionPane.showInputDialog(this,"닉네임을 입력하세요!");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }// end of initDisplay ㉠ => 실행 시 서버가 연결되기 전까지 연결.


    @Override
    public void actionPerformed(ActionEvent e) {

    }// end of actionPerformed(@Override)
}// end of DemoClient
