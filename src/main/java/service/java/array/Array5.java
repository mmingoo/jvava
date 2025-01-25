package service.java.array;

//2차원 배열 리팩토링
public class Array5 {
    public static void main(String[] args) {
        //2x3 차원 배열
        int [][] arr  = new int [][]{
                {1,4,3},
                {6,4,2}
        };


        // 인자 지정
        for(int row = 0; row < 2; row++){
            for(int column = 0; column < 3; column++){
                System.out.print(arr[row][column] + " ");
            }
        }

        // 배열 길이에 따른 인자 자동화
        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                System.out.print(arr[row][column] + " ");
            }
        }
    }
}
