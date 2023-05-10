package Ex_10;

public class Ex10_01 {
    public static void main(String[] args) {
        int[] aa = new int [3];
        try {
            aa[2] = 100 / 0;
            aa[3] = 100;
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("배열 첨자가 배열 크기보다 커요 ~~");
//            System.out.println(" 오류 메세지 : " + e);
//        }catch (ArithmeticException e){
//            System.out.println("0으로 나누는 등의 오류에요~~");
        }catch (Exception e){ // Exception 구문은 제일 마지막에 작성해야함
            System.out.println("자바에서 발생되는 모든 에러를 다 잡을 수 있음");
            System.out.println("오류 메세지 : " + e);
        }
        finally {
            System.out.println("이부분이 무조건 나와요~~");
        }
    }
}
