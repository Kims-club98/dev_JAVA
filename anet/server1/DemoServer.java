package anet.server1;

import anet.step1.BananaServerThread;

import javax.swing.*;
import java.net.ServerSocket;
import java.net.Socket;

// main 스레드와 이벤트 스레드가 경합이 벌어지더라도, 중단이나 충돌로 인해 멈춤 또는 비정상적 진행(무한 Loop)
public class DemoServer extends JFrame implements Runnable {
    ServerSocket server = null;// 서버에 대한 정보만 발급
    Socket client null;

    @Override
    public void run() {
        try {
            // 서버 소켓 생성
            server = new ServerSocket(5000);
            System.out.println("ServerSocket Ready...!\n"); // 줄바꿈 \n
            while (!isStop) {
                client=new ServerSocket(5000);
                System.out.println("ServerSocket Ready...");
                DemoServerThread bst = new DemoServerThread(this);
                bst.start();
            }// end of while
        }catch (Exception e) {
            System.out.println(e.toString());
        }// end of catch(outer while)