// date 25.12.04 09:43
// title: 객체(추상)과 클래스(설계도)의 구분, 클래스 선언 & 접근제한자 class 클래스이름

/* == 정리 1-1 ==
    1. 클래스(class)는 필드와 메서드(단일책임원칙)로 구분

 */
package ch05.aobject2;

public class Sonata {
    // † 선언부
    // 고유명사를 전변으로 함
    private int speed;
    private int wheelNum;
    private  String carColor;
    /* == 정리 1-2 ==
        1. 아래를 생성자라 부른다 -> 파라미터가 없는 생성자를 default 생성자
        2. default 생성자는 parameter를 결정할 필요가 없다(없으니깐!) JVM을 제공해준다(생략가능!)
        3. Parameter에 있는 생성자는 JVM이 제공할 수 없다 -> 누가 결정하는가?
        4. 처리(메서드)에 대해 설계하기 -> 파라미터(개수, type), Return type(응답 -> 출력)
        5. 생성자에 있어 전변에 대한 초기화를 생략할 수 있다.
     */

    public Sonata() {
        System.out.println("소나타 default 값");
    }// end of Sonata(Public)

    // † 메인 메서드(main thread) -> "가장 먼저 실행된다!!" -> entry point
    public static void main (String[]args){
            Sonata myCar = null;
            // 어떤 이름 뒤에 괄호가 있는 두 가지가 있다.
            // 메서드, 생성자
            myCar = new Sonata();
            myCar.speedUp();; // 뒤에 메서드가 있다고 실행 안되는거 아니다.(구조지향적 언어이기 때문이다.)
        System.out.println(myCar.speed);
    }//end of main

    void speedUp(){
        System.out.println("SpeedUP 호출");
        this.speed=speed + 1;
        // 오직 전역변수(전변)만이 변수 이름 앞에 인스턴스변수/this 수정자를 쓸 수 있다.(ex. jf.speed, this.speed ..)
    }// end of speedUp
}// end of Sonata(Public Class)
