package ch02;

class A{
    int age;
}//end of A

public class AMain {
    public static void main(String[] args) {

        A a=new A();
        a.age=10;
        System.out.println(a+",a.age"+a.age);
        /*
            tip:
                 같은 타입의 변수 a에 새롭게 인스턴스함 -> 주소번지가 다름
                 그래서 9번에서 age 변수에 10으로 재정의 된 것은 14번 결과에 영향이 없음.
         */
        a=new A();
        System.out.println(a+", a.age"+a.age);
    }// end of main
}// end of Amain
