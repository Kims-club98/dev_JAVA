//date 25.11.28(3)
/*
    == 복습정리 6 ==
    1. Exam3.java 안에 other클래스와 Exam3클래스가 2개 생긴다.
    2. Other.class, Exam3.class
    ※ 주의사항: 둘 중 하나만 public을 붙일 수 있음
*/

package ch02.study;

class Other{
    int ival;
    /*
        == 복습정리 7 ==
        1. 지역변수는 메서드 안에서만 사용 가능한 변수 OR 파라미터 자리에서 선언된 변수
     */

    void methodA(){ // 메서드 선언

    }
}

public class Exam3 {
    public static void main(String[] args) {
        /*
            == 복습정리 8 ==
            1. Other 클래스를 메모리에 로딩
            2. 클래스는 heap 메모리 영역에 살고
            3. 지변은 stack 메모리 영역에 있음
         */
        Other other = new Other();
        System.out.println(other.ival);

        // ------ 불가능 ------- ↓
//        System.out.println(other.x);
//        System.out.println(other.y);
    }
}
