// date 25.12.03 10:58
// title: 1차배열(개선된 for문 만들어보기)

package ch05;

public class FirstArray02 {
    public static void main(String[] args) {
        String is[]=new String[]{"국어","영어","수학"};

        for(int i=0;i<is.length;i++){
            System.out.println(is[i]);
        }// end of for
    }// end of main

}// end of FirstArray02
// 결과: 국어, 영어, 수학을 출력.
