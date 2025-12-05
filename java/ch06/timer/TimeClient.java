// date 25.12.05 15:36
/* title:
    - 기지국에서 1초에 한 번씩 보내주는 시간정보를 청취하기.
    - 지속적으로 1초에 한 번씩 실행문을 철이하기 위해서 Thread를 상속받음.
 */
package ch06.timer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TimeClient extends Thread {
//  ● 생성자
    public TimeClient(){
        System.out.println("TimeClient 생성자 호출");
    }// end of TimeClient
/*  == 정리 ==
    1. Thread가 선언하고 있는 run()을 재정의하여
    2. 그 속에서 소켓생성을 통하여 TimeServer의 serverSocket에 접속함.
 */

    @Override
    public void run(){
        System.out.println("TimeClient run() 호출");
        Socket socket = null;
        PrintWriter out =null;// 쓰기
        BufferedReader in =null;// 정취하기
        // 서버측에서 소켓에 쓴 현재 시간의 정보를 담기 ↓
        String time=null;
        try{
            socket = new Socket("192.168.0.27",3000); // 192.168.0.41 강사
            out=new PrintWriter(socket.getOutputStream(),true);
            in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while(true){
                while((time = in.readLine())!=null){
                    System.out.println(time);
                }
                try {
                    sleep(1000);
                }catch(InterruptedException e){
                    e.getMessage();//스레드 관련 에러 발생시 출력하기
                }//end of inner while
            }//end of outer while
        }catch (Exception e){
        }
    }//end of run

//  ○ main 메서드
    public static void main(String[] args) {
        TimeClient timeClient = new TimeClient();// 인스턴스화 -> 다른 생성자가 호출됨.
        //run()직접 호출하지 않고, start()호출하면 JVM이 대신 호출을 해준다!!
        timeClient.start();
    }// end of main

}// end of class TimeClient extends Thread
