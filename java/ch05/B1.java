// date 25.12.03 10:12
// title: class 선언 - 사용(A5 복습)
package ch05;

public class B1 {
    int i = 1;
    // Class 선언만 할 시 NullPointException이 발생한다.
    B1 b1 = null; // 전변(전체 사용가능, 전역변수)
    void methodA(){
        System.out.println(b1.i);

    }// methodA

    public static void main(String[] args) {
        /* === 정리 2
            1. main 메서드는 선언부에 static이 있어서 non-static타입은 호출할 수 없음
            2. main 메서드의 b1는 지변이다 -> 상단 b1(전변)과 서로 다르다!! ★☆★☆★☆
         */
        B1 b1 = new B1();
        b1.methodA();
    }// end of main
} // eo B1
