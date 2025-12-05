//date 25.12.05 10:02
// title: type, 클래스

/* == 정리 1-2
    1. 원시형 타입 - 호출 시 값이 출력됨
    2. byte와 short를 사용하지 않음. 왜냐하면 JMV 처리 시 int 형으로 자동전환되지 때문
    3. char<short<byte<int<long<float<blooa

    참조형 타입 - 호출 시 16지수의 주소번지가 출력됨(간접참조방식, 제네릭)

    정적변수(static <-> non static) - 하나를 공유함, 인스턴스화 필요 없음
    주의: static영역에서 non-static 타입 사용 불가
// 메인 메서드에서 쓰는 코딩을 줄이도록 하기
*/
package ch06;
/*  == 정리 1-1 ==
    1. 전변은 클래스 전역에서 사용 가능하다
    2. 전변은 클래스 외부에서 인스턴트화 이후 사용 가능하다(전변사용 -> 인스턴스화)
 */
public class A7 {
    int a; // a 선언
    void methodA(){
        int i =1; // 파라미터 없는 생성자 => 디폴트 생성자
        System.out.println(this.a);
        //System.out.println(this.i);
    } // 메서드A 클래스

    public A7(){
        // 생성자 안에서도 메서드 호출이 가능함.
        methodA();
    }

    // 일반적으로 static 사용을 금함.
    public static void main(String[] args) {
        A7 a7 = new A7();
        // methodA()
        System.out.println(a7.a);
        //System.out.println(i); X

    }

}
