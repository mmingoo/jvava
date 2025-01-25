package service.java.array;

public class Array3 {
    public static void main(String[] args) {
        // 선언방법 1
        int [] students;
        students = new int []{90,69,22,34,89};

        // 선언방법 2
        int[] students2 = new int []{90,69,22,34,89};

        //선언방법 3
        int[] students3 = {90,69,22,34,89};

        //선언방법3의 주의사항, 다음처럼은 안된다
        int[] students4;
        // 다음 코드는 이 배열의 타입을 추론할 수 없기 때문이다.
//        students4 = {90,69,22,34,89};

        // 변수 값 사용
        for(int i =0; i< students.length; i++){
            System.out.println("학생"+(i+1)+"의 점수 :" + students[i]);
        }
    }
}
