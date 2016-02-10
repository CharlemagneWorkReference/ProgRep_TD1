import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServiceDistribution extends Remote{
    int donnerTicket() throws RemoteException;
}
