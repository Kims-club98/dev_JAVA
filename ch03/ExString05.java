// date 25.12.02 12:48
// title: 불변객체 String(replace 사용, 불변객체)

/* === 정리 6 ===
    1. String은 좀 특이한 객체임(불변객체, 읽기 전용)
    2. 실무에서는 StringBuilder OR StringBuffer중 하나를 사용함.
 */
package ch03;

public class ExString05 {
    public static void main(String[] args) {
//      ● "대입"으로 인한 객체가 생성!
        String s1= "Hello"; // Hello
        System.out.println(s1+" World!!!"); // Hello World!!!
        System.out.println(s1);// Hello

        String s2 ="jaja";
        System.out.println(s2.replace("j","h")); // haha
        System.out.println(s2); // jaja ==> String은 replace 가 되지 않음(불변객체)

    }// end of main
}// end of ExString05
