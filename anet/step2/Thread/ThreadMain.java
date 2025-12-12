// date 251212 11:55

package anet.step2.Thread;

import static util.CustomLogger.logger;

 class HelloThread extends Thread{
    @Override
    public void run(){
        logger("run() 호출하기");
    }// end og run
}// end of ThreadMain

public class  ThreadMain {
    public static void main(String[] args) {
        logger("main() start");
        // ↓ main 스레드에서 HelloThread를 인스턴스화 하기
        // 만일 스레드 이름을 부여하지 않는다면?? => Thread-0, Thread-1...
        // L 값이 임의의 이름을 부여하게 된다.
        HelloThread ht = new HelloThread(); // run()
        logger("start() 호출 전");
        ht.start();
        logger("start() 호출 후");
        logger("main() end");
    }// end of main Thread
}
/*
    ===== 정리 =====
    1. start() 메서드를 호출하려면 Thread-0 스레드가 시작되면서 Thread-0 스레드가 run()을 호출함
        핵심!!) main() 스레드가 run()실행하는게 아니라 Thread-0 스레드가 run()을 실행한다는 점이다.

       main Thread는 단지 start() 메서드를 통해 Thread-0 스레드에게 실행을 지시하는 것이며
        두 개의 Thread가 공존한다. (== 멀티 스레드)
        순서는 "운영체제"에 의해서 결정이 된다.
        같은 PC라도 요청마다 순서가 달라 질 수 있다(질 수 있다 -> 달라지지 않을 수 있다.)

   2. CPU 개수에 따른 차이
    - CPU가 2개일 때(멀티스레드)
    : 2개 이므로 물리적으로 정말 동시에 실행될 수 있고, 하나의 CPU코더에 시간을 나누어서 실행 될 수도 있는 것이다.
    : 한 Thread가 얼마나 오랜 기간을 실행되는지도 보장하지 않음.
    : 한 Thread가 다 수행된 다음에 다른 스레드가 수행 될 수도 있으며, 둘이 완전 번갈아가면서 수행되는 경우도 있음.
    - CPU가 1개일 때

    😀 결론
        > 순서와 실행기간을 모두 보장하지 않는다. (Multi-Thread)
        > List(인터페이스) -> ArrayList(단일스레드만 안전함) -> Vector(멀티스레드 안전함, Vector는 ArrayList보다 느림 -> 순서가 X 이기 때문이다)

    - CPU가 1개일 때

 */