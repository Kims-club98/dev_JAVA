// date 25.12.01 18:24

package ch03;
class Y{
    int ival;
}// end of Y

public class Oper082 {
    public static void main(String[] args) {
        Y y1=new Y();
        //Y y2=new Y();// y1, y2의 주소번지는 다름!
        Y y2= y1;
        y2.ival=100;

        System.out.println(y1==y2);// y1과 y2의 "주소번지"가 같은가? ==> false가 출력됨.
        System.out.println(y1.ival+", "+ y2.ival);// 0, 100을 출력
    }// end of main
}// end of Oper082
