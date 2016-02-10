import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;

public class LanceDistributeur {

    public static void main(String[] args){
        Distributer distributer = new Distributer();
        try{
            Registry reg = LocateRegistry.getRegistry();
            ServiceDistribution serviceDistribution = (ServiceDistribution) UnicastRemoteObject.exportObject(distributer,0);
            reg.rebind("Distributer",serviceDistribution);
        }catch (RemoteException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
