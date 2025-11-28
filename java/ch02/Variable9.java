package ch02;
/*
    *** 정리 15: 원본과 복사본 ***
    - Variable9.java -> Param.class, Variable9.class (2개의 파일이 만들어짐)
 */
class Param{
    // 전역 변수 - 외부 다른 클래스에도 접근이 가능함(단 "인스턴스화"를 하고 사용한다)
    // 단 초기화는 되지 않음: default 값 0
    int ival;
}// end of Param

public class Variable9 {
    void effectParam(Param p) {
        p =new Param();
        p.ival =100;
            System.out.println("Sub ival: "+p.ival);
        }// end of effectParam

        // 순서: 20라인 -> 21라인 -> 22라인 -> 23번 라인(0->500으로 바뀜) -> 24번에서 호출(p.ival) -> 14번으로 이동(500 > 100)
        // -> 15번 출력(100)
    public static void main(String[] args) {
        Variable9 v9 = new Variable9(); // Variable9 인스턴스화
        Param p = new Param(); // Param 의 인스턴스화(ival을 Variable9에서 사용하려고)
        p.ival=500;
        v9.effectParam(p);
        System.out.println("Main ival: "+p.ival);
    }// end of main

}// end of Variable9
