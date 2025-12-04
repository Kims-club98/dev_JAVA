package ch05.aobject2.design;

import jdbc.MemberVO;
/* == 정리 4 ==
    1. 클래스 쪼개기 엽습 시 주의사항 - 절대로 static을 사용하지 않고 해보기
 */
// 나는 어떤 클래스도 상속받지 않고, 어떤 인터페이스도 implement 하지 않는다.
// override를 해야 한다(강제함) -> 나는 순수하다. -> 다른 것과 섞어 쓸때 훨씬 유리함.
// 순수한 것은 세련되지 않음.
// 즉 재사용성은 높고, 결합도는 낮아야 한다.=> 독립성이 높아진다 => 단위 테스트가 쉽다 => 통합테스트
// 상속 => 결합도를 높임 => 인터페이스 중시므올 설계를 하고 코딩을 수행한다.
public class JFrame01Logic {
    public JFrame01Logic(){
        System.out.println("JFrame01Logic 생성자 호출 성공");
    }// p.jf01logic
    public MemberVO[] getlist(){
        System.out.println("getList 호출 성공");
        return null;
    }// getlist
}// e.f JFrame01Logic
