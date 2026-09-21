package net.lecnam.ecue2.tp3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exec  {

    public static void main(String[] args) {


        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);

        System.out.println(p1);
        System.out.println(p2);

        Point p = new Point(2, 3);
        p.translate(3,3);
        System.out.println(p);

        System.out.println(p1.equals(p2));

        System.out.println("Distance : " + p1.retourneDistance(p2));

        p1.translate(3, 4);

        System.out.println(p1);
        System.out.println(p1.equals(p2));

        // rectangle avec le constructeur 1
        Point origine = new Point(2, 3);
        Rectangle r1 = new Rectangle(10, 5,origine);

        // rectangle avec le constructeur 2
        Rectangle r2 = new Rectangle(2, 3, 10, 5);

        double surface = r1.RetournSurface(10, 5);

        System.out.println("Surface : " + surface);
        Point p4 = new Point(2,3);
        p4.translate(1,1);
        System.out.println(p4);
    }

}
