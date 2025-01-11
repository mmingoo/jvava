package service.java.casting;

public class casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue;

        // 다음을 통해 강제로 명시적 형변환 가능
        // 형변환 = 캐스팅
        // 1.5 -> 1
        intValue = (int) doubleValue;


        //형변환을 통한 오버플로우 살펴보기
        //int 가 표현할 수 있는 범위는 -2,147,483,648 ~ 2,147,483,647 이다.
        // Java에서 정수 리터럴의 기본 타입이 int이기 때문에 2147483648를 초과한 경우 명시적으로 L을 붙여주지 않으면 컴파일 에러 발생.
//        long maxIntOverValue = 2147483648;
        long maxIntOverValue = 2147483648L;


        int maxIntOver = (int) maxIntOverValue;
        System.out.println("maxIntOverValue = "+ maxIntOverValue);
        System.out.println("maxInvOverValue를 int로 형변환 : " + maxIntOver);
    }
}
