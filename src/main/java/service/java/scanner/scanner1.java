package service.java.scanner;

import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력해주세요:");
        String str = scanner.nextLine();
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력해주세요:");
        // nextInt 는 입력을 정수로 가져오는 것
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력해주세요:");
        // nextDouble 는 입력을 실수로 가져오는 것
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleValue);



    }
}
