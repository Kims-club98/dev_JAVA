// date 251209 11:40
package anet.server1;

import java.net.Socket;

public class DemoServerThread extends Thread{
    DemoServer ds = null;
    Socket client = null;
    // 서비스레드에서도 24시간 무중단 서비스를 제공함
    private volatile  boolean isRun= false;
    public  DemoServerThread(DemoServer ds){
        this.ds= ds;
    }// end of dst

    @Override
    public void run(){

    }// end of run

    public void closeThread(){
        isRun =false;
        // Thread는 여러가지 이유로 sleep 상태에 있거나 wait 상태에 있을 수 있다.
        interrupt();// 잠자고 있거나, 대기중은 스레드를 깨우는 메서드
        try{
           if(client !=null && !client.isClosed()){
               client.close();
           }// inner if
        }catch (Exception e){
            e.printStackTrace();
        }// end of try
    }// end of closeThread
}// end of DemoServerThread extends Thread


/*
* extend 부모 하나만 가능
*/