package The_Essence_Of_Java.ch4;

public class FlowEx31 {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            if(i%3==0) // 조건식이 참이 되어 continue문이 수행되면 블럭의 끝으로 이동한다. break문과 달리 반복문을 벗어나지 않는다.
                continue;
            System.out.println(i);
        }
    }
}
