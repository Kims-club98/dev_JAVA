package ch0708;

import ch06.ch708.FlyNoWay;

//모든 클래스가 반드시 main메서드를 가질 필요는 없다.
public class WoodDuck extends ch0708.Duck {
    public WoodDuck(){
        quackBehavior = new ch0708.MuteQuack();
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void fly() {
        flyBehavior.fly();
    }

    @Override
    public void quack() {
        quackBehavior.quack();
    }


    @Override
    public void display() {
        System.out.println("나는 나무오리 입니다.");
    }
}
