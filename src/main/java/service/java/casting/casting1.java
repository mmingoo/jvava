package service.java.casting;

public class casting1 {


    public static void main(String[] args) {

        /**
         * 작은 범위의 타입에서 큰 범위 타입에 숫자를 넣는 건 된다.
         **/
        int intValue = 20;
        long lonValue ;
        double doubleValue;


        lonValue = intValue;
        System.out.println("longValue = " + lonValue);

        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);


        doubleValue = 30L;
        System.out.println("doubleValue2 = "+ doubleValue);

        /**
         * 작은 범위의 타입에서 큰 범위 타입에 숫자를 넣으면 되는데
         * 이는 자동 형변환(묵시적 형변환)에 의한 것이다.
         **/
        doubleValue = (long) intValue;
    }


}
