//date 25.12.01 18:02
package ch03;
/* +++++ 정리 14 +++++
    1. String은 불변객체, 원본이 바뀌지 않음
    2. String은 Class임. 참조형 타입임
    3. 클래스 타입에서 유일하게 변수를 호출하면 문자열 값을 반환해준다.
*/

public class Oper081 {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        String s4=new String("Hello");
        // 주소번지가 같은지 질문? ==> true
        /*  +++++ 정리 15 +++++
                1. s1이 가르키는 값과 s2가 가르키는 값이 같은가 true
                2. s1처럼 new를 사용하지 않고 문자열을 생성하는 경우, 기존에 있는 값을 참조한다. ==> ★ 새로운 문자열 객체가 생성되는 것이 아님!!
        */
        System.out.println(s1==s2); // TRUE OR FALSE ==> TRUE
        System.out.println(s3==s4); // FALSE 가 출력 -- 둘의 주소번지가 같은가?
        // s3 과 s4 가 가르키는 문자열이 같은가?  TRUE
        // 문자열이 같은지를 비교하기 ↓ (equeal 활용)
        System.out.println(s3.equals(s4)); // true 출력됨.


    }// end of main
}//end of Oper081
