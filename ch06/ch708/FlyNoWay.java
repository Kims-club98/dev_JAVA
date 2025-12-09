package ch06.ch708;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("나느 날지 못합니다.");
    }
}
