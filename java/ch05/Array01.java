//date 25.12.02 15:56
//title: 1차배열
/* === 정리 7 ===
    1. 배열은 같은 타입만 담을 수 있다.
    2. 중간에 끼워넣기가 불가능하다.
    3. 원소의 개수가 고정되어 변경이 불가능하다.
 */

package ch05;
//1차 배열
public class Array01 {
    void methodA(int[] is){
        for(int i=0;i<is.length;i++){
            System.out.println(is[i]);
        }
    }
    public static void main(String[] args) {
        int is[] = new int[3];
        System.out.println(is[0]);//0
        System.out.println(is[1]);//0
        System.out.println(is[2]);//0
        System.out.println("==============================");
        Array01 ar1 = new Array01();
        ar1.methodA(is);
    }
}