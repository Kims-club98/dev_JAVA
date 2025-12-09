package anet.step1;
/*
자바는 단일상속만 가능하므로 Thread상속받을 수 없다.
그래서 인터페이스인 Runnable implements한 다음 run재정의 한다.
 */
import ch03.B;

import javax.swing.*;
import java.awt.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class BananaServer extends JFrame implements Runnable{
    //동시에 여러 사용자가 접속할 수 있도록 서버소켓을 사용함.
    ServerSocket server = null;
    //서버에 접속해온 사용자 소켓 정보를 담을 소켓 선언
    Socket client = null;
    //서버에 접속해온 여러 사용자 스레드 담을 객체 선언
    List<BananaServerThread> globalList = null;
    JTextArea jta_log = new JTextArea(10,30);
    JScrollPane jsp_log = new JScrollPane(jta_log,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
            , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    Font f = new Font("돋움체", Font.BOLD,20);

    @Override
    public void run() {
        globalList = new ArrayList<BananaServerThread>();
        System.out.println(globalList.size());
        try {
            // 서버 소켓 생성
            server = new ServerSocket(5000);
            System.out.println("ServerSocket Ready...!\n"); // 줄바꿈 \n
            while (true) { // 무한루프(서버 계속 돌리기)
                // 서버 소켓에 접속해온 클라이언트 소켓에 대한 정보를 받아내기
                // 여기서 waiting 상태가 된다.
                client = server.accept();
                // 누군가 입장했다면, 클라이언트 정보를 읽기
                System.out.println(client.getInetAddress());
                // 클라이언트에 대한 소켓 정보를 얻어내면 BananaServerThread에게 제어권을 넘겨 채팅기능 구현
                BananaServerThread bst = new BananaServerThread(this);
                bst.start();
            }// end of while
        }catch (Exception e){
            System.out.println(e.toString());
        }// end of try

    }//end of run

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        BananaServer bs = new BananaServer();
        bs.initDisplay();
        // main스레드가 아닌 다른 하나의 스레드가 있음.
        Thread t = new Thread(bs);
        t. start();
        // 스레드와 충돌이 일어나지 않도록 하기 위해 수행함.
    }//end of main


    //서버에 로그를 출력하기 위해 화면 그리기
    public void initDisplay() {
         //화면 그리기 메소드 구현
        jta_log.setBackground(Color.orange);
        jta_log.setFont(f);
        // 여기서 this => BananaServer를 말함
        // But JFrame이 제공하는 setTile() 호출할 수 있는가>
        // JFrame을 상속받았기에 부모가 제공하는 메서드 호출 가능
        this.add("Center",jsp_log);
        this.setSize(800, 400);
        this.setVisible(true);
    }// end of initDisplay

}//end of BananaServer