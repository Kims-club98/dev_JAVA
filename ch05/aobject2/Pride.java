//date 25.12.04 10:12 /10:51
// title: Sonata 복습
package ch05.aobject2;
// 클래스를 상속 받을 수 잇다 -> extends
// A is a B 이면 상속관계로 정의한다.
// 부모가 제공하는 메서드도 내가 사용할 수 있음(==호출할 수 있다.)
public class Pride {
    int speed;
    public Pride(){
        System.out.println("Pride 디폴트 생성자");
        System.out.println(this.speed);
    }// end of p.Pride
    // annotation - 클래스와 동일한 취급 - spring
    /* == 정리 2 ==
        1. JAVA에서 같은 일므의 메서드를 이전ㅇ함.
        2. 단 메서드 오버라이딩 OR 메서드 오버로딩 규칙을 준수한다면... => 선언부(접근제한자, 리턴타입, 파라미터)는 손대지 않는다.
        3. 부모 가졌던 toString() 메서드가 은닉 메서드가 된다.(Shadow)
     */

    @Override
    public String toString(){
        return "나는 프라이드 자동차이고 현재 속도는" + speed + "입니다.";
    }// end of String toString


    public static void main(String[] args) {
        Pride yourCar = new Pride(); // 인스턴스화, yourCar는 인스턴스변수며, Pride메서드를 호출함
                                     // main은 "static 영역"이여서 this를 사용할 수 없음.
        System.out.println(yourCar.speed);
     // System.out.println(this.speed); // => 동일한 결과 출력
     // 주소번지 출력 ↓
        System.out.println("주소번지> "+yourCar.toString());
    }// end of main

}// end of pride
