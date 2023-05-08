package Collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex_ListExam01 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        // list 객체에 데이터 추가하기
        list.add("이협건");
        list.add("고길동");
        list.add("둘리");
        list.add("또치");
        list.add("희동이");

        int listSize = list.size();

        System.out.println("저장된 데이터 수 " + listSize);

        // 일반적인 반복문 -- 1세대
        // 단점 : 반드시 반복의 횟수를 알고 있어야 사용 가능함

        System.out.println("1세대 반복문");

        for (int i = 0; i < listSize; i++){
            System.out.println("이름 : " + list.get(i));
        }

        // 개선된 for 반복문 -- 2세대 (Python도 사용)
        // 장점 : 1세대 반복문의 단점인 반드시 반복의 횟수를 알고 있어야 하는 반복문의 문제점을 개선함

        System.out.println("2세대 반복문");

        for (String name : list){
            System.out.println("이름 : " + name);
        }

        // 개선된 for 반복문 -- 3세대
        // 장점 : 2세대 보다 코딩해야 하는 줄(라인)이 감소함, 람다식 적용, 자바 1.8부터 사용 가능

        System.out.println("3세대 반복문");

        list.forEach(name -> System.out.println("name : " + name));

        // 개선된 for 반복문 -- 4세대
        // 장점 : 3세대에 비동기식 처리 방법 적용
        // 단점 : 처리 완료가 누가 먼저 될지 알 수가 없음, 따라서 모든 경우에 쓸 수 없음

        System.out.println("4세대 반복문");

        list.parallelStream().forEach(name -> System.out.println("name : " + name));

        System.out.println("1.5세대 반복문");

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String name = it.next();
            System.out.println("이름 : " + name);
        }
    }
}
