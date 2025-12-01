//date 25.12.01 (GC)

package ch02.study;

public class A {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        System.out.println(a.toString());
        a =null; //객체 초기화
        // a=null로 치완되었다가 다시 새로운 객체를 생성하는 그 시점(순간)
        //GC가 Candidate 상태로 찜을 해둠.
        a= new A(); // 여기서 생성된 객체는 line 7번의 A a = new A()와는 전혀 다른 객체임!
    }
}
