// date 251209 11:40
package anet.server1;

public class DemoServerThread extends Thread{
    DemoServer ds = null;
    public  DemoServerThread(DemoServer ds){
        this.ds= ds;
    }// end of dst

    @Override
    public void run(){

    }// end of run
}// end of DemoServerThread extends Thread


/*
* extend 부모 하나만 가능
*/