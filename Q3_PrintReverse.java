import java.util.Scanner;

public class Q3_PrintReverse {

    public static void main(String[] args) {
        //Q3
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str2 = input.nextLine();
        System.out.print("In reverse order: ");
        for(int i=str2.length()-1; i>=0; i--){
            System.out.print(str2.charAt(i));
        }
    }
}
