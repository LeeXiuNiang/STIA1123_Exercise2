import java.util.Scanner;

public class Q2_CountA {

    public static void main(String[] args) {
        //Q2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        int count=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='A'||str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("number of character 'A' found: "+ count);

    }
}
