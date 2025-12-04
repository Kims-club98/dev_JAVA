// date 25.12.02 16:14
// title: 이차배열

package ch05;

public class TwoArray01 {
    public static void main(String[] args) {
        // 0,0 0,1 0,2
        // 1,0 1,1 1,2
        int is[][] = new int[2][3]; // 2차 배열이므로 빈 칸이 2개 必
        for(int row=0;row<is.length;row=row+1){ // row 배열
            for(int cols=0;cols<is.length; cols=cols+1){ // cols 배열
                System.out.println("is["+row+"],["+cols+"]="+is[row][cols]);
            }// end of inner for(cols)
        }// end of outer for(row)
    }// end of main
}// end of TwoArray01
/* == 정리 8 ==
    1. ROW 배열 -> COLS 배열 -> 출력
    2. 배열을 생성할 때 NEW 예약어를 사용하고 있음 -> 참조형 TYPE 이다.
    3. Collection FrameWork -> 제네릭 활용
    4. 메모리에는 2층이 없다.
    5. 1차배열과 2차배열의 비교
    6. int is[0] 1차 배열의 경우 값을 반환한다.
    7. 동일한 표현식 int is[0]이 2차 배령의 주소번지이다.
    8. 결론) 2차 배열의 값을 출력하려면, 배열 기호가 2개 必(1차 배열의 2개가 모인 것임)

 */