package ch02;

public class Variable4 {
    /*
     *** 정리 7: 사용자 정의 메서드를 구현 ***
        1. b=1; 재정의에 대해 위치에따라 결과가 달라질 수 있다는 점을 확인하는 코드 추가
        2. 변수 a에 b를 대입하기 전에 추가하였을 때와 후에 추가했을 결과에는 영향이 있다(O) | 없다?
    */
    void methodA(){
        int a = 1;
        int b = 2;
        System.out.println("methodA before a :" + a + ", b :" + b);// a=1, b=2
        b = 1; // 오른쪽 값을 왼쪽에 대입해줘 =>  a 에 b를 대입해줘
        a = b; //이러면 2였던 b가 다시 a로...
        System.out.println("methodB before a :" + a + ", before b :" + b); // a=2, b=2
    }// end of methodA

public static void main(String[] args) {
    int a = 1;
    int b = 2;
    System.out.println("before A: "+a+", before B: "+b);
    a = b;
    b = 1;
    System.out.println("after A: "+a+", after B: "+b);
    System.out.println("============= [[main]] =============");
//  내 안에 선언한 매서드더라도 main 안에서 호출한 경우에는 인스턴스화 진행해야 함.
    Variable4 v4 = new Variable4();
    v4.methodA();
    System.out.println("methodA 호출 후");
    } // end of methodA
}// end of Variable4

// JVM의 처리 순서를 알아보기!