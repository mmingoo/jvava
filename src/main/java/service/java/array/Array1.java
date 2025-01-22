package service.java.array;

public class Array1 {
    public static void main(String[] args) {
        int [] students; // 배열 변수 선언

        // int 가 5개 담긴 배열 생성
        // students 배열엔 new int[5]의 시작 주솟값, 즉 배열의 참조값을 담겨져 있다
        students = new int[5];
        System.out.println("배열 students의 주솟값 : "+ students);
        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;

        //값 대입
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;

        // 변수 값 사용
        System.out.println("학생1 점수: " + student1);
        System.out.println("학생2 점수: " + student2);
        System.out.println("학생3 점수: " + student3);
        System.out.println("학생4 점수: " + student4);
        System.out.println("학생5 점수: " + student5);



    }
}
