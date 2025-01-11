package service.java.casting;

import org.w3c.dom.ls.LSOutput;

public class Casting3 {

    /**
     1. 같은타입의 계산은 같은타입의 결과
     int * int -> int
     double * double -> double

     2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 발생
     int * long -> long
     int * double -> double

     * **/
    public static void main(String[] args) {
        int div1 = 3 / 2;
        System.out.println("div1 = "+ div1); //1

        double div2 = 3 / 2; // 3도 int, 2도 int
        System.out.println("div2 = "+ div2); // 1


        double div3 = 3.0 / 2; // 3 : double   2: int -> double
        System.out.println("div3 = "+ div3);


        double div4 = (double) 3 / 2;
        System.out.println("div4 = "+ div4);

    }
}
