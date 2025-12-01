//data 2512.01 10:49
package ch02.study;

public class GlobalVar2 {
    // 전역변수 위치
    String ename = "나초보";
    public static void main(String[] args) {
        GlobalVar2 gvl2 = new GlobalVar2(); // 인스턴스화
        System.out.println("업데이트 이전: "+gvl2.ename); // 변수 재정의 전 출력
        gvl2.ename="SCOTT"; // 변수 재정의 후
        System.out.println("업데이트 이후: "+gvl2.ename); // 변수 재정의 후 출력
    }// end of main
}// end of GlobalVar2
