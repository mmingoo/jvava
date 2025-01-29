package service.java.array;

import java.util.Scanner;

public class ArrayQuestion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int size = scanner.nextInt();
        int [] numbers = new int [size];
        int minNum, maxNum = 0;


        System.out.println(size+"개의 정수를 입력하세요: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        minNum = maxNum = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if(minNum > numbers[i]){
                minNum = numbers[i];
            }

            if (maxNum < numbers[i]) {
                maxNum = numbers[i];
            }

        }

        System.out.println("가장 작은 값:"+minNum);
        System.out.println("가장 큰 값:"+maxNum);

        }
    }
