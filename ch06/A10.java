// date 25.12.05 10:51
// title: 실전 예제

package ch06;
/* == 정리2 ==
    1. JAVA에서는 같은 이름의 메서드를 여러 개 선언할 수 있다.
    2. 메서드는 오버라이딩 이거나 메서드 오버로딩이면 가능하다.
 */
public class A10 {
    void methodA(){
        System.out.println("메서드 A 호출");
    }

    void methodA(String s){
        System.out.println("메서드 A(String)");
    }

    void methodA(int i, String name){
        System.out.println("메서드 A(int, string)");
    }

    public static void main(String[] args) {
        A10 a = new A10(); // A10 인스턴스화
        a.methodA(); // A10의 디폴트 메서드 불러오기
        a.methodA("String");
        a.methodA(2, "String");

    }
}
