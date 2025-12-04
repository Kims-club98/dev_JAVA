// date 25.12.02 13:08
//title: 논리연산자(나이 범위 체크)
package ch03;

import java.util.Scanner;

public class AgeRange01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in 작성 필요!
        System.out.println("나이를 입력하시오: ");
        int age = sc.nextInt(); // age를 int 타입으로 input 받을 수 있음.
        // 조건: 19세 이상이고 65세 미만이면 성인이다.
        if(age>=19 && age<65){
            System.out.println("성인요금이 적용됩니다.");
        } else{
            System.out.println("성인요금이 적용되지 않습니다.");
        }// end of if
        // 사용한 자원 반납하기
        sc.close();
    }// end of main

}// end of AgeRange01
