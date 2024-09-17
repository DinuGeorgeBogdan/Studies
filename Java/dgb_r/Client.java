import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            // Conectare la serverul RMI
            Interfata server = (Interfata) Naming.lookup("rmi://localhost/Interfata");

            // Citirea numarului de la tastatura
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceti un numar natural n: ");
            int n = scanner.nextInt();

            // Calcularea coeficientilor polinomului si calculul sumei acestora
            int suma = 0;
            System.out.println("Coeficientii polinomului (x - y)^" + n + ": ");
            for (int k = 0; k <= n; k++) {
                int coef = server.combinari(n, k) * (int) Math.pow(-1, k);
                System.out.print(coef + " ");
                suma += coef;
            }
            

            // Afisarea timpului curent de pe server si apoi a sumei
            String serverTime = server.getServerTime();
            System.out.println("\nData si ora serverului: " + serverTime+ " ");
            System.out.println("Suma coeficientilor: " + suma);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
