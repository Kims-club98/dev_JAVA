package ch02;
/*
    *** 정리 4 ***
        클래스 내부에서 코딩 수행(public class Variable22...
        수행 구성: 선언부 -> 사용자 정의 매서드 -> main 매서드
        JAVA는 8개 type을 제공(int => 4byte & long => 8byte - 64byte
        int와 long은 모두 정수를 담을 수 있는 값의 크기 차이가 있다.
        window를 32bit로 설치 시 -> 8Gb ram 사용하지 못함
        char, byte는 JVM이 int로 형 전환하여 처리하므로 의미가 없다.
        일괄처리 & 상태값 관리
*/

public class Variable2 {
    // 선언부 - 여기서 선언 시 전역변수(member variable, global variable)
    int empno; // 원본이다(재정의 하면 원본이 바뀐다.) => 싱글턴
    //사용자 정의 메서드

    // main 메서드
    public static void main(String[] args) {
        /* JAVA는 자원관리를 Garbage Collector가 담당
           사용 후 다시 사용되지 않으면 => Candidate 상태로 체크했다가 Garbage Collector 가 회수함
           변수 선언하기 -> 1. type을 쓴다 2. 변수 이름을 쓴다 3. 초기화를 함
           ★★★ 지변(지역변수)는 초기화를 생략 할 수 없다 (중요) ★★★ */
        int salary =0; //지역변수(salary)(local variable, automatic variable)
        System.out.println("지역변수"+salary);
        // 정리: 지역변수는 선언 후 바로 사용 가능 BUT 전역변수는 내 안에 있어소 반드시 instance화를 하고 사용
        /* 정리 5 : 인스턴스화
            인스턴스ㅓ화를 수행 시 내가 만든 클래스가 heap 메모리에 로딩됨
            전역변수 호출 시 변수名 앞 인스턴스 변수名, dot 연산자를 붙이고 호출
            ★ 인스턴스화에서 사용된 변수 v2를 인스턴스 변수라고 한다.
            + 지변하고 전변은 급이 다름(전변은 클래스급)
         */
        Variable2 v2 = new Variable2();
        v2.empno=8000; // 재정의 기본 값은 잊고 새로 정의된 값으로 진행됨.
        System.out.println(v2.empno); // 0 출력, 전역변수(전변)은 초기화를 생략 가능하며, default 값은 0임
    }

}
