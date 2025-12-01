//date 25.12.01.10:57
package ch02.study;

import javax.swing.*;
/*
    +++++ 정리 2 +++++
    1. main 메서드는 엔트리 포인트 -> main thead -> 가장 면서 호출됨.
    2. main이 있어야 exe 파일이 생성됨 -> c++ dll, exe
    3. main 메서드는 개발자가 호출하는 메서드가 아니다. -> 그래서 main메서드 코딩을 적게 해야 함.
    3. 전역변수 isView를 사용하여 Window창이 화면에 출력되도록 코드를 작성
*/

// Q. 전역변수 isView를 활용하여 Windows창이 화면에 출력되도록 코드를 작성하시오.(JFrame)
public class GlobalVar3 {
    // 전역변수 자리
    boolean isView = false; // isView 초기값을 false
    /*
        +++++ 정리 3 +++++
        1. 파라미터 자리도 변수를 선언하는 자리이다.(methodA)
        2. 초기화가 안되어 있음 -> 원본이여야 함
        3. 나를 호출하기 전 isView를 true로 변경해주는 코드가 먼저 호출되어야 함 -> 그렇지 않으면 isView에 false
    */
    void methodA(JFrame jf){
        jf.setVisible(isView);
    }// end of methodA
// -> 메서드는 호출해야 실행문이 실행 기회를 갖는다.(isView가 false이므로 true로 변경되기 위해서 methodB를 경유해야 함)
    void methodB(){
        isView=true;
    }//end of methodB

    public static void main(String[] args) {
        JFrame jf = new JFrame(); // --> JFrame 인스턴스화
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,300);
        // insert here - SetVisable() ==> 창에 나타나는 값이 T/F
        // --> 아래 코드의 문제점! (인스턴스화의 부재 & 위치는 어디로?)
        GlobalVar3 gvl3 = new GlobalVar3();
        gvl3.methodB(); // isView가 False -> True 가 됨
        gvl3.methodA(jf); // 원본에 대응하는 값이 변함
        //gvl3.isView = true;
        jf.setVisible(gvl3.isView); // 재정의, 인스턴스화를 해야 함
    }// end of main

}// end of GlobalVar3
