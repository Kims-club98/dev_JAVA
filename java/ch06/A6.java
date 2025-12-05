//date 25.12.05 09:45
// title Object
package ch06;
// Object는 JAVA가 제공하는 클래스이다.
// A6는 사용자가 지정한 클래스이다.
public class A6 extends Object {
    // 부모가 정의하고 있는 메서드를 재정의하면 그 이후부터 부모의 메서드는 은닉된다.

/*
    @Override
    public String toString() {
        return "A6";
    }
*/
    public static void main(String[] args) {
        A6 a6 =new A6();
        System.out.println(a6);
        // toString()메서드에서 A6클래스가 구현아는 메서드가 아니라 부모인 Object가 구현해 놓은 메서드이다.
        // 부모가 구현(선언)하고 것들은 자손 클래스가 사용할 수 있다. - 재사용성
        System.out.println(a6.toString());
        // 만일 재정의 하려고 하면 할 수 있지만, 원형을 훼손해서는 안된다.
        // 원형 ex: 파라미터, 리턴타입
        // 재정의 -> 메서드 오버라이딩 -> 부모와 자손의 관계
    }
}
