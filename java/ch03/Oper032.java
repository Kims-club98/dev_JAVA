//date 25.12.01 15:09

// Q -> A 형식의 input
package ch03;

import javax.swing.*;
import java.util.Scanner;

public class Oper032 {
    public static void main(String[] args) {
        int first =0;
        int second=0;
        String sFirst=null;
        String sSecoend=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하시오.");
        first=sc.nextInt(); //int 값을 반환
        System.out.println("두번째 숫자를 입력하시오.");
        second=sc.nextInt();
        System.out.println(" () 있는 답====>두 수의 합은 "+(first+second)+" 입니다!");
        System.out.println("() 없는 답=====>두 수의 합은 "+first+second+" 입니다!");


    }// end of main
}// end of Oper032
