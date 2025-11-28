package ch02;

public class LocalVariable1 {
    int b;
    public static void main(String[] args) {
        // select empno from emp: 14명의 사원 번호가 있었으며, 14명의 사원 번호를 담기 위해 변수 선언을 14번 해야 함(Oracle - Java와 섞어서 수행하기)
        int empno1 = 7001;
        int empno2 = 7002;
        int empno3 = 7003;
        int empno4 = 7004;
        int empno5 = 7005;
        int empno6 = 7006;
        int empno7 = 7007;
        int empno8 = 7008;
        int empno9 = 7009;
        int empno10 = 7010;
        int empno11 = 7011;
        int empno12 = 7012;
        int empno13 = 7013;
        int empno14 = 7014;
        int a=0; // 지변(지역변수)는 반드시 초기화 必要 (사용하기 전에 ERROR가 발생하지 않음)
        // 아래 원인에 대해 설명하고 문제를 해결하시오!!
        //a=5;
        System.out.println(a);
        LocalVariable1 lv = new LocalVariable1();
        System.out.println(lv.b); // 초기값은 0

    }
}
