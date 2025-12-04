// date 25.12.04 10:52
// title: 공지사항 게시판

package ch05.aobject2;
class N{}
/* == 정리 3 ==
    1. 접근제한자
        - public > protected > friendly(아무것도 없으면) > private;
        - Private으로 하면 캡슐화를 실현하는 것
        - 해당 변수의 위변조를 막아야 한다.
 */
public class NoticeVO {
// * 캡슐화로 인한 제약을 메서드로 해결해 본다!!!
    private  int n_no; // primary key
    private  String n_title; // 공지 제목
    private  String n_content; // 공지 내역

    // 1-1 getter 메서드 - return 타입이 있으나, parameter는 없음(읽기 전용이다)
        // 전변에 담긴 값을 받는다.
        // Q?: 전변에는 누가, 언제 값을 담는 것인가? - setter 메서드로 저장함
        // 사용법 -> 인스턴스화 필요
    public int getN_no() {
        return n_no;
    }
    // 1-2. setter 메서드 - return 타입이 없다(돌려받을 수 없다): 이 메서드 내부에서 사용된 지변의 값을 외부에서 사용 불가능
        // 이 메서드 내부에 사용된 지변의 값을 외부에서 사용 불가함
        // 파라미터는 있어야 함 - 왜냐하면 파라미터 값을 전변에게 저장해야 한다.
    public void setN_no(int n_no) {
        this.n_no = n_no;
    }

    public String getN_title() {
        return n_title;
    }

    public void setN_title(String n_title) {
        this.n_title = n_title;
    }

    public String getN_content() {
        return n_content;
    }

    public void setN_content(String n_content) {
        this.n_content = n_content;
    }

}// end of class NoticeVO
