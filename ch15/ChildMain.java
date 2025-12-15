// date: 251215 12:53
// title: Child 하나에 클래스 3개
package ch15;

abstract  class Parent{ // 부모 함수에 포함되어 있는 methodA
    void methodA(){
        System.out.println("Parent methodA()"); // 확인 목적
    }
}// end of Parent

class Child extends Parent {

    @Override // Parent 사용을 위해서 Override를 해야 함.
    // Override 선언조건: 부모 메서드에서 Parent 사용 시에만 사용
    void methodA() {
        System.out.println("Child methodA()"); // 확인 목적
    }
    void methodB() {
        System.out.println("Child methodB()"); // 확인 목적
    }
}// end of Child extends Parent

public class ChildMain {
    /*
        == 정리 ==
        1. 인터페이스와 추상 클래스는 단독으로 인스턴스화 할 수 없다.
        2. 즉 반드시 ==> 구현체 클래스가 있어야 함
        3. 다시 말해 선언부 타입과 생성부 타입이 반드시 다르다.
        4. 선언부 타입과 생성부 타입이 다르기 떄문에 다형성을 누릴 수 있다.
        5. 선언부의 추상 클래스나 인터페이스를 사용한다.
        // Parent p = new Parent();
        6. 인스턴스 변수 p로는 methodB()를 호출할 수 없다 (不可)
    */
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
        p.methodA(); // 예. Child metodA 가 둘 다 32,33 출력되지 않을까...
        c.methodA();
        // 인스턴스변수 p가 Parent타입이므로, Parent에 선언되지 않는 메서드는 호출 불가하다.
        //p.methodB(); // p는 Parent type이므로(부모타입에 A는 있지만, B는 없다.)

        // 인스턴스 함수 c는 만일 child클래스에 methodA()가 구현되지 않아도 methodA()를 호출할 수 있다.
        c.methodB();
        p.methodA();

    }// end of main

} // end of ChildMain

// 선언부와 생성부의 타입이 다를 때 이를 고려해야 한다.
// 양쪽에 methodA 가 있는 경우 => 자손것이 우선 호출 (parent가 호출되지 않음)

/*
    List li1 = new ArrayList();  // 객체 저장, ArrayList에 제한 없제 객체 추가 가능
    List li2 = new Vector();  // ArrayList와 동일한 내부구조 But 동기화된 메서드로 구성되므로 동시 실행 불가
    List li3 = new LinkedList(); // 인접 객체를 체인처럼 연결하여 관리
    ---> 3으로..
 */