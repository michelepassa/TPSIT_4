/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfat;

public class fattoriale extends Thread {
    private int numero;
    public fattoriale(int n){
        this.numero=n;
    }
    public void run(){
        int fatt=1;
        int app=this.numero;
        while(this.numero!=1){
            fatt=fatt*this.numero;
            this.numero--;
            
        }
        
        System.out.println(app+"!= " +fatt);
    }
    
}

