// date 25.12.02 10:56
/* title: 교집합(AND) 과 합집합(OR)
    === 정리 2 ===
    1. 불필요한 연산은 X => 최적화 부분과 관련있는 예제
    2. 앞이 이미 false면 뒤는 안봄 => 교집합(AND)
    3. 앞이 이미 true면 뒤는 안본다 => 합집합(OR)
 */
package ch03;

public class Oper09 {

        boolean left(){
            System.out.println("left() 호출");
            return false;
        }// end of left

        boolean right() {
            System.out.println("right() 호출");
            return true;
        }// end of right
    public static void main(String[] args) {
        // 인스턴스화부터 진행
        Oper09 op09=new Oper09();
        //-----------------------------------
        System.out.println("=== AND 연산 ===");
        boolean result1=op09.left() & op09.right(); // 교집합 (&&)
        System.out.println("결과: "+result1);
        System.out.println("=== OR 연산 ===");
        boolean result2= op09.left() || op09.right(); // 합집합(||) -> 앞에 False가 나오면
        System.out.println("결과: "+result2);

        }//end of main
}// end of Oper09

/* === 정리 3 ===
    A. 교집합(AND 연산자)
        1. 논리 연산자가 & 이면 +> 참 | 참 일때만 결과가 참이다. (교집합)
        2. 둘 중 하나라도 거시이면 결과는 거짓이다.
        3. 첫번 째 조건에서 이미 False가 나왔으므로 그 뒤의 조건을 따지지 않는다.
    B. 합집합(OR 연산자)
        1. OR 연산자는 둘 중 하나라도 참이라면 => 참이다.
        2. 참 | 거짓 => 참, 참 | 참 => 참, 거짓 | 거짓 만 => 거짓
        3. 앞의 결과가 참이 나왔다면, 뒤의 조건과 관련없이 결과값이 참임이 결정되었다. (과연 뒤의 조건을 따질 필요가 있을까?)
*/

// 정리 4 부터...