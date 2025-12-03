// date 25.12.03 13:09
// title

package ch05.aobject;

public class MemberVOTest3 {
    public static void main(String[] args) {
        MemberVO[] mvos = new MemberVO[3]; // 인스턴스 선언(배열)
        MemberVO mvo = new MemberVO();// 인스턴스화
        mvo.setMem_id("kiwi");
        mvo.setMem_name("키위");
        mvos[0]=mvo; // mvo에 값을 넣어주고 mvos[0]에 최종 넣어줌

        mvo.setMem_id("apple");
        mvo.setMem_name("사과");
        mvos[1]=mvo; // mvo에 값을 넣어주고 mvos[0]에 최종 넣어줌

        mvo.setMem_id("tomato");
        mvo.setMem_name("토마토");
        mvos[2]=mvo; // mvo에 값을 넣어주고 mvos[0]에 최종 넣어줌

        for(MemberVO mvo2:mvos){
            System.out.println(mvo2.getMem_id()+", "+mvo2.getMem_name());
        }
    }
}
