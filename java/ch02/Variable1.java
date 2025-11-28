package ch02;
/*
    1장. 클래스 선언하기
        클래스 파일에 코딩을 한다 -> 코딩을 하는 최소 파일이 클래스
        저장 => Variable1.java -> 컴파일 과정 거친 후 -> Variable1.class(이진파일로 변환==배포하는 파일)
        왜냐하면, .java 고급언어(주석->회사업무내용, 프로세스,,,포함함) =>실 배포는 .class로 배포

*/
public class Variable1 { // 실행순서: 16번(main 메서드) -> 17번 순서...
    // 선언부

    /* 제 2장. 사용자 정의 메서드
           우리는 어제 JDK21을 설치함(JVM-Java Virtual Machine:이 로컬에 설치됨
           자바코딩을 함 -> 클래스 선언하고 그 안에 코딩을 함
           자바코딩을 위해 xxx.java파일을 만듦 -> 실제로 이 파일이 실행됨.
           운영서버에 올리는 파일도 xxx.class
           Comepile(컴파일)은 고급언어 -> 저급언언로 변경해주는 것(JVM 설치 == 컴파일 실행 목적)
           컴파일 과정에서 type 체크
           보안 이슈로 패키지(폴더)가 없는 클래스는 에러(ERROR)
           Local에서 실행 시 가장 필요한 매서드
           가장 먼저 실행되는 것이 main 메서드 == main point == main thread
     */

    // 실행 파일로 만들기 위해 main메서드가 있어야 함 -> 웹 기반 X
    // Local에서 실행 시 필요한 매서드임 (main + tab 시 실행)
    public static void main(String[] args) {
        System.out.println("main 선언"); // 단축기: sout + tab

    /* 3장.원시형 타입 변수 선언하기(8가지)(변수선언 및 초기화) */
           int empno =7566; //변수와 초기화 둘 다 수행 ★
           int deptno;  // 변수 초기화
           deptno =10;  // 변수 부여 -- 분리하여 수행 가능 ★
        System.out.println("사원번호 : "+empno);
    }
}
