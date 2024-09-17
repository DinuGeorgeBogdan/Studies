import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interfata extends Remote {
    int combinari(int n, int k) throws RemoteException;
    String getServerTime() throws RemoteException;
}
