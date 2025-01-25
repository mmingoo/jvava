package service.java.array;
// 2차원 배열
public class Array4 {
    public static void main(String[] args) {
        //2x3 차원 배열
        int [][] arr;
        arr = new int[2][3];

        arr[0][0] = 3;
        arr[0][1] = 6;
        arr[0][2] = 1;
        arr[1][0] = 3;
        arr[1][1] = 8;
        arr[1][2] = 5;


        for(int row = 0; row < 2; row++){
            for(int column = 0; column < 3; column++){
                System.out.print(arr[row][column] + " ");
            }
        }
    }
}
