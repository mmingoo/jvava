package service.java.scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료) : ");
            String name = input.nextLine(); //  2. \n 이 남아 있어서 빈문자 처리 돼서 입력이 제대로 안됨

            if (name.equals("종료")){
                System.out.print("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            // 1. 여기서 값일 입력하고 엔터를 치면  10 /n 가 입력됨
            int age = input.nextInt(); // 근데 여기서 10만 가져가버리고 \n 이 남아 있어서 맨 첫번째 입력에 가보면

            // 3. 해결책으로 다음을 통해서 \n을 없애줌
            input.nextLine();
            System.out.println("입력한 이름 :" + name + ", 나이 : " + age);
        }
    }
}
