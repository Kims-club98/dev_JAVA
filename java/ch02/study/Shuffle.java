//date 25.12.02 10:35
// title: shuffle(셔플)
package ch02.study;
/*  === 정리 1 ===
    1. 변수는 한 번에 하나만 담을 수 있다.
    2. 변수는 a에 b의 값을 담기 전에 a의 값을 다른 변수에 담아 둔다.
*/

public class Shuffle {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int imsi=0;
        imsi=a; // imsl=3
        a=b; // a=5
        b=imsi; //b=3
        System.out.println("a: "+a+", b: "+b);
    }// end of main

}// end of Shuffle
