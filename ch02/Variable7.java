package ch02;
/*
    *** 정리 11: 메서드 이름 앞에 void일 때와 return type이 있을 때
 */
public class Variable7 {
    void methodA(){
        System.out.println("methodA() 호출"); // 메서드 A에 대한 선언
    }// end of methodA

    int methodB(){ // void 아님(int 활용)
        System.out.println("methodB() 호출"); // 메서드 B에 대한 선언
        return 5;
    }// end of methodB

    public static void main(String[] args) {
        int x = 2;
        boolean isFlag=false;
        //println()을 호출함
        System.out.println(x); //2
        System.out.println(isFlag); // false
        Variable7 v7 = new Variable7();
        // 반환타입이 없는 경우 println()메서드 내에서 호출이 불가함
        // 메서드 parameter 자리에서 또 다른 메서드 호출이 가능
//      System.out.println(v7.methodA());
        v7.methodA();
        /*
            매서드 내부에서 계산된 결과를 그 매서드 외부에서 사용하고자 할 때 아래와 같이 사용 가능함.
         */
        System.out.println(v7.methodB()); //5출력

    }// end of main

}// end of Variable7
