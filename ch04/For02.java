// date 25.12.02 15:04
// title: For 2(반복문), Random class 사용
package ch04;
/*
    Q. 0부터 9 사이의 임의의 숫자를 채번한다.
       기회는 총 5번까지 제공하자
       임의의 숫자를 맞추는 게임을 구현
       Hint: 정답보다 크면 낮춰라
       Hint: 정답보다 낮으면 높여라
       Hint: 정답을 맞추면 종료처리하기.
 */



public class For02 {
    public static void main(String[] args) {
        java.util.Random r = new java.util.Random(); // 임의의 숫자를 뽑는 클래스(상단 import 보다, 아래에 직접쓰도록 하기)
        java.util.Scanner sc = new java.util.Scanner(System.in); // 인스턴스화(상단 import 없엔 방법)

        // 채번한 숫자를 담을 변수를 선언
        int dap=r.nextInt(10); // 10 미만의 숫자를 임의로 채번하여 dap에 담긴다.
        int my= -1;
        int cnt=1; // 초기값 1

        while (true) { //무한 루프
            System.out.println("0부터 9사이의 정수를 입력하시오!");
            my=sc.nextInt();
            System.out.println("사용자가 입력한 정수는 "+my+"입니다!");
            if(cnt == 5){
                System.out.println("5번의 기회를 모두 사용하셨습니다.");
                sc.close();// 루프 빠져나가기
                System.exit(0); // JVM의 가상머신과의 연결의 끊음
            }else{
                System.out.println("비교하고 정답이 아니면 힌트를 주고 반복");
                cnt++; // -------------------- 1번 if 문 끝
            }if(my==dap){
                System.out.println("축하합니다. 정답입니다!");
                sc.close();
                System.exit(0);
            } else if (my > dap) {
                System.out.println("낮춰라");
            }else{
                System.out.println("높여라");
            }// end of 조건문(if)
        }// end of while
    }// end of main
}// end of For02
