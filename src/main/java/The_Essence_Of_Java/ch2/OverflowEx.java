package The_Essence_Of_Java.ch2;

public class OverflowEx {
    public static void main(String[] args) {
        short sMin = -32768;
        short sMax = 32767;
        char cMin = 0;
        char cMax = 65535;

        System.out.println("sMin = " + sMin);
        System.out.println("sMin-1 = " + (short) (sMin-1)); // 자료형 (short)를 지정해주지 않으면 자료형이 int로 바뀌어서 -32769로 계산됨
        System.out.println("sMax = " + sMax);
        System.out.println("sMax+1 = " + (short)(sMax+1));
        System.out.println("cMin = " + (int)cMin);
        System.out.println("cMin-1 = " + (int)--cMin);
        System.out.println("cMax = " + (int)cMax);
        System.out.println("cMax=1 =" + (int)++cMax);
    }
}
