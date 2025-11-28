package ch02;
/*
    **** 정리 10: 전역변수와 지역변수
        - 지역변수 위치: 생성자의 파라미터(매개변수) 자리, 매서드의 파라미터(매개변수) 자리, for 문 내 선언한 변수
*/
public class Variable5 {
    /*
        메서드 자리에 선언된 변수도 지변이다.
        Q. 지변이면 초기화는 어떻게 해야 하는가? -> 메서드가 호출될 때 초기화
            A. 메서드 괄호 다음에 좌중괄호&우중괄호가 있으면 선언!
    */

    void methodA(int i, int j){ // 지역변수 i, j
        System.out.println(i+","+j); // methodA의 1, 2가 출력
    }// end of methodA

    void methodB(int i, int j){
        System.out.println(i + "," + j); // i, j 변수 재지정 이전이여서 v5.methodB의 3,4가 출력
        i=10;
        j=20;
        System.out.println(i + "," + j); // i,j 변수를 재지정 이후로 10,20이 출력
    }// end of methodB

    public static void main(String[] args) {
        Variable5 v5 = new Variable5(); //인스턴스
        v5.methodA(1,2);
        //insert here
        v5.methodB(3,4); //int 만 올 수 있음 (t/f는 boold)
    }// end of main

} // end of Variable5
