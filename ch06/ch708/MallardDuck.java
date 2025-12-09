// date 25.12.08 15:45

package ch06.ch708;
// -> 날 수 있다. 가 되어야 한다. -> FlyWithWing.java
// -> 날 수 없다. 가 된다면 -> FlyNoWing.java
public class MallardDuck extends Duck {
    public MallardDuck(){
        // 여기에 flyBehavior를 선언하지 않았지만 에러가 발생 X
        // Duck에 선언한 변수는 상속받은 클래스에서 사용이 가능함.
        flyBehavior = new FlyWithWing();
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }

    @Override
    public void display() {
        System.out.println("나는 청둥오리 입니다!");
    }
}
