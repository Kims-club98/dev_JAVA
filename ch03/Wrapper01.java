//date 25.12.02 11:51
/* title: 원시형 타입에 대응하는 클래스가 必(if - instanceof Integer/String)
    원시형 타입은 변수나 메서드를 가질 수 없다.
*/


package ch03;

public class Wrapper01 {
    public static void main(String[] args) {
        Integer i = new Integer(10); // autobox 로 인해 사용 지양을 요구
        int j = i;
        System.out.println(i);
        System.out.println(j);
        // 인스턴스 변수 i는 Integer type인가? -> true
//      ● 변수의 type을 if문을 통해(instanceof) 확인하기.
        if(i instanceof Integer){
            System.out.println("i는 Integer 타입 입니다.");// i가 Integer 타입이면 => 출력
        }// end of if
//      ● 변수 i 는 본래 Integer인데 String타입으로 전환됨.
        String x = String.valueOf(i);
        if(x instanceof String){
            System.out.println("변수 x는 String 타입입니다.");
        }
    }// end of main

}// end of Wrapper01
