// date 25.12.05 10:36
// title: 생성자의 종류
package ch06;
// 생성자를 여러가지 가질 수 있음
// parameter 개수가 다르거나 type이 다르면 중복해서 선언 가능!
public class A8 {

    public A8(){ // 디폴티 생성자여도, 파라미터 넣을 공간 () 을 넣어줘야 함.
        System.out.println("디폴트 생성자");
    }// end of default A8

    public A8(int a){
        System.out.println("A8(int)");
    }// end of parameter 1 A8

    public  A8(int a, int b){
        new A8();
        new A8(1); // 디폴트 생성자와, 1파라미터 생성자 또한 불러와서 사용 可
        System.out.println("A8(int, int)");
    }// end of parameter 2 A8
} // end of class A8
