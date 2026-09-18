// /*
//  * Digit spelling program using if,else if, else
//  * step 1: ask for a digit between 0-9
//  * step 2: check the digit and print it by spelling. example if user input is 0 then print Zero
//  * step 3: if the digit is not among 0-9 then print Invalid digit
//  */
// public class Assignment6 {
//   public static void main(String[] args) {
    
//   }
// }

package main.product;
import java.util.Scanner;

public class assignment6 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Digit 0 to 9 : ");
        int digit = input.nextInt();
        if(digit == 0)
            System.out.println("Zero");
        else if(digit == 1)
            System.out.println("One");
        else if(digit == 2)
            System.out.println("Two");
        else if(digit == 3)
            System.out.println("Three");
        else if(digit == 4)
            System.out.println("Four");
        else if(digit == 5)
            System.out.println("Five");
        else if(digit == 6)
            System.out.println("Six");
        else if(digit == 7)
            System.out.println("Seven");
        else if(digit == 8)
            System.out.println("Eight");
        else if(digit == 9)
            System.out.println("Nine");
        else
            System.out.println("Invalid Digit");
    }
    
}
