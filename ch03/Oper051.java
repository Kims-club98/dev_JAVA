//date 25.12.01 17:10
// title: 삼항연산자(2)

package ch03;

import java.util.Scanner;

public class Oper051 {
    public static void main(String[] args) {
        int age =0; // default 값 0
        Scanner sc=new Scanner(System.in); // 입력받을 인스턴스호ㅠㅏ
        System.out.println("당신의 나이를 입력하시오 : "); // Q. 내역 출력
        age=sc.nextInt();// input 함수로 nextline은 반환을 String으로 함(int는 int 출력) (int 값 넣고 int 출력)
        String result=(age>=19 ? "성인":"민짜");//age값이 19 이상이면 성인 아니면 민짜
        System.out.println(result);// result 결과 출력
        
    }//end of main
}// end of Oper051
