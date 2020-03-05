import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomInRange {

    public static void main(String[] args) {
        //Q4
        System.out.println("Enter 2 number: ");
        Scanner input = new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        if(num1>num2){
            System.out.println("0");
        }else {
            int randomInt = ThreadLocalRandom.current().nextInt(num1, num2 + 1);
            System.out.println("Random integer between " + num1 + " and " + num2 + ": " + randomInt);
        }
    }
}
