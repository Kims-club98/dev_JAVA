package ch06;

class C1{
    C1Main cm = null;
    C1(C1Main cm){
        //아래 코드가 NullPointerException발생할 가능성이 있음.
        this.cm = cm;
        System.out.println(this.cm.nickName);
    }
}
public class C1Main {
    String nickName = null;
    public static void main(String[] args) {
        C1Main cm = new C1Main();
        C1 c1 = new C1(cm);
    }
}