// date 25.12.03 09:46 / 10:56
// title: 1차 배열

package ch05;

public class FirstArray01 {
    public static void main(String[] args) {
        // -> 선언과 생성을 한번에 처리하기(time line 걱정은 덜함) -> if 선언과 생성을 분리해서 처리 시 타임라인에 사전 대비 必
        // -> NullpointException 발생할 수 있다는 점
        int is [] = new int[3];
        // 변하는 것과 변하지 않는 것을 관찰해보기(변하지 않는 것들은 공통으로 분리할 수 있다(보일러 플레이트 코드를 줄임)
        is[0]=1;
        is[1]=2;
        is[2]=3;

        // 개선된 for문( for 내에서는 i만 변화한다.)
        for(int i=0;i<is.length;i++){
            System.out.println(is[i]);
        }// end of if
        int is1 [] = null; // 배열 선언 (line 9,10)
        // -> JAVA에서는 선언부가 아닌 생성부의 이름으로 이름이 결정됨
        is1=new int[5]; // 배열 생성(line 11)
    }// end of main
}// end of FirstArray01

// 4