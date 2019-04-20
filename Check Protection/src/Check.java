import java.util.Scanner;

public class Check {
    public static void main(String args[]) {

        // Take in the input
        System.out.println("Enter an amount: ");
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        String snumber = Double.toString(Math.abs(number));

        // Create the stringg builder and prepare it with *s
        StringBuilder check = new StringBuilder("*********");

        if(snumber.length()<=9){
            int checkLength = check.length()-1;
            int snumberLength = snumber.length()-1;

            while(snumberLength >= 0) {
                check.setCharAt(checkLength--, snumber.charAt(snumberLength--));
            }
            System.out.print(check);

        }else{
            System.out.println("The number you have entered is longer than the 9 spaces available for printing");
        }

    }
}
