import java.util.Random;

public class Example08A{
    public static void main(String[] args){
        
        Random rand = new Random();
        int lim = 100;
        int A = rand.nextInt(lim);

        double sum;

        System.out.println("A " + A);

        sum = A/0;

        System.out.println(sum);

    }
}