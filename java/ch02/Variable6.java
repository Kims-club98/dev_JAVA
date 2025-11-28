package ch02;
/*
    ***** 정리 10: 메서드의 return type 자리에도 정수 타입이 올 수 잇다. *****
        - return type으로 반환받은 값을 어떻게 다른 메서드에서 사용하는 가?
        - 메서드 안에서 선언된 변수는 지변(지역변수) 이다.
        - 지변은 선언된 메서드 내에서만 접근이 가능하다.
*/
public class Variable6 {
/*
    *** 정리 11 ***
        - 메서드 선언 시 => return type을 줄 수 있다.
        - 반환값이 없다면? => void라 쓰고, 반환값이 있을 때는 type를 맞춰서 사용할 것
        - 괄호 앞 이름이 있다면 메서드(이름 앞 리턴타입에 추가할 수 있다.
 */
    int methodA(){
        int i=1;
        i = i + 2; // 3
        return i; // i 가 1이라면 i를 출력함
    }// end of methodA

    public static void main(String[] args) {
        /*
            Q. 굳이 main 메서드 안에서 methodA에 선언된 지변 i 값을 사용하고 싶다(원칙은 불가) -> 방법은?
         */
        Variable6 v6 = new Variable6();
        int i = v6.methodA(); // i를 선언하고 v6의 methodA()를 호출
        System.out.println("main : "+i); // 최종 RETURN 값 3 출력


    }// end of main
}
