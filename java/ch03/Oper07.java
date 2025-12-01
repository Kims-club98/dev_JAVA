//date 25.12.01 17:35
/*  Q. 문제 요구사항 ( else 사용법 )
        - 점수가 60점 이상이면 합격을 출력하고,
        그렇지 않으면 불합격을 출력하는 문장을 완성하시오

        - 필요나 변수는 몇 개인가?
        - 필요한 변수 타입을 무엇인가?

*/
package ch03;

import java.util.Scanner;

public class Oper07 {
    public static void main(String[] args) {
        int score=0;
        // input을 위한 코드
        System.out.println("당신의 점수를 입력하시오. ↓ "); // Q 메시지 입력
        Scanner sc = new Scanner(System.in); // Scanner 인스턴스(매개변수에 System.in이 필요함.)
        score=sc.nextInt();// score를 int를 출력받도록 input 받음
        if(score>=60){
            System.out.println("합격");
        }else{ // 위 조건을 제외한 나머지 모두인 경우.
            System.out.println("불합격");
        }

    }// end of main
}// end of Oper07
