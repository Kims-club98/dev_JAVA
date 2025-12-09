// date 25.12.05 11:41
/* title:
    파라미터에 원시형 타입 넣기 - 쉬움
    파라미터에 참조형 타입 넣기 - 여려움 ★★★
*/
package ch06;

public class B6 {
    void  methodA(int is[]){
        for(int i=0;i<is.length;i++){
        System.out.println("1차배열: "+is[i]);

        }
        System.out.println("++++++++++ 1차 배열 ++++++++++");
    }// end of methodA(1차 배열)

    void methodA(int is [][]) {
    for(int i=0;i< is.length;i++){
        for(int j=0;j<is[i].length;j++){
            System.out.println("2차배열: "+is[i][j]);
        }
        System.out.println("+++++++++++ 2 차 배열 ++++++++++");
    }
    }// end of methodA (2차 배열)

    public static void main(String[] args) {
        B6 b6 = new B6();
        int is[] =new int[3]; // print: 0, 0, 0
        int is1[] = {1,2,3};// print: 1, 2, 3
        int is2[] = new int[]{4,5,6}; // print: 4, 5, 6
        b6.methodA(new int[]{1,2,3}); // print: 1, 2, 3
        b6.methodA(is);
        b6.methodA(is1);
        b6.methodA(is2);
        int is3 [][] = new int[2][3]; // 2*3으로 6번 출력됨.
        int is4[][] = {{1,2,3},{4,5,6}};
        int is5[][] = new int [][]{{10,20,30},{40,50,60}};
        b6.methodA(is3);
        System.out.println("===============================");
        b6.methodA(is4);
        System.out.println("===============================");
        b6.methodA(is5);
    }// end of main

}// end of public class B6
