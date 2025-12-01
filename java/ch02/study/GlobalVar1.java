//date 25.12.01 10:15
package ch02.study;
// 복습문제: 사원번호 7566으로 변경하는 코드를 작성하시오.
public class GlobalVar1 {
    // 전역변수 선언하는 위치(GlobalVariable은 이 클래스 전역에서 사용 가능함)
    int empno= 0; // --> 전역변수 선언(default 값 0)
    void methodA(){ // Method관리하는 Stack 영역에 따로 관리됨
        empno=7499;
    }
    public static void main(String[] args) {
    // insert here
    /*
        +++++ 정리 1 +++++
        1. 클래스 이름 뒤 괄호가 있으면 생성자라고 함
        2. 괄호 안 Parameter가 없는 생성자를 Default 생성자라고 함
        3. 클래스는 heap 메머리 영역에 로딩됨.
     */
        GlobalVar1 gvl = new GlobalVar1(); // --> 인스턴스화 ★★★★★
        gvl.empno=7566; // --> 재정의: 전역변수를 main메서드 영역 안에서도 접근할 수 있음.
        System.out.println(gvl.empno); // 7566
    }// end of main
}//  end of GlobalVar1
