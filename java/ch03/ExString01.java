//date 25.12.02 12:05
// title: 주소번지, 문자열 출력
package ch03;

import javax.swing.*;

class D {

}  // end of D (사용자 정의 class)


public class ExString01 {
    public static void main(String[] args) {
        // 클래스 불러오기(인스턴스화)
        D d = new D();
        System.out.println(d+", "+d.toString());
        JButton btn = new JButton("로그인");
        System.out.println(btn); // 주소번지가 출력
        String s = new String("문자열");// 문자열 자체가 출력
        System.out.println(s);


    }// end of main

}// end of ExString01

