package service.java.array;

public class Exercise {
    public static void main(String[] args) {
//        int [] students = new int[5];
        int total = 0;

        int [] students = {10,20,30,40,50};

//        for(int i = 0; i < 5; i++){
//            students[i] = 100 - (i+1)*10;
//            total += students[i];
//        }

        for (int student : students) {
            total += student;
        }

        double average =(double) total/5;

        System.out.println("점수 총합: "+ total);
        System.out.println("점수 평균: "+ average);
    }
}
