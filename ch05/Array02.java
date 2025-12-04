// date 25.12.02 16:06
// title: 배열의 다양한 표시형식
package ch05;

public class Array02 {
    public static void main(String[] args) {
        int is[]= new int[3];
        int js[]= new int[]{1,2,3};
        int xs[]={2,4,6};

        for(int a=0;a<is.length;a=a+1){
            System.out.println(is[a]+", "+js[a]+", "+xs[a]);
        }// end of for
    }// end of main
}// end of Array02
