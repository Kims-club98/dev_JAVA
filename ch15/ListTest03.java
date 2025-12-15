//date 251215 14:40
// title: ArrayList, Vector, LinkedList
package ch15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest03 {
    public static void main(String[] args) {
        List li1 = new ArrayList();
        ArrayList all = new ArrayList();
        List li2 = new Vector();
        List li3 = new LinkedList();
        // li1 타입은 List 타입으로, List 인터페이스에 선언된 메서드만 호출 가능
        // But all 타입은 ArrayList 타입이라서 List에 있는 것 + ArrayList에만 있는 곳 모두 호출 可
        li1.add("A");
        all.add("A");
        // Spring bott는 코드 레벨의 인스턴스화를 하지 않는다.
        // 객체 주입에 대한 책임 => 개발자가 아닌 Container에 있음.(Container가 JAVA 클래스임 - ApplicationContext)
        // Collection Framework에서 제공하는 클래스들은 정렬, 검색, 부가기능들이 많이 있음.
        // 읽고 쓰기가 가능하면 된다. 그리고 자료구조 안에 데이터가 있는지 없는지 판단하는 boolean 인 것임.
    }
}
