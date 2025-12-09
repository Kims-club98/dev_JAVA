package anet.server1;
// 지속적으로 듣기
// 클래스와 클래스 사이 관계가 있음 -> 의존성 주입 -> 인스턴스화
public class DemoClientThread extends Thread{
// NO DemoClient dc = new DemoClient(); ** 복사본 생성하면 안됨
    DemoClient dc = null;
    public DemoClientThread(DemoClient dc) {
        // 생성자와 파라미터로 받아온 객체를 run()에서 사용해햐 ㅏㅎ낟.
        // But 나는 지변 -> 생성자를 벗어난 위치는 사용이 不可
        // 생성자의 파라미터 자리는 생성자가 호출될 때 객체를 참조하게 됨.
        // 아래 생성자는 어디서 호출되는가??? =>DemoClient 에서 호출
        // 언제 어느 위치에서 누구 다음에 하면 되는가? => new Socket("상대 IP",port 번호); [[소켓 생성]] 접점이 생긴다!!
        this.dc =dc;
    }// end of public dc
    @Override
    public void run(){

    }// end of void run
}// end of DemoClientThread
