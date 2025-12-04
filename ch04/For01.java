// date 25.12.02 14:51
// title: for 1(반복문)
package ch04;

public class For01 {
    int cnt;
    int account(int start,int end){
        for (int i = start;i <=end;i++) {
            System.out.println(i);
            if(i % 2 == 0){
                cnt++;
            }
            }// end of for
        //System.out.println(i); // for 문 안에서 선언한 i는 for 문 안에서만 사용 가능(밖에서는 사용 불가)
        return cnt;
    } // end of account
    public static void main(String[] args) {
        For01 f1 = new For01();
        int count=f1.account(1,3);
        System.out.println(count);
    }// end of main
}// end of For01
