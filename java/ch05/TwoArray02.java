//date 25.12.02 16:51
// title: 2차배열(2)
package ch05;

public class TwoArray02 {
    public static void main(String[] args) {
        int is[][]=null;
        is= new int[2][3];
        is[0]=new int[]{1,3,5};
        is[1]=new int[]{2,4,6};
        System.out.println(is);
        System.out.println("is.lenght는 행의 숫자: "+is.length); // 2
        // insert here Q. 나는 columns의 숫자를 출력하고 싶음
        System.out.println("is.lenght는 행의 숫자: "+is[0].length); // 3
        System.out.println("is.lenght는 행의 숫자: "+is[1].length); // 3

        for(int x=0;x< is.length;x++){ // x++는 1씩 증가하면서를 의미함 // 2
            System.out.println(is[x]);
        }// end of for(x)
    }// end of main
}// end of TwoArray02

