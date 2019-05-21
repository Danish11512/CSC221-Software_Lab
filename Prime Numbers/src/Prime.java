// Danish Faruqi - CSC 221 R
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;


public class Prime {
    public static void main(String args[]) {
        int input;
        Set<Integer> list = new HashSet<>();

        // take while loop as input so it runs forever - give warning on how to stop before loop
            Scanner Scanner = new Scanner(System.in);

            try {
                System.out.print("Enter a number :  ");
                input = Scanner.nextInt();

//
                if (input > 1) {


                    for (int i = 2; i <= input; i++) {
                        while (input % i == 0) {
                            list.add(i);
                            input = input / i;
                        }
                    }
                    if (list.size() == 1) {
                        list.add(1);
                    }

                    for (int i : list) {
                        System.out.print(i + " ");

                    }

                }else if(input < 0){
                    throw new InputMismatchException();
                }

                else {
                    throw new InputMismatchException();
                }
            }
            catch (InputMismatchException e) {
                // look out for negetives, decimals, strings, char,
                System.out.println("Input is invalid ");
            }








    }
    }