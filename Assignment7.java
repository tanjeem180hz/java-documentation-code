package com.mycompany.assignment;
import java.util.Scanner;
public class Assignment{
    public static void main(String[] args){
        System.out.println("Do you love java? ");
        Scanner input = new Scanner(System.in);
        char love = input.next().charAt(0);
        if(love == 'n' || love == 'N'){
                System.out.print("you are not a java lover");
            }
        else if(love == 'Y' || love == 'y'){
                System.out.println("you are a java lover");
            }
        else{
            System.out.println("Don't Know");
        }
    }
}
