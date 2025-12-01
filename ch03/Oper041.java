//date 25.12.01 16:53
// title: 출력이 먼저인가, 증가가 먼저인가?
package ch03;

public class Oper041 {
    public static void main(String[] args) {

        int a = 2;
        // 출력이 먼저인가? 증가 연산자가 먼저 처리되는가?
        System.out.println(a++);// 출력이 먼저면 2, 증가가 먼저라면 3 출력
        /* +++++ 정리 11 +++++
            1. 아래 초기화를 주석으로 하면 a=2, a=4가 출력됨.
            2. 주석을 풀어주면 a=2, a=3이 출력된다.
        */
        a=2;
        System.out.println(a++);
// 결과 == 출력인 먼저다 2, 2 가 출력
    }// end of main


}// end of Oper041
