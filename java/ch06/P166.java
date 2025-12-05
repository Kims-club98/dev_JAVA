// date 25.12.05 14:36
// title: split 문
package ch06;

// 개별 필기: 문자열을 특정 가준(정규식)으로 나눠 배열로 변환하는 기능
// 문자열을 쪼개서 String []으로 만들어준다.
public class P166 {
    public static void main(String[] args) {
        String str ="자바, 파이썬, 오라클";
        String [] strs = str.split(",");

        // -> 개선된 for 문
        for(String s: strs){
            System.out.println(s);
        }
        System.out.println("=============== 구분 ===============");

        // -> 舊 for 문
        for(int i=0;i<strs.length; i++){
            System.out.println(strs[i]);
        }
    }

}
