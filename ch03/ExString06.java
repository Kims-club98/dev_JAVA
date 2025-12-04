// date 25.12.02 12:56
// title: String의 단점(비효율 예시), StringBuilder 활용
package ch03;

public class ExString06 {
//  ◎ String을 사용 시 발생하는 문제점(사용 시 일일이 재정의가 필요하다)
    public static void main(String[] args) {
        String sql ="Select emp.empno, emp.ename, dept.dname";
        sql += "FROM emp, dept";
        sql += "WHERE emp.deptno = dept.deptno";
        sql += "And dept.deptno IN(10,30,40)";
        System.out.println(sql);

//  ◎ StringBuilder를 활용
        StringBuilder sb = new StringBuilder();
        sb.append("Select emp.empno, emp.ename, dept.dname");
        sb.append("FROM emp, dept");
        sb.append("WHERE emp.deptno = dept.deptno");
        sb.append("And dept.deptno IN(10,30,40)");
        System.out.println(sql.toString());

//  String은 원본이 바뀌지 않으나 / StringBuilder는 원본이 바뀜
    }// end of main
} // end of ExString06
