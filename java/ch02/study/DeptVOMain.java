//date 25.12.02 09:46
// title: 클래스 구성요소 = 메서드와 필드(변수)
// VO(Value Object) 패턴 OR DTO(Date Transfer Object) Pattern.

package ch02.study;

class DeptVO{ // sql 타입 -> 대체 type
    int deptno; // 부서번호 담기 - number(2)- int(4byte==32bit) & long(8byte == 64bit)
    String dname; // varchar2 -> String
    String loc; // varchar2 -> String
}// end of DeptVO(class)

class DeptDTO{

}// end of DeptDTO(class)

public class DeptVOMain {
    public static void main(String[] args) {
        DeptVO dvo = new DeptVO(); // -> ★☆★☆★☆ 클래스 사용을 위해 "인스턴스화" 필수!!! ★☆★☆★☆
        dvo.deptno=10; // type 맞추기
//  클래스 선언과 생성하기
//  RAM을 stack 영역과 heap 영역으로 나누어 관리
//  클래스는 heap 영역!
//  ★☆★☆ 불가능 ★☆★☆ ↓
        //dvo.deptno="10"; 문법 에러(type 에러 발생)(int로 선언 -> String 부여 不)
//  DeptVOMain 클래스에서 DeptVO 클래스에 선언된 deptno 변수를 사용할 수 없다.
//  main메서드가 있는 클래스에서 다른 클래스에 선언된 변수를 접근하려면 "인스턴스화"를 해야 함
        System.out.println(dvo.deptno); // dvo.xxx 로 인스턴스화한 클래스를 넣어줘야 함. (result: 10)
//  ★☆ 다른 클래스에서 선언된 전변(전역변수)을 접근할 때 [ 인스턴스 변수. 전변이름 ] 으로 접근해야 함 ★☆
        dvo.dname="ACCOUNTING";
        dvo.loc="NEW YORK";
        System.out.println(dvo.dname);
        System.out.println(dvo.loc);
        dvo.deptno=20; // 이와 같이 새로 재선언 시 ==>  값의 덮어쓰기가 됨(유지관리가 안되는 문제점 발생)
        dvo.dname="RESEARCH"; // 재선언(dname)
        dvo.loc="DALLAS"; // 재선언(loc)
        System.out.println(dvo.deptno);
    }// end of Main
}// end of DeptVOMain
