
package corsa;

/**
 * Giudice è la classe che determina il vincitore
 * @author Andrea Vallorani
 */
public class Giudice extends Thread{
    String v[]=new String[10];
    public int i;
    private Pista pista;
    private String vincitore = "";
    
    public Giudice(Pista p){
        this.pista = p;
    }
    
    public void run(){
        this.pista.posto1.setText("");
        this.pista.posto2.setText("");
        this.pista.posto3.setText("");
        Atleta a1 = new Atleta("Cavallo1",this.pista.icoAtleta1,this);                                       
        Atleta a2 = new Atleta("Cavallo2",this.pista.icoAtleta2,this);
        Atleta a3 = new Atleta("Cavallo3",this.pista.icoAtleta3,this);
        Atleta a4 = new Atleta("Cavallo4",this.pista.icoAtleta4,this);
        Atleta a5 = new Atleta("Cavallo5",this.pista.icoAtleta5,this);
        Atleta a6 = new Atleta("Cavallo6",this.pista.icoAtleta6,this);                                       
        Atleta a7 = new Atleta("Cavallo7",this.pista.icoAtleta7,this);
        Atleta a8 = new Atleta("Cavallo8",this.pista.icoAtleta8,this);
        Atleta a9 = new Atleta("Cavallo9",this.pista.icoAtleta0,this);
        Atleta a10 = new Atleta("Cavallo10",this.pista.icoAtleta10,this);
        
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
        a6.start();
        a7.start();
        a8.start();
        a9.start();
        a10.start();
       
        this.pista.statoGara.setText("Gara iniziata");
        try{
            a1.join();
            a2.join();
            a3.join();
            a4.join();
            a5.join();
            a6.join();
            a7.join();
            a8.join();
            a9.join();
            a10.join();
            
        }
        catch(Exception e){
            
        }
        this.pista.statoGara.setText("Gara conclusa, ha vinto "+this.getVincitore());
        Classifica();
    }
    
    synchronized public void hoFinito(String nomeAtleta){
        if(this.vincitore==""){
            this.vincitore = nomeAtleta;
            v[i]=nomeAtleta;
            i++;
        }
        else{
            v[i]=nomeAtleta;
            i++;
        }
    }
    
    public String getVincitore(){
        return this.vincitore;
    }
    public void Classifica(){
        this.pista.posto1.setText(""+v[0]);
        this.pista.posto2.setText(""+v[1]);
        this.pista.posto3.setText(""+v[2]);
    }
}
