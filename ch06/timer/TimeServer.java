// date 25.12.05 14:49
// title:
package ch06.timer;

import java.io.BufferedReader; // 청취 가능 클래스
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class TimeServer extends Thread {
//  ● 선언부
    private Socket socket; // 소켓을 생성
    public TimeServer(Socket socket){
        this.socket=socket;
    }

//  ● 생성자
    // Thread run 메서드를 재정의 해야 함
    // 경합이 벌어지는 일, 순서대로 처리하는 일, 지속적으로 뭔가를 해야 할 때.
public void run() {
    try {
        // 서버 소켓에 접속한 클라이언트(사용자) 소켓을 사용하여 쓰기 클래스 생성함.
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        // 현재 클래스에서는 굳이 필요 없음.(메시저를 만드는게 아니므로 필요 없음)
        BufferedReader in = new BufferedReader(new InputStreamReader(
                socket.getInputStream()));
        while(true) {
            // 클라이언트 소켓에 서버시간을 쓰기(1초 후 다시 반복해서 쓰기)
            out.println(getTime());
            try {
                sleep(1000); // 1초에 한 번 씬 멈춤 처리함.(1초 후에는 다시 깨어남, 단위 밀리세컨드 1000millis = 1s)
            } catch(InterruptedException i) {}
        }

    } catch (IOException e) { // IO패키지 클래스 관련 반드시 예외처리할 것
        e.printStackTrace();
    } // end of try-catch
    finally { // 예외가 발생하더라도 무조건 실행한다!
        System.out.println("\nClient disconnected...\n");
        try {
            socket.close();
        } catch(IOException e) {}
    }// end of finally
}// end of run

    // 시간정보를 반환하는 메서드 구현(시스템 시간 제공)
        // -> ex 02:13:17 (이럴 때 3항연산자를 사용하는 것이 적합하다!)
    public String getTime (){
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY); // 시간 선언
        int min = now.get(Calendar.MINUTE); // 분 선언
        int sec = now.get(Calendar.SECOND); // 초 선언
        return (hour<10 ? "0"+hour : ""+hour)+":"+ // 3항연산자 ?로 진행 10 보다 작으면 03, 크면 13
                (min<10 ? "0"+min : ""+min) +":"+
                (sec<10 ? "0"+sec : ""+sec); // 쉬운 방법 (3항은 x)
        //return "14:56:10"; // 출력을 위한 더미 자료
    }// end of getTime

    // main 메서드 - 서버는 24시간 계속 살아있음
    public static void main(String[] args) {
        int port = 3000; // 포트번호 선언
        ServerSocket server = null; // 서버의 소켓 선언
        // 서버측에 있는 소켓이지만, 서버 소켓에 접속해온 Client의 소켓을 담을 객체 선언
        Socket client = null; // Client 소켓 담을 객체 선언
        boolean isStop=false;

        // 예외처리
        try{
            server = new ServerSocket(port); // 3000번 socket을 열어둠
        }catch (Exception e){
            System.out.println(port+"번 포트가 사용 중 입니다."); //3000번 포트가 살아있으면 메시지 출력
            e.printStackTrace();// stack에 쌓여있는 에러 메시지를 출력(디버깅 목적)
        } // end of try(예외처리)
        System.out.println("Time Server Start Successfully...");

        while (!isStop){
            try{
                // 서버 소켓에 입장한 Client 소켓 정보를 받아오기.
                // Client측 -> Socket s = new Socket("192.168.0.41", 3000);
                client = server.accept();
                System.out.println(client.getInetAddress());
                System.out.println("손님이 입장하였습니다!");
                TimeServer timeServer = new TimeServer(client); // Client만 입력 시 오류 발생함.(4)
                // -> Thread에 run메서드를 직접 호출하는 것이 아닌 start()호출함.
                // -> run()메서드에서 client 소켓 주소번지가 必
                // -> Client소켓 지역변수이므로 전역에서 사용할 수 있도록 해야함.
                // -> (4) 파라미터가 있는 생성자는 JVM이 자동으로 만들어지지 않음
            }catch (Exception e){
                e.printStackTrace();
                if(client!=null){
                    try{
                        client.close();
                    }catch(Exception e2){

                    } // end of try-catch(if)
                }// end of if
            }// end of try-catch
        }// end of while
    }// end of main
}// end of TimeServer
