import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Server extends UnicastRemoteObject implements Interfata {

    protected Server() throws RemoteException {
        super();
    }

    // Metoda recursiva pentru calculul combinatiilor binomiale: C(n, k) = n! / (k! * (n-k)!)
    @Override
    public int combinari(int n, int k) throws RemoteException {
        if (k == 0 || k == n) {
            return 1;
        }
        return combinari(n - 1, k - 1) + combinari(n - 1, k);
    }

    // Metoda pentru a returna timpul curent al serverului
    @Override
    public String getServerTime() throws RemoteException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }

    public static void main(String[] args) {
        try {
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            Interfata server = new Server();
            java.rmi.Naming.rebind("rmi://localhost/Interfata", server);
            System.out.println("Serverul este pornit si asteapta cereri...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
