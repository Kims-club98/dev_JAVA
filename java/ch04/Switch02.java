//date 25.12.02 14:45
// title: Switch문 2
package ch04;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        String bread=null;// 입력이 필요할 때는 null 값을 넣는다.
        Scanner sc = new Scanner(System.in);
        // 빵을 입력받기.
        System.out.println("원하는 빵 이름을 입력하세요!");
        bread=sc.nextLine();
        switch (bread){
            case "소보로":
                System.out.println("당신은 소보로빵을 선택하였습니다.");
                break; // 있어야 선택 후 빠저나오게 됨.
            case "도넛":
                System.out.println("당신은 도넛을 선택하였습니다.");
                break;
            default:
                System.out.println("원하는 빵이 없습니다.");
        }// end of switch
    }// end of main
}// end of Switch02
