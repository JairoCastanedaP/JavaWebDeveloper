package co.edu.java.core.datatypes.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate; // Modern API
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date; // Legacy API

public class AppDate {

    public static void main(String[] args) {

        Date d= new Date();

        System.out.println(d);

        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yy");
        System.out.println(sdf.format(d));

        sdf= new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(d));

        sdf= new SimpleDateFormat("hh:mm:ss");
        System.out.println(sdf.format(d));

        sdf= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        System.out.println(sdf.format(d));

        java.sql.Date d1= new java.sql.Date(d.getTime());

        System.out.println(d.getTime());

        System.out.println(d1);

        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().plusDays(2));

        java.sql.Date sqlDate= new java.sql.Date(10000L); // Database
        System.out.println("sqlDate = " + sqlDate);

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now().minusHours(2));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(formatter.format(LocalDateTime.now()));
    }
}
