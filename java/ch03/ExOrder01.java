//date 25.12.02 11:34
/* title: 복합조건-> 주문 가능 여부 Check 하기
    조건: 재고수량이 0보다 크고, 사용자가 로그인 한 상태이고 VIP이거나 장바구니 금액이 50,000원 이상이면 줌닌이 가능하다.
*/
package ch03;

public class ExOrder01 {
    public static void main(String[] args) {
        int stock=10; //  재고수량(stock)
        boolean isLogin=true; // 로그인 여부(isLogin) (boolean은 T/F로만 출력)
        boolean isVip=false; // Vip 여부(isVip)
        int cartTotal=60000; // 카트가격 총량 여부(cartTotal)
        // insert here
        boolean cartOrder = (stock > 0 && isLogin) && (isVip || cartTotal >=50000);
        if(cartOrder) {
            System.out.println("주문이 가능합니다.");
        }else{
            System.out.println("주문이 불가능 합니다.");
        }// end of if..else(cartOrder)



    }// end of main
}// end of ExOrder01
/*
    -> 재고 있어야 하며, 로그인도 해야 주문이 가능함
    isVip || cartTotal >=50000
    ->Vip이거나, 장바구니 50000원 이상이면 -> 주문가능
*/
