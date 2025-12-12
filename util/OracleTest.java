// date 10:53

package util;

import java.sql.Connection;

public class OracleTest {
    public static void main(String[] args) {
     DBConnectionMgr dbmgr = new DBConnectionMgr();
//금지: DBCconnectionMgr dbmgr1 = new DECconnectionMgr() // => 계속 클래스가 복사되는 문제가 발생.
     Connection conn = dbmgr.getConnection(); // db에서 연결하기
        System.out.println(conn);
    }
}
