//date 25.12.01 16:41
/* +++++ 증감연산자(for문 시용됨, 대입연산자) +++++ 11
    1. i = i + 1; i = i - 1

*/
package ch03;


public class Oper04 {
    public static void main(String[] args) {
        int a = 1;
        // Q. 대입연산자가 먼저인가? 증가하는 것이 먼저인가?
        int b = ++a; // a+1가 됨.
        // b= a++;
        System.out.println("a : "+a+", b: "+b);
        System.out.printf("a : %d, b : %d%n", a, b);
    }// end of main

}// end of Oper04

