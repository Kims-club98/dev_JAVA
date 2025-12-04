// date 25.12.04 18: 25
// title: 복습 2
package ch05.aobject3;
class DE1{

}

class   DE2{

}

public class DEmain {
    public static void main(String[] args) {
        DE1 de1=new DE1();
        DE1 de11=new DE1();
        System.out.println(de1==de11); // false
        System.out.println(de1.equals(de11)); // false
    }
}
