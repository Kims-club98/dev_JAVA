package ch06.ch708;
/*
    - 클래스 예약어 앞에 abstract를 붙이면 추상 클래스가 된다.
    - 추상클래스는 생성자 가질 수 있고, 추상 메서드 가질 수 있고, 일반메서드도 가질 수 있다.
    - 일반메서드도 가질 수 있음
    - 추상클래스는 생성자를 가지지만, 단독으로 인스턴스화를 할 수 없음.
    - List it = new List() XX
    - Duck myDuck = new Duck();
 */
public abstract class Duck {
    FlyBehavior flyBehavior =null;
    public  Duck () {

    }// end of Duck
   //     ++ 추상 메서드 기능에 대해 클래스가 결정되지 않아 구현할 수 없을때 사용함.
    public  abstract void fly();
    public  abstract void display();
    public void swimming(){
        System.out.println("모든 오리는 물 위에 뜹니다.");
    };
}// end of abstract class Duck

