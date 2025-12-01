//date 25.11.28 (1)

package ch02.study;
/*
    == 복습정리 1 ==
    1. JVM이 제공하는 API 가 있다.
    2. 실행을 위해서는 Main 메서드를 선언해야 => 실행할 수 있음 => Console에 출력해볼 수 있었다.
    3. File명은 Exam.java를 만들고 Compile을 거치면 => Exam1.class가 만들어진다.
    4. Compile 이란: 고급언어(프로그래밍 언어, .java)를 저급언어(.class)로 변환시켜줌
    5. If Compile 과정에서 문법 에러가 발생 시 => xxx.class 파일로 변환되지 않는다.
    6. 클래스 선언 후 좌중괄호와 우중괄호의 스코프를 정해준다!
    ★ 7. 여러 행을 작성하더라도 항상 main 메서드가 먼저 실행됨 -> 개발자가 호출하는 메서드가 아니다!
    ★ 8. 이후 재사용성과 이식성을 고려할때 main 메서드에서 코딩하는 양을 줄여나가야 한다.
    9. 변수 -> 전역변수(전변)와 지역변수(지변)가 있다
        전역변수: 클래스 블록 안 어디서든 접근 가능(위치 Public Class 바로 밑 부분)
        지역변수: 메서드 블록 안에서만 생성, 사용됨

    == 복습정리 2: 변수 선언하기 ==
    1. type 변수명(int i, char i 등...) = 값; (형태) [기초, 초기화는 "기초"가 아님]
    2. 변수는 위치에 따라 전역변수와 지역변수가 있다.
    3. type 종류 8가지(중요만): int(정수), boolean(T/F)...

    == 복습정리 3: 원시형 타입(Primative Data Type) vs 참조형 타입(Reference Data Type)
        1. 원시형 타입: 원시형 타입을 호출 시 "값"이 출력됨
        2. 참조형 타입: 찹조형 타입을 호출 시 16진수 주소번지가 출력됨

    + 학습 목표! +
        - 변수 호출하기!
        - 변수 선언하기!
        - 변수 초기화(위치를 결정할 수 있다.) 하기!

*/
/*
public class Exam1 {
    //전역변수 선언하기(전역변수 위치)
    int g;
    // g = 1; ★★★ 전변은 선언과 초기화를 구분하지 않는다.(Compile이 되지 않는다.)

    public static void main(String[] args) {
    void methodA(){
        int i =1;
        }// end of methodA
    void methodB(){
        int i = 2;
        }// end of MethodB
// ★★★ methodA, methodB는 서로 다르므로, 값(i)은 유지되지 않음
    }// end of main
}// end of Exam1
*/