//date 25.12.03 12:53

package ch05.aobject;

public class MembertVOTest1 {
    public static void main(String[] args) {
        MemberVO[] mvos = new MemberVO[3]; // MemberVO 배열에 방 3개 만든다.
        MemberVO[] mvos1 = new MemberVO[]{null,null,null}; // MemberVO에 null의 데이터 3개를 넣는다 (7,8은 같은 내용임!)

    for(MemberVO mvo:mvos1){
        System.out.println(mvo);
    }

    for(MemberVO mvo: mvos){
        System.out.println(mvo);
    }
    StringBuilder sb =new StringBuilder();
    MemberVO mvo = new MemberVO();
    mvo.setMem_id("kiwi");
    mvo.setMem_id("apple");
    mvo.setMem_id("tomamto");
    mvos[0] = mvo;
// this.mem_id = mem_id
    System.out.println(mvos[0].getMem_id());
    }// end of main
}
