//date 25.12.01 17:49
// title: 논리 연산자

package ch03;

public class Oper08 {
    public static void main(String[] args) {
        // String 타입은 문자열을 담는 타입임.
        String db_id="admin";
        String db_pw="123";
        String user_id="admin";
        String user_pw="123";
        // 문자열 비교할 때에는 equeal이라는 메서드를 사용함.
        System.out.println(1==1); // true -> 왼쪽과 오른쪽이 같은가? true 출력
        //System.out.println(1=1); // true -> 오른쪽 값을 왼쪽에 대입하세요(return type 이 boolean이 아니므로 1=1은 에러 발생)
        System.out.println(1!=1); // false 왼쪽과 오른쪽이 다른가? false 출력
        // db_id 주소번지와 user_id의 주소번지가 같은가? (line 18)
        System.out.println(db_id == user_id); // true
        // db_id 주소번지가 가리키는 값과 user_id가 가리키는 주소번지 값이 같은지? (line 20)
        System.out.println(db_id.equals((user_id)));// true

            }// end of main
}// end of Oper08
