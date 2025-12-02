// date 25.12.02 12:40
// title: String -> 읽기 전용 클래스이다.

package ch03;

public class ExString04 {
    public static void main(String[] args) {
//      ● "대입"으로 인한 객체가 생성!
        String s1= "Hello";
        System.out.println(System.identityHashCode(s1)); // Hello의 해시코드값 (189568618)
        s1=s1+"World!!!";
        System.out.println(System.identityHashCode(s1));// Hello World의 해시코드값 (1922154895)
        s1=s1+"JAVA";
        System.out.println(System.identityHashCode(s1));// Hello JAVA의 해시코드값 (883049899)

    }// end of main
}// end of ExString04

