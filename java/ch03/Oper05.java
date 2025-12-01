//date 25.12.01 17:02
// title: 삼항연산자 ★★★
/*
 사례: 90점 이상은 A, 80점 이상은 B...
*/
package ch03;

public class Oper05 {
    public static void main(String[] args) {
        int age =0;
        String result=(age>=19) ? "성인":"미성년자"; //
        System.out.println(result); // 해석: age가 19세 이상이면 성인, 아니면 미성년자 출력
    }// end of main

}// end of Oper05
