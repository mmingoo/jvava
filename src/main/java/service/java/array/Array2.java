package service.java.array;
/**
 * 변수 타입엔 두 가지가 있다.
 * 1. 기본형 : 사용하는 값을 직접 넣을 수 있는 변수 ex) int, long, ~~~
 * 2. 참조형: 데이터에 접근하기 위해 참조(주소)를 저장하는 변수 ex) 배열, 객체
 * **/
public class Array2 {
    public static void main(String[] args) {
        int size = 12000;
        int [] example_array;

        // 기본형 같은 경우 데이터 선언과 동시에 크기가 할당된다.
        //반면에 참조형 같은 경우는 해당 코드를 실행할 때 동적으로 크기를 할당 받는다는 차이점이 있다.
        example_array = new int[size];

    }
}
