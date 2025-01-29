package service.java.array;

import java.util.Scanner;

public class ArrayQuestion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println("출력: ");
        for (int i  = 0; i < 5; i++) {
            System.out.print(array[i]);
            if(i < array.length-1 ){
                System.out.print(", ");
            }


        }
    }
}
