//date: 25.12.05 12:45
//title:
package ch06;
/*
    substring(int beginindex)
    substring(int begindex, int endindex)
 */
public class P162 {
    public static void main(String[] args) {
        String s = "Oracle Project";
        String result = s.substring(3); // begininde에서 n번째부터 출력을 시작한다~
        System.out.println(result); // cle Project 출력
        result=s.substring(3,5);
        System.out.println(result); // cl 출력

    }

}
