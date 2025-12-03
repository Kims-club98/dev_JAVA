// date 25.12.03 13:04
// title:

package ch05.aobject;

public class MemberVOTest2 {
    public static void main(String[] args) {
        // ★☆★☆★☆ 객체 배열은 주소번지를 2번 접근해야 함. ★☆★☆★☆
        MemberVO [] mvos1 = new MemberVO[]{new MemberVO(),new MemberVO(), new MemberVO()};
        for (MemberVO mvo:mvos1){
            System.out.println(mvo);
        }// end of for(MemberVo mvo:mvos1)
    }// end of main
}// end of MemberVOTest2
