//date 25.12.03 09:51
// title: static
package ch06;

public class A5 {
    // 하단 a5 => 전역변수
    int i =1;
    /* === 정리 1 ===
        1. 하단 a5는 전역변수이다.
        2. instance화 할 때 선언만 했을 경우(생성X) => NullPointerExpception발생할 수 있다.
        3. 해결하는 방법은 생성부까지 작업을 해야 된다.
     */
    A5 a5 = null;
    //A5 a51 = new A5();

    void methodA(A5 a5){//--> parameter에서 넘어오 a5임(주소번지 O)
        System.out.println(a5);
        //System.out.println(a51.i); // static으로 인해 인스턴스화가 必
    }// end of methodA

    // entery point가 main 메서드이다. => main thread라고 함
    // ★☆★☆ (어떤 클래스가 있어도 main에서 가장 먼저 시작한다!!) ★☆★☆
    public static void main(String[] args) {
        // 하단 a5 => 지역변수 (같은 a5 but line 6 ≠ line 18)
        A5 a5 =new A5();
        a5.methodA(a5);
    }// end of main
}// end of A5
