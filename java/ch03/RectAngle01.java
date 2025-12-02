//date 25.12.02 10:46
/* title: 직사각형의 면적을 구하는 프로그램을 작성하시오(변수가 몇 개 필요한가? -> 2개)
          2개의 변수타입은 무엇으로 하는가? -> 정수
 */
package ch03;

public class RectAngle01 {
    public static void main(String[] args) {
        int width = 2; // 너비를 담을 변수 선언
        int height =3; // 높이를 담을 변수 선언
        int area=0; // 면적을 담을 변수 선언
        area=width*height; // 면적을 구하는 식
        System.out.println("직사각형의 변적은 "+area);
    }// end of main
}// end of RectAngle01

