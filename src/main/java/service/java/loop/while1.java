package service.java.loop;

public class while1 {
    public static void main(String[] args) {
        int count = 0;

        while (true){

            count += 1;
            if (count<10){
                System.out.println("cont:"+ count);
                break;
            }
        }
    }
}
