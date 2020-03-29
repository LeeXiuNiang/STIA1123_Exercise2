public class Power {

   public static void main(String[] args) {
	 //Q1
        String myFormat="%-8.0f%10.0f%10.0f\n";
        System.out.printf("%-8s%10s%10s\n","Number","Square","Cube");
        double[] number = new double[11];
        double[] square = new double[11];
        double[] cube = new double[11];

        for(int i=0;i<11;i++){
            number[i]=i;
            square[i]=Math.pow(number[i],2);
            cube[i]=Math.pow(number[i],3);
            System.out.printf(myFormat,number[i],square[i],cube[i]);
        }
    }
}
