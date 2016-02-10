import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by cyprien on 02/02/16.
 */
public class Client {
    public static void main(String[] args){
        try{
            Registry reg = LocateRegistry.getRegistry();
            ServiceDistribution serviceDistribution = (ServiceDistribution)reg.lookup("Distributer");

            boolean malloc = true;

            while (malloc){
                serviceDistribution.donnerTicket();
            }
        }catch (RemoteException e){
            e.printStackTrace();
        }catch (NotBoundException e){
            e.printStackTrace();
        }
    }
}
