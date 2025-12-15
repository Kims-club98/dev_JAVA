//date 251215 15:05
//

package ch15;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapTest02 {
    //파라미터의 갯수가 다르거나 타입이 다르면 같은 이름의 메서드이더라도
    //다른 메서드로 간주함.(개수, Type이 다른 같은 이름의 메서드 => 다른 메서드로 간주)
    public void methodA(Map<String,Object> pmap){
        System.out.println("methodA(Map)");
        Set<String> set = pmap.keySet(); // 파라미터 String
        Object[] keys = set.toArray();// 파라미터 Object
        for (int i = 0; i <keys.length ; i++) {
            System.out.println(keys[i]); // deptno, dname, loc...
        }
        System.out.println("===================================");
        for (int i = 0; i <keys.length ; i++) {
            System.out.println(pmap.get(keys[i]));
        }
    }// end dof String,Object methodA

    public void methodA(HashMap<String,Object> pmap){
        System.out.println("methodA(HashMap)");//싱글스레드 안전
    }
    public void methodA(Hashtable<String,Object> pmap){
        System.out.println("methodA(Hashtable)");//멀티스레드안전
    }

    //deptno -> 10, dename -> 영업, loc -> 서울
    //deptno -> 20, dname -. 개발, loc -> 서귀포
    // Q. 어떻게 6개의 정보를 관리할 수 있을까??
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("deptno",10);
        map.put("dname","영업");
        map.put("loc","서울");

        map.put("loc","부산");
        System.out.println(map.get("deptno"));
        System.out.println("dname");
        System.out.println(map.get("loc")); // 부산이 출력된다.(가장 가까운 선언)

        // 키를 가져오는 코드를 작성하시오
        MapTest02 mt2 = new MapTest02();
        mt2.methodA((map));
        HashMap<String, Object> hm = new HashMap<>();
        mt2.methodA(hm);
        Hashtable<String, Object> ht = new Hashtable<>();
        mt2.methodA(ht);
        // 순환과정을 이용하여 원하는 값 찾기
    }


}
