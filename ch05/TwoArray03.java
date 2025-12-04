// date 25.12.02 17:05
// title: 다차원배열
/* for 문 -> while 문
   while 문 -> for 문
   while무네서 조건식에 초기화할 부분이 없다. --> 관찰.
 */

package ch05;

public class TwoArray03 {

    // ★☆★☆★☆ for 문 -> while 문으로 변경 ★☆★☆★☆
void methodA(int[][] is){
int row =0;
    while(row<is.length){
    int cols=0;// 위치 확인!
        while(cols<is[row].length){
            System.out.println("is["+row+"]["+cols+"]="+is[row][cols]);
            cols++;
        }// end of inner while
        row++;
    }// end of outer while
    System.out.println("===========================================================");
}// end of methodA

    public static void main(String[] args) {
/*  === 정리 9 ===
    1. main에서 for문으로 출력한 결과를 while문으로 변경해 본다.
    2. for문에서는 구간이 조건문에 들어가니까 제한적으로 반복이 일어난다.
    3. while문 증감연산자가 빠져 있으면 무한루프의 위험이 높은 편이다.
 */
//    ● 원소의 개수는 몇 개?
        int is[][]=new int[3][];
        is[0]=new int[]{1,2,3}; // 1차항
        is[1]=new int[]{4,5};// 2차항
        is[2]=new int[]{6,7,8,9};// 3차항
        TwoArray03 ta3=new TwoArray03();
        // -> 나는 개발자가 정의한 메서드 호출 가능하다.
        // -> 나는 정의한 메서드 파라미터 타입과 개수 그리고 return type까지 맞춰 쓸 수 있다.
        ta3.methodA(is); // 이 부분을 작성할 수 있도록 연습하기
        // is == is[0]

        for(int row=0;row<is.length;row++ ){
            for(int cols=0;cols<is[row].length;cols++){ // row만큼의 길이
                System.out.println("is["+row+"]["+cols+"]: "+is[row][cols]);
            }// end of inner for(cols)
        }// end of outer for(row)
    }// end of main
}// end of TwoArray03



// 다음 정리 9