import java.awt.POLYGON;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class problema2_temacurs3 {
    public static void main(String[] args) {
        
        POLYGON poligon_triunghi=new POLYGON();
        poligon_triunghi.addPoint(1,15);
        poligon_triunghi.addPoint(-12,-15);
        poligon_triunghi.addPoint(12,-15);
        int[] x_patrulater = {1,2,4,7};
        int[] y_patrulater = {4,7,9,12};
        POLYGON poligon_patrulater=new POLYGON( x_patrulater, y_patrulater, 4);
        int[] x_pentagon = {2,5,12,15,20};
        int[] y_pentagon = {8,12,-7,10,3};
        POLYGON poligon_pentagon=new POLYGON( x_pentagon, y_pentagon, 5);
        System.out.println(poligon_triunghi.contains(5,5,7,7));
        System.out.println(poligon_triunghi.contains(1,2));
        Point p=new Point(3,12);
        System.out.println(poligon_patrulater.contains(p));
        Point2D.Double p2D=new Point2D.Double(4.3,15.5);
        System.out.println(poligon_patrulater.contains(p2D));
        Rectangle2D.Double r2D=new Rectangle2D.Double(3,5,4,3);
        System.out.println(poligon_patrulater.contains(r2D));
        System.out.println(poligon_patrulater.getBounds());
        System.out.println(poligon_patrulater.getBounds2D());
        System.out.println(poligon_triunghi.intersects(4,5,6,7));
        System.out.println(poligon_triunghi.intersects(r2D));
        System.out.println(poligon_pentagon.getBounds());
        poligon_pentagon.translate(3,4);
        System.out.println(poligon_pentagon.getBounds());
    }
}