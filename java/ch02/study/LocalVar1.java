// date 25.12.01 11:47
package ch02.study;
/*
    > 지변은 초기화를 생략 불가!
 */


public class LocalVar1 {
    // 전역변수 작성
    void methodA(){
        int i; // i 선언
        i=2; // i를 2로 정의
        //System.out.println(i);
        //return i; // ★ return값이 있다면 i를 사용 가능하다.
    }// end of methodA
/*    +++++ 정리 4 +++++
    1. automatic variable, local variable 파라미터 자리에 지변을 선언하면 언제 초기화 되는가?
    2. Because 지변은 초기화를 생략할 수 없음.
    3. 메서드는 호출될 때마다 여러 번 실행된다.
 */
    void methodB(int i){
        System.out.println("methodB i : "+i);
    }

    public static void main(String[] args) {
        //Q. 지역변수 i 값을 궅이 main 에서 출력되도록 코드를 작성해보시오.(★☆★☆★☆ main에서는 전역변수 그대로 사용 불가!)
        LocalVar1 lv1 = new LocalVar1();
        // 변수 i는 지역변수로 아래와 같이 호출이 불가능함.
        //System.out.println(lv1.i); // 不可
    // ***  methodB는 return type이 void이므로 대입연산자를 통해 반환받릉 수 없다.
    // ** methodA에 선언된 지변 i & main에서 선언된 i 는 서로 다름.
        // lv1.methodB(3);
        //int i = lv1.methodA(); // i=2
        //System.out.println(i); //2


    }// end of main

}// end of LocalVar1
