/*
 * Assignment-3 (User Input)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: get user input for each variables
* step 5: print the variables
 */
package com.mycompany.product;
import java.util.Scanner;
public class Product{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID : ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Title : ");
        String title = input.nextLine();
        System.out.print("Enter Price : ");
        String price = input.nextLine();
        System.out.print("Enter Description : ");
        String description = input.nextLine();
        System.out.print("Enter Category : ");
        String category = input.nextLine();
        System.out.println("ID\t\t: "+id);
        System.out.println("Title\t\t:"+title);
        System.out.println("Price\t\t:"+price);
        System.out.println("Description\t:"+description);
        System.out.println("Category\t:"+category);
    }
}
