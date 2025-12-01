//date 25.12.01 12:35
//JOptionPane.showInputDialog => input 창을 만들어주고 입력하면 그게 맞게 출력을 해줌
package ch03;

import javax.swing.*;

public class Oper02 {
    /* +++++ 정리 5 +++++
        1. 메서드를 호출할 때 파리미터 개수와 타입을 맞춰야 함 => 같은 이름의 메서드 허용
        2. JAVA에서는 같은 이름의 메서드를 중복 선언 가능
        3. Parameter의 개수가 다르거나 or type이 다르면 됨.(이럴 경우 같은 이름의 메서드名 사용 가능)
    */
;
    public static void main(String[] args) {
        // type을 맞추야 함(JOtionPane.showInputDialog는 String O, boolean X, int X)
        String r1=JOptionPane.showInputDialog("1부터 9사이의 숫자를 입력하시오");;
        String r2=JOptionPane.showInputDialog("1부터 9사이의 숫자를 입력하시오",0);
        int x=Integer.parseInt(r1); // Integer.parseInt(r1)을 x로 변수 지정
        System.out.println(r1);
        System.out.println(r2);

        System.out.println("============= if 문 출력 ============");
        if(1<=x && Integer.parseInt(r1) <=9){ // x는 1보다 크거나 같고 and x는 9보다 작거나 같고
        /* +++++ 정리 6: x ++++++
            1. r1은 String이므로 조건식에 넣을 수 없음.
            2. So Int로 전환하여 적어야 한다.
            3. Integer.parseInt(r1) 이 들어가지만, 위처럼 x 변수를 지정 후 진행했음.
        */
            System.out.println(r1);
        }else{
            System.out.println("1부터 9까지의 숫자만 입력해야 합니다!");
            return; //다음 로직으로 이동할 수 없다. --> 유효성 체크: front-End JS로 수행해야 하는 경우이다.
        }// end of 조건식(if-else)
        System.out.println("else 의 경우 여기가 실행기회를 가지지 못함, return을 만나기 때문이다.");
        System.out.println(r2);

    }// end of main
}// end of Oper02
