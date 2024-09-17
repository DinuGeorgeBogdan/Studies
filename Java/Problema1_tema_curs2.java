package materiipreferate;
import java.util.Scanner;

public class MateriiPreferate {
    
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Numele=");
String nume=sc.nextLine();
System.out.print("Clasa=");
int clasa=sc.nextInt();
sc.close();
String materie_preferata, materie_nepreferata;
int nota_materie_preferata, nota_materie_nepreferata;
switch(clasa)
{
    case 1:
        materie_preferata="preferat1";
        materie_nepreferata="nepreferat1";
        nota_materie_preferata=10;
        nota_materie_nepreferata=10;
        break;
    case 2:
        materie_preferata="preferat2";
        materie_nepreferata="nepreferat2";
        nota_materie_preferata=10;
        nota_materie_nepreferata=10;
        break;
    case 3:
        materie_preferata="preferat3";
        materie_nepreferata="nepreferat3";
        nota_materie_preferata=10;
        nota_materie_nepreferata=10;
        break;
    case 4:
        materie_preferata="preferat4";
        materie_nepreferata="nepreferat4";
        nota_materie_preferata=10;
        nota_materie_nepreferata=10;
        break;
    case 5:
        materie_preferata="preferat5";
        materie_nepreferata="nepreferat5";
        nota_materie_preferata=8;
        nota_materie_nepreferata=7;
        break;
    case 6:
        materie_preferata="preferat6";
        materie_nepreferata="nepreferat6";
        nota_materie_preferata=9;
        nota_materie_nepreferata=8;
        break;
    case 7:
        materie_preferata="preferat7";
        materie_nepreferata="nepreferat7";
        nota_materie_preferata=10;
        nota_materie_nepreferata=9;
        break;
    case 8:
        materie_preferata="preferat8";
        materie_nepreferata="nepreferat8";
        nota_materie_preferata=9;
        nota_materie_nepreferata=7;
        break;
    case 9:
        materie_preferata="preferat9";
        materie_nepreferata="nepreferat9";
        nota_materie_preferata=7;
        nota_materie_nepreferata=5;
        break;
    case 10:
        materie_preferata="preferat10";
        materie_nepreferata="nepreferat10";
        nota_materie_preferata=9;
        nota_materie_nepreferata=7;
        break;
    case 11:
        materie_preferata="preferat11";
        materie_nepreferata="nepreferat11";
        nota_materie_preferata=8;
        nota_materie_nepreferata=6;
        break;
    case 12:
        materie_preferata="preferat12";
        materie_nepreferata="nepreferat12";
        nota_materie_preferata=8;
        nota_materie_nepreferata=7;
        break;
    default:
        System.out.println("Clasa invalida");
        materie_preferata=null;
        materie_nepreferata=null;
        nota_materie_preferata=0;
        nota_materie_nepreferata=0;
}
System.out.print("In clasa "+clasa+", materia preferata a lui "+nume+" a fost "+materie_preferata+" cu nota "+nota_materie_preferata+", iar materia nepreferata a fost "+materie_nepreferata+", cu nota "+nota_materie_nepreferata+".");
}

}
