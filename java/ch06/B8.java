// date 25.12.05 12:38
// title: 예외발생 처리 => try-catch 문 처리

package ch06;

public class B8 {
    public static void main(String[] args) {
        int [] is =null;
//      System.out.println(is.length); // null 값이므로 NullPointException 발생
//      ♣ 예외가 발생하는 가능성이 있는 코드를 쓰기
        try{
            System.out.println(is.length); // 오류 발생 우려가 있는 문 작성
        }catch (NullPointerException e) {
            System.out.println("is 가 생성되지 않아 Error 발생"); // Null 값 발생 시 다음 내역이 출력됨.(다른 서비스는 이용 가능하다.)
        }
    }// end of main
}// end of class B8
