/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstproject;

import java.util.Scanner;

/**
 *
 * @author sama
 */
public class MyFirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Input your first name: ");
        String Firstname = input.next();
        System.out.print("Input your last name: ");
        String Lastname = input.next();
        System.out.println();
        System.out.println("Hello \n" + Firstname + " " + Lastname);
    }

}
