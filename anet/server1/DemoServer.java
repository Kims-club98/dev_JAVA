package anet.server1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

// main 스레드와 이벤트 스레드가 경합이 벌어지더라도, 중단이나 충돌로 인해 멈춤 또는 비정상적 진행(무한 Loop)
public class DemoServer extends JFrame implements Runnable, ActionListener {
    ServerSocket server = null;// 서버에 대한 정보만 발급
    Socket client = null;
    List<DemoServerThread> globalList = null;
    JTextArea jta_log = new JTextArea(10,30);
    JScrollPane jsp_log = new JScrollPane(jta_log,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
            , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    Font f = new Font("돋움체", Font.BOLD,20);
    private volatile boolean isStop =false;
    int g_port=0;// ← 포트번호를 동적으로 처리하기


    //서버로그 화면 바로 위에 배치할 속지선언
    JPanel jp_north 		= new JPanel();
    //서쪽에는 포트번호 라벨-JLabel jlb_port
    //중앙에는 jtf_port
    //동쪽에는 jbtn_start
    JPanel jp_north_center 	= new JPanel();
    JPanel      jp_south    = new JPanel();
    JLabel      jlb_port    = new JLabel("포트번호");//3차미만 화면중심의 업무처리가 많다.
    JTextField 	jtf_port 	= new JTextField("3000",JLabel.RIGHT);
    JButton 	jbtn_start 	= new JButton("서버기동");
    JButton 	jbtn_down 	= new JButton("서버다운");
    JButton 	jbtn_clear 	= new JButton("로그 초기화");

    @Override
    public void run() {
        globalList= new ArrayList<DemoServerThread>();
        try {
            // 서버 소켓 생성
            server = new ServerSocket(g_port); // ← g_port는 포트번호 동적 설정을 위해 변수 ㅓㄴ언
            jta_log.append("ServerSocket Ready......! \n");; // 줄바꿈 \n
            while (!isStop) {
                client = server.accept();
                System.out.println(client);
                jta_log.append("접속해온 사람 => => "+client+"\n");
                DemoServerThread bst = new DemoServerThread(this);
                globalList.add(bst);
                jta_log.append("현재 인원 수 : "+globalList.size()+"\n");
                bst.start();
            }// end of while
        } catch (Exception e) {
        // 서버를 의도적으로 종료한 경우에는 예외 로그를 출력하지 않음
            if(!isStop){
                e.printStackTrace();
            }else{
                jta_log.append("서버가 정상적으로 종료되었습니다...!\n");
            }// end of if
        }finally {
            try{
                if(server!=null && !server.isClosed()){
                    server.close();
                }// end of if
            }catch (Exception e){
                System.out.println(e.getMessage());
            }// end of inner try
        }// end of try(try-catch-finally-catch 순서)
    }// end of void run

    public static void main(String[] args) {
        DemoServer bs = new DemoServer();
        bs.initDisplay();
        // main스레드가 아닌 다른 하나의 스레드가 있음.
        Thread t = new Thread(bs); // main  Thread와 이벤트 스레드 충돌이나 중단점
        t. start();// run()호출됨 - 지연이 발생할 가능성있는 코드를 따로 관리한다.
    }// end of main

    void initDisplay(){
        jbtn_start.addActionListener(this);
        jbtn_down.addActionListener(this);
        jbtn_clear.addActionListener(this);
        jtf_port.setHorizontalAlignment(JTextField.RIGHT);
        jta_log.setBackground(Color.green);
        jta_log.setFont(f);
        jp_north_center.setLayout(new BorderLayout());
        jp_north_center.add("West",jlb_port);
        jp_north_center.add("Center",jtf_port);
        jp_north_center.add("East",jbtn_start);
        jp_north.setLayout(new BorderLayout());
        jp_north.add("Center",jp_north_center);
        jp_north.add("East",jbtn_down);
        jp_south.setLayout(new GridLayout(1,6));
        jp_south.add(jbtn_clear);
        this.setSize(400,400);
        this.add("North",jp_north);
        this.add("Center",jsp_log);
        this.add("South",jp_south);
        this.setVisible(true);
    }// end of initDisplay

    @Override
    public void actionPerformed(ActionEvent e) {
        // 이벤트가 감지된 이벤스 소스 주소번지 가져오기.
        // e의 type ActionEvent타입 이다 -> 파라미터 -> 호출될 때 객체주입됨.
        // actionPerformed는 callback이라서 개발자가 직접 호출 不可
        // 이벤트 감지 시 JVM이 자동으로 호출
        Object obj=e.getSource();
        // 서버 기동 버튼 참 -> 눌렀다!
        if(obj==jbtn_start){
            // 예외처리가 필요한 경우: 숫자가 아닌 문자열인 경우 예외처리 必(NumException ex)
            try {
                // -> 이미 서버가 가동 중이라면 다시 시작되지 않도록 처리하는 함수
                if (server != null && server.isClosed()) {
                    jta_log.append("이미 서버가 기동중입니다...! \n");
                    // 서버가 이미 가동중이면 port 번호로 개설이 안됨.
                    // 다음 코드를 실행할 필요가 없음.(이때 braeak가 아닌 return을 사용함)
                    return;
                }// end of if
                // 사용자가 JTextField에 입력한 포트번호를 문자령이므로 숫자형으로 전환.
                g_port = Integer.parseInt(jtf_port.getText());
                // 새로운 서버의 시작이므로 초기화를 해줘야 한다. - false
                isStop=false;
                Thread th = new Thread(this);
                th.start();
            }catch(NumberFormatException nfe) {
                jta_log.append("포트 번호를 숫자로 입력하세요...!\n");
            }// end of try
        }// end of 서버시작

    }// end of actionPerfomed
}// end of DemoServer extend JFrame implements Runnable