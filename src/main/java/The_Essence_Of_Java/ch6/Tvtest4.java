package The_Essence_Of_Java.ch6;

public class Tvtest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv 객체 배열

        // Tv 객체를 생성해서 Tv 객체 배열의 각 요소에 저장
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10; // tvArr[i]의 channel에 i + 10을 저장
        }
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();   //tvArr[i]의 메소드를 호출. 채널이 1증가
            System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
        }
    }
}
