// date 25.12.01 14:38
package ch03;

import javax.swing.*;

public class Oper03 {
    public static void main(String[] args) {

        // Q 첫번째 숫자를 입력 받고 두 번째 숫자도 입력 받아서 두 수의 합을 구하는 프로그램을 작성하시오

        //1. 첫 번째 숫자를 담을 변수 선언
        int first =0;
        //2. 두 번째 숫자를 담을 변수 선언
        int second =0;
        // 중요: first = JOption~ 형식은 불가능!
        // 불가능: first = JOptionPane.showInputDialog("첫번째 숫자를 입력하시요")
        // ** 해결방안: String 타입으로 새로 변수 선언하고
        String sFirst = null;
        String sSecoend=null;
        sFirst=JOptionPane.showInputDialog("첫번째 숫자를 입력하시오."); // return type이 string이기 때문에 하단 integer.parseint 로 바꿔야 함.
        sSecoend=JOptionPane.showInputDialog("두번째 숫자를 입력하시오.",0);
        //sSecoend=JOptionPane.showInputDialog("메시지",new Integer(0));
        // L new Integer(괄호 안의 정수인 경우) 더이상 지원하지 않습니다. - Deprecated
        System.out.println(sFirst);
        /* +++++ 정리 7 +++++
         1. Integer는 int원시타입에 대한 래퍼클래스
         2. 왜 필요한가? => 원시형 타입은 메서드나 field를 소유할 수 없음 => 클래스가 아님...
         3. 메서드 선언부에 static붙어 있으면(main) 인스턴스화 없이 사용 가능함
         4. static이 붙은 메서드는 복제본을 만들지 않음. -> Spring에서는 Sigle Trun pattern(싱글턴 패턴)이라고 함.
         */
        first=Integer.parseInt(sFirst); // if 문자가 들어갔을 경우 int 타입으로 바꿀 수 없다. (ex. "안녕하세요.")
        System.out.println("당신이 입력한 숫자는 "+first+" 입니다!");
        // If 사용자가 숫자가 아닌 문자(string...)를 입력하였을 때?(runtime 오류의 발생!)
        /* +++++ 정리 8: auto boxing +++++
            1. int와 Integer의 경우 autoboxing의 지원으로 타입으 자동으로 전환해줌
            2. 원시형 타입과 Wrapper클래스는 별도로 type을 주지 않더라도 자동으로 처리가 됨.
         */
        System.out.println("여기");
        second=Integer.parseInt(sSecoend);
        System.out.println("당신이 입력한 숫자는 "+second+" 입니다.");
        //System.out.println(second);
        System.out.println("두 수의 합은: "+(first+second)); // 사칙연산 시 ()에 넣어야 함.
        System.out.println("1"+2);// 3이 출력되는 것이 아닌 12가 출력됨(1은 String)
    }// end of main
}// end of Oper03
