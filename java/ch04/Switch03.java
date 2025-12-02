//date 25.12.02 14:47
// title: switch 3
package ch04;

public class Switch03 {
    public static void main(String[] args) {
        int x =1;
        switch (x){
            case 0: ++x;
            case 1: ++x;// x = x+1 ∴ x = 2
            case 2: ++x;// x=3
            default: ++x;// x=4
        }// end of switch
        System.out.println("여기");
    }// end of main
}// end of Switch03
