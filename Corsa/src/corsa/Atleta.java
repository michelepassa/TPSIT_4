
package corsa;

/**
 * Atleta è il thread che partecipa alla gara
 * @author Andrea Vallorani
 */
public class Atleta extends Thread{
    
    private String nome;
    private javax.swing.JLabel label;
    private Giudice giudice;
    
    public Atleta(String n,javax.swing.JLabel l,Giudice g){
        this.nome = n;
        this.label = l;
        this.giudice = g;
    }
    
    public void run(){
        int pos = this.label.getX();
        int n;
        while(pos<900){
            //genero un numero casuale da 0 a 15
            n = (int)(Math.random() * 25);
            //sposto l'atleta in base al numero generato
            pos = this.label.getX()+n;
            this.label.setLocation(pos,this.label.getY());
            //prima di un nuovo spostamento il thread aspetta 100 millisecondi
            try{
               Thread.sleep(100);
            }
            catch(Exception e){
               
            }
        }
        this.giudice.hoFinito(this.nome);
    }
}
