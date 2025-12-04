// date 25.12.03 10:33
// title:
package ch05;

public class B2 {
    int i = 1;
    // Class 선언만 할 시 NullPointException이 발생한다.
    B2 b1 = null; // 전변(전체 사용가능, 전역변수)
    void methodA(){
        if(b1 != null){ // 흐름을 바꿈
            System.out.println(b1.i);
        }else {
            System.out.println("b1은 Null임");
        }// end of if
    }// methodA

    public static void main(String[] args) {
        B2 b1 = new B2();
        b1.methodA();
    }// end of main
} // end of B2

// 정리 3...