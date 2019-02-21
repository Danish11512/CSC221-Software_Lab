// Created By Danish Faruqi
//CSC 22100 - R

import java.security.SecureRandom;

public class Navigator {

    Navigator()
    {

    }


    SecureRandom number = new SecureRandom();
    int thenumber = number.nextInt(101);

    private int Time_Period = 1;


    public void Navigate(Node Tree, int N_Iterations){
         int IterationPrint = 1;
        while(N_Iterations > 0)
        {
            System.out.println("\n"+ "Iteration " + (IterationPrint++));
            System.out.println("-----------------" + "\n");
            System.out.println("Time Period: 0 \nProbability = " + Tree.getProbablity() + "\nBegin Comparing\n");
            GoThrough(Tree, Tree.getProbablity());
            Time_Period = 1;
            N_Iterations--;

        }

        // maybe print no iteration left ?


    }


     private void GoThrough(Node Tree, int P){
        if(Tree == null)
        {
            return;
        }

        SecureRandom number = new SecureRandom();
        int thenumber = number.nextInt(101);

        if(thenumber <= P) // goes up
        {
            //Print Time Period



            GoThrough(Tree.Up, P);
            System.out.println("Time Period: " + Time_Period++);
            System.out.println("Random Number Value : " + thenumber + "  --> Up Direction");
        }else{

            GoThrough(Tree.Down, P);
            System.out.println("Time Period: " + Time_Period++);
            System.out.println("Random Number Value : " + thenumber + "  --> Down Direction");
        }
    }



    //recursively go throught the tree N times, and in each iteration use the rand number, to navigate until you the end of the branch




}
