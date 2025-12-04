package ch05.aobject2;

public class Hint1 {
    public static void main(String[] args) {
        NoticeVO[] nvos = new NoticeVO[3];
        NoticeVO nvo = null;
        for(int i=0;i<nvos.length;i++){
            nvos[i] = nvo;
        }
        for(NoticeVO nvo2: nvos){
            System.out.println(nvo2);
        }
    }
}
