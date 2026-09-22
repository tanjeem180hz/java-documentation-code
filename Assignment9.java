// switch assignment: call center
// if user select option 1 then set language bengali
// if user select option 2 then set language hindi
// if user select option 3 then set language urdu
// for any other option set language english
// public class Assignment9 {
//   public static void main(String[] args) {
//     // get the OPTION from user
//     // use switch, case, break and default

//     // Selected language is Bengali
//     // Selected language is Hindi
//     // Selected language is Urdu
//     // Selected language is English
//   }
// }
package com.mycompany.assignment;
import java.util.Scanner;
public class Assignment{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Option: ");
        int option = input.nextInt();
        switch(option){
            case 1: 
                System.out.println("Selcted language is Bengali");
                break;
            case 2:
                System.out.println("Selcted language is Hindi");
                break;
            case 3: 
                System.out.println("Selcted language is Urdu");
                break;
            default:
                System.out.println("Selcted language is English");
        }
    }
}
