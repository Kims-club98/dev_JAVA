// date 25.12.02 12:17
// title: 객체가 같으면 다른 인스턴스여도 HashCode가 동일한가?, identityHashCode 출력하기
/* === 정리 5 ===
    1. identityHashCode()는 객체가 실제로 같은 인스턴스인지 구분하는데 사용하는 값을 반환한다.
    2. identityHashCode()의 값은 실제 메모리 주소가 아님!
    3. But JVM이 객체를 식별할 시 사용할 수 있는 가상의 식별코드임!!
*/
package ch03;

public class ExString03 {
    public static void main(String[] args) {
        String s1 ="JAVA";
        String s2 = new String("JAVA");
        System.out.println(s1==s2); // s1, s2는 type이 달라서 false 출력("주소번지가 다르다")
        System.out.println(s1.equals(s2)); // 변수가 가리키는 문자열의 값을 비교 -> true
//      ○ s1과 s2가 같은 객체인 경우, identityHashCode 값이 같음. & 다른 객체라면 identityHashCode 값이 다름.
        System.out.println(System.identityHashCode(s1)); // 189568618
        System.out.println(System.identityHashCode(s2)); // 793589513
    }// end of main
}// end of ExString03

