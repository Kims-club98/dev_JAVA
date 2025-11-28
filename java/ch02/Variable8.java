// userInput, Integer.parseInt())

package ch02;

import java.util.Scanner;
/*
    *** 정리 12 ***
        1. JAVA 가상머신이 제공하는 클래스가 있음.
        2. Class 구성 요소 중 한 가지는 메서드임
        3. 제공되는 parseInt메서드를 활용할 수 있음
*/
public class Variable8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); // 인스턴스 화
        System.out.println("0부터 9사이의 숫자를 입력하시오 \n");
        String userInput = sc.nextLine(); // 메서드 뒤에 () => 함수
        System.out.println("당신이 입력한 숫자는 "+userInput+"입니다.");
        // userInput이 String 타입입니까? => true는 그렇다, false면 아니다.
        System.out.println(userInput instanceof String); //입력한 것이 String type 이면 true를 출력
        System.out.println(Integer.parseInt(userInput)+2);//int로 출력 요청했으니3을 input 하면 5가 출력될 것
        System.out.println(userInput+2); // input 에 8을 입력하니 82가 나옴(string type으로 인식)
        /*
            *** 정리 13 ***
                1. 문자열 + 숫자 = 문자열이다.(userInput+2를 통해 확인) 3 을 넣으면 5가 아닌 32가 나오더라...
                2. Integer.parseInt()를 통해 int로 input을 요청함
        */
        int imsi = Integer.parseInt(userInput);
        System.out.println(imsi);
        System.out.println("5"+2);
        /*
            *** 정리 14 ***
                1. 원시형 타입은 8가지가 있음
                2. 1) char      2) byte     3) short        4) int(정수형)      5) long     6) float(실수형)
                   7) double       8) boolean(if, for, 참/거짓)
                3. 원시형 타입은 호출하면 값이 출력된다.
                4. 참조형 타입 => 호출하면 주소번지가 16진수로 출력됨.
        */
    }//end of main
}// end of Variable8
