package a1;

import java.util.Scanner;  // Import the Scanner class

public class A1Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        //Some notes and hints for Task 2:
        /* Declare and create two objects of type Summer and for
         the parameter to the constructor use 30...  meaning each
         Summer object can deal with up to 30 ints sent to it */
        /*Your code here */
        Summer evenobj= new Summer(30);
        Summer oddobj=new Summer(30);
        /* Now get a single integer from the scanner
         lets refer to that int as N
         we will use N as an upper limit in a for loop */

        /*Your code here */
        int N=input.nextInt();
        for(int i=0; i<N;i++){
            int num=input.nextInt();
            if ( num % 2 == 0 ) {
                evenobj.add(num);
            }
            else{
                oddobj.add(num);
        }
    }
    // Now loop N times.
        /* In each loop iteration do these things:
           -- get an integer from the input scanner
           -- decide if that int is even or odd
           -- if its even , send it to the even Summer obj
              by calling the "add" method
           -- if that int is odd, send it to the odd Summer obj
              by calling its "add" method
         The loop ends when all N integers have been obtained from input */

    // That loop has now "loaded" each of the two Summer objects
    // with data from input
    // one Summer obj is full of even ints
    // the other Summer obj is full of odd ints

    /*Your code here */

        /* Now do the requested output as shown in the samples
         and we are done.  Hint:  This is easier with the printStats method. */

    /*Your code here */
        printStats(evenobj,oddobj);
}


    static void printStats (Summer evenSummer, Summer oddSummer) {
        //This is a helper method you can use for Task 2.
      /*Hint: Pay careful attention to whether or not your
      inserted code prints output on the same line or a new line. */


        System.out.print("Number of evens: ");
        System.out.print(evenSummer.count());
        System.out.println();

        System.out.print("Sum of evens: ");
        System.out.print(evenSummer.sum());
        System.out.println();

        System.out.print("Average of evens: ");
        System.out.print(evenSummer.average());
        System.out.println();

        System.out.print("Largest even: ");
        System.out.print(evenSummer.high());
        System.out.println();

        System.out.print("Smallest even: ");
        System.out.print(evenSummer.low());
        System.out.println();

        System.out.print("Average of evens over 10: ");
        System.out.print(evenSummer.avgOver(10));
        System.out.println();

        System.out.print("Number of odds: ");
        System.out.print(oddSummer.count());
        System.out.println();

        System.out.print("Sum of odds: ");
        System.out.print(oddSummer.sum());
        System.out.println();

        System.out.print("Average of odds: ");
        System.out.print(oddSummer.average());
        System.out.println();

        System.out.print("Largest odd: ");
        System.out.print(oddSummer.high());
        System.out.println();

        System.out.print("Smallest odd: ");
        System.out.print(oddSummer.low());
        System.out.println();

        System.out.print("Average of odds over 10: ");
        System.out.print(oddSummer.avgOver(10));
        System.out.println();
    }


    // Hint: For task 2, you may wish to write a static method "even" here that
    // would return a 10boolean when sent an int n.
    // Do that if you like, or put your even test inline in main.

}