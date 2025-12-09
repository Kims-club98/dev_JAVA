package ch06.ch708;

import org.example.Main;

public class DuckSimulation {
    public static void main(String[] args) {
        // Duck duck = new Duck();// 단독 사용 불가
        // FlyBehavior fb = new FlyBehavior(); // 단독 사용 불가
    Duck myDuck = new MallardDuck();
    myDuck.display();
    Duck himDuck = new WoodDuck();
    himDuck.fly();
    himDuck.display();
    }
}

/*
    - 같은 이름의 메서드 이지만, 구현체 클래스에 따라 기능이 달라짐(다형성
    - 선언부 타입과 생성부의 타입이 다르면 기대 가능
    - 추상클래스와 인터페이스 모두 추상메서드를 가질 수 있음
    - 추상메서드는 이름, 리턴타입, 파라미터만 결정되어 있을 뿐
    - 기능에 대해서는 구현체 클래스에서 메서드 오버라이딩을 한다.
 */