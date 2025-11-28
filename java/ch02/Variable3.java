package ch02;
public class Variable3 {
    /*
    * Q. 당신의 나이를 담을 수 있는 전역 변수를 선언하시오
    *   H. Type 은 무엇으로 하는가? => int
    *   H. 변수명은 무엇을 할 건가? -> age 단. 초기화는 메서드 안에서 수행이므로 외부에는 초기값을 0으로 설정
    *   H. 메인 메소드를 선언하여 전역변수에 초기화를 30살로 해 보시오
    * */
    int age =0;

    public static void main(String[] args) {
        /* > main에서 메서드 전변을 사용하려면? => 인스턴스화 수행
           > 호출 시 인슨턴스 변수, 나이변수로 한다.
        * */
        Variable3 v3 = new Variable3(); // 인스턴스화 수행(전역변수 호출하기 위한 인스턴스화 목적 코드)
        // 전역변수 age는 Variable3클래스가 메모리에 로딩될 때 같이 초기화됨
        // 아래 문장을 만나기 전 까지 0을 쥐고 있다가 하단 코드(v3.age=30) 실행 시 30으로 바뀜
        v3.age=30; // 전역변수 재설정(전역변수 age에 대해 재설정)
        System.out.println(v3.age); // 출력
    } // end of main

}// end of Variable3
