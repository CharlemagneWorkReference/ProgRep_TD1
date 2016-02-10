import java.rmi.RemoteException;

public class Distributer implements ServiceDistribution{
    private int compteur;

    public Distributer(){
        this.compteur = 0;
    }

    public int donnerTicket() throws RemoteException{
        this.compteur ++;
        System.out.println("Numéro courant : " + this.compteur);
        return this.compteur;
    }
}
