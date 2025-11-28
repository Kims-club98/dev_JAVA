//date 25.11.28 (2)

package ch02.study;

public class Exam2 {
    public static void main(String[] args) {
        int comm =0; // comm 0
        /*
            == 복습정리 4: 지역변수 ==
            1. 지역변수는 외부의 다른 클래스에서 사용 불가
        */
        int x = 300; // x 300
        /*
            == 복습정리 4: 대입 연산자 ==
            1. =은 같다가 아닌 ' 오른쪽 값을 왼쪽에 대입해주세요를 의미함
            2. 대입 연산자 임
        */
        comm = x; // comm 이 x가 됨(대입연산자) comm 300
        System.out.println(comm);
    }// end of main

}// end of Exam2
