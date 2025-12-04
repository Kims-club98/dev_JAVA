//date 25.12.02 18:17
//title

package ch05;

class empVO{
    int empno;
    String ename;
    String job;
/* ★☆ 주소번지 재정의 ★☆
    @Override
    public String toString() { // 주소번지를 수정할 수 있음(주소번지 재정의)
        return "사번은 7566이고 이름은 SCOTT, 그리고 JOB은 개발입니다.";
    }

 */
}// end of empVO

public class EmpMain {
    public static void main(String[] args) {
        empVO evos[] = new empVO[3]; // null null null 들어있음 방만 만듦 (evos[] 와 empVO[3]은 다르다.)
        for(int i=0;i<evos.length;i++){
            evos[i]=new empVO(); // 생성자
            evos[i].empno=7566;
            evos[i].ename="SCOTT";
            evos[i].job="개발";
            System.out.println(evos[i]); // empVO의 객체 주소를 0-2까지 3개 출력
            System.out.println("사원번호는 "+evos[i].empno+"이며, 이름은 "+evos[i].ename+"이고, 직업은 "+evos[i].job+"입니다.");
        }

    }// end of main
}// end of EmpMain


