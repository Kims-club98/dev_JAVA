// date 25.12.04 18:17
// title: 인스턴스화 복습
package ch05.aobject3;
// 외부에서 클래스로 만들면 바이트코드가 따로 생성된다. (현재는 3개 생성됨)
class D1{

}

class D2{

}

public class Dmain {
    public static void main(String[] args) {
        D1 d1 = new D1; // main에 D1 class를 사용 가능
    }
}
