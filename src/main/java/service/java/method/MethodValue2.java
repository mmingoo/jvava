package service.java.method;

/**
 * 자바는 항상 변수의 값을 복사해서 대입한다
 * 변수명을 같게 해서 해보자
 * main() 에서의 number 와 changeNumber 의 number 는 다른 객체이다. 변수명만 같을 뿐 저장되는 메모리의 주소는 다르다
 * **/
public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number);
        changeNumber1(number); // number 객체 자체를 넘기는 게 아니라 number 객체에 있는 value를 읽고 그 값을 changeNumber에 넘기는 것

        // 변수의 값을 복사해서 넣었기 때문에 호출 후에도 num1 은 5이다
        System.out.println("4. changeNumber 호출 후, number : "+ number);




        ///////////////////////////////////////////
        // 근데 만약에 *2 하는 메서드를 만들고 싶다면?
        int num1 = 10;
        num1 = changeNumber2(num1);

    }

    public static void changeNumber1(int number){
        System.out.println("2. changeNumber 변경 전, number : "+ number);

        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number : "+ number);

    }

    public static int changeNumber2(int number){
        number = number * 2;

        return number;
    }
}
