package service.java.method;

/**
 * 자바는 항상 변수의 값을 복사해서 대입한다
 * **/
public class MethodValue0 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1; // num2 변수에 대입하기 전에 num1의 값 5를 읽는다
                         // num1에 있는 값을 num2에 대입한다고 표현하지만, 실제로는 그 값을 복사해서 넣은 것이다.

        num2 = 10;

        System.out.println("num1 =" + num1);
        System.out.println("num1 =" + num2);

    }
}
