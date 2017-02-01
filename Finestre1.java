/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finestre1;

import java.util.Scanner;

/**
 *
 * @author Studente
 */
public class Finestre1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
       
        do{
        System.out.println("Inserire numero finestre:");
        n = input.nextInt();
        } while(n<0);
       
        do{
         Finestra f1;
        f1 = new Finestra();
        f1.setVisible(true);
        n = n-1;
        }while(n!=0);
        // TODO code application logic here
    }
    
}
