package ch0708;

public class MuteQuack implements ch0708.QuackBehavior {
    @Override
    public void quack() {
        System.out.println("무음");
    }
}
