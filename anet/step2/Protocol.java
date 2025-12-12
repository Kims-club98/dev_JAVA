package anet.step2;
/*
   - publisher
   - Front - end
   - Back - end
   - Devops 엔지니어
   - TCP 동작엔진, Thread, DB 연동하기
 */
public class Protocol {
    private static final int ROOM_IN    = 100; // 입장하기
    private static final int MESSAGE    = 200; // 다자간 대화
    private static final int WHISPER    = 300; // 1:1 대화
    private static final int CHANGE     = 400; // 대화명 변경
    private static final int ROOM_OUT   = 500; // 나가기
}
