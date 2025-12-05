// date 25.12.05 12:33
// title; null 값이면 toString이 출력되는가?
package ch06;

public class B7 {
    public static void main(String[] args) {
        String s = null;
        //System.out.println(s.toString());
                // -> NullPointerException: Cannot invoke "String.toString()" because "s" is null (s 가 Null 값이여서 Error 발생)
        if(s!=null){
            System.out.println(s.toString());
        } // s 가 null 값이 아니면 출력(null값이이기에 if 값은 실행되지 못함.)

        System.out.println("여기".toString()); //  toString이 실행되지 않음을 알 수 있음.
        //System.out.println(null.toString());
    }// end of main
}// end of public class B7
