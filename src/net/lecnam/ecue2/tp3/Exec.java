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


    }

}
