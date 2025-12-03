//date 25.12.03 12:12
// title: getter와 setter

/*  === 정리 6: getter 와 setter ===
    - Spring Boot 수업에는 Lombok 사용함
    -

 */
package ch05.aobject;
/* === 정리 5 ===
    1. 접근 제한자 private은 클래스 내부에서만 접근이 가능
    2. private으로 변경하면 외부 클래스에서 직접 변조 불가능
    3. 변수는 읽기와 쓰기가 가능
*/
public class MemberVO {
    private String mem_id = null;//아이디 저장
    private String mem_pw = null;//비번 저장
    private String mem_name = null;//이름 저장
    private String mem_nickname = null;//닉네임 저장
    private int    mem_age = 0;//나이

    public String getMem_nickname() {
        return mem_nickname;
    }

    public void setMem_nickname(String mem_nickname) {
        this.mem_nickname = mem_nickname;
    }

    public String getMem_id() {
        return mem_id;
    }

    public void setMem_id(String mem_id) {
        this.mem_id = mem_id;
    }

    public String getMem_pw() {
        return mem_pw;
    }

    public void setMem_pw(String mem_pw) {
        this.mem_pw = mem_pw;
    }

    public String getMem_name() {
        return mem_name;
    }

    public void setMem_name(String mem_name) {
        this.mem_name = mem_name;
    }

    public int getMem_age() {
        return mem_age;
    }

    public void setMem_age(int mem_age) {
        this.mem_age = mem_age;
    }

}