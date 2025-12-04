// date 25.12.02 12:11
// title: hashCode
package ch03;

public class ExString02 {
    public static void main(String[] args) {
        String s1="Java";
        String s2="Java";
        System.out.println(s1==s2); // true
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.hashCode() == s2.hashCode()); // true

    }// end of main

}// end of ExString02
/* === 정리 4 ===
    1. String 클래스가 제공하는 hashCode()는 ==> 내용기반이므로 같은 내용이면 같은 hash값을 반환함
        즉. 객체가 서로 다르더라도, 내용이 같으면 같은 hashCode를 만든다.
*/
