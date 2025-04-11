import java.util.Random;
import java.util.Scanner;
public class Ehtemal {
    public static void main(String[]args){
        Random rand=new Random();
        int head=0;
        int tail=0;
        for(int i=0;i<10000;i++){
            int number = rand.nextInt( 10);
            if (number<5){
                head = head+1;
            }
            else{
                tail= tail+1;
            }

        }
        System.out.println(head);
        System.out.println(tail);
    }
}
