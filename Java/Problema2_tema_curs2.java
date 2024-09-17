package intersectieintervale;
import java.util.Scanner;
public class IntersectieIntervale {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a=");
        double a=sc.nextDouble();
        System.out.print("b=");
        double b=sc.nextDouble();
        System.out.print("c=");
        double c=sc.nextDouble();
        System.out.print("d=");
        double d=sc.nextDouble();
        sc.close();
        if ( (a>b) || (c>d) )
            System.out.print("["+a+","+b+"] sau ["+c+","+d+"] nu e interval");
        else
            if ( ( (a<=b) && (b<c) && (c<=d) ) || ( (c<=d) && (d<a) && (a<=b) ) )
                System.out.print("Multimea vida");
            else
                if ( (a<=c) && (c<=b) && (b<=d) )
                    System.out.print("["+c+","+b+"]");
                else
                    if ( (c<=a) && (a<=d) && (d<=b) )
                        System.out.print("["+a+","+d+"]");
                    else
                        if ( (a<=c) && (c<=d) && (d<=b) )
                            System.out.print("["+c+","+d+"]");
                        else
                            if ( (c<=a) && (a<=b) && (b<=d) )
                                System.out.print("["+a+","+b+"]");                          
    }
    
}