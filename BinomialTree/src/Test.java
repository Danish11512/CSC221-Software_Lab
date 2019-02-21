// Created By Danish Faruqi
//CSC 22100 - R

import java.util.Scanner;

public class Test {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        // Take in input
        System.out.println("Enter the Probability");
        int P = input.nextInt();

        System.out.println("Enter the Depth of Tree");
        int T = input.nextInt();

        System.out.println("Enter the Amount of Iterations");
        int N = input.nextInt();



        // Create a node
        Node Starter =  BinomialTreeFactory.create(T, P);

        // Run navigator on it
        Navigator one = new Navigator();
        one.Navigate(Starter, N);











    }
}
