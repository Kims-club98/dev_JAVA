package ch15;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        /* List 인터페이스에 이어서 new 다음에 쓸 수 없다
        So 인터페이스는 반드시 구현체 클래스가 있어야 함.
        왜냐하면 그래야 인스턴스화가 가능함 */

        /*
            - List 인터페이스에 이어서 new 다음에 쓸 수 있음
            - 인터페이스는 반드시 구현체 클래스가 있어야 함
            - 왜냐 하면, 그래야 인스턴스화가 가능함
            - 인터페이스를 인스턴스화 할때 new 다음 구현체 클래스가 옴
            - 선언부 type과 생성부 type이 다를 수 있음.
        */
        List nameList = new ArrayList();
        nameList.add("나신입");
        nameList.add("나초보");
        nameList.add("나일등");
        //System.out.println(nameList.size() instanceof Integer); //false => 문자열이기 때문에...
        System.out.println(nameList.get(1) instanceof String); // true
        String name = (String)nameList.get(1);
        System.out.println(name);

        List<String> nameList2 = new ArrayList<String>();//제네릭
        nameList2.add("나신입");
        nameList2.add("나초보");
        nameList2.add("나일등");
        String name2 = nameList2.get(1);
    }
}
