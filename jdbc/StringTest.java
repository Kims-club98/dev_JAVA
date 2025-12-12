// date 251210 12:14
package jdbc;

import java.util.StringTokenizer;

public class StringTest {
    public static void main(String[] args) {
        String msg=200+"#"+"키위나무"+"#"+"오늘의 점심 메뉴는?";
        StringTokenizer st = new StringTokenizer(msg,"#");
        String protocol = st.nextToken();
        String nickName = st.nextToken();
        String message = st.nextToken();
        System.out.println(message);
        String other = st.nextToken();
        System.out.println(other);
    }// end of main
}// end of StringTest
