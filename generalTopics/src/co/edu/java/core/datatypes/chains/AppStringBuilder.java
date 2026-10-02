package co.edu.java.core.datatypes.chains;

public class AppStringBuilder {

    public static void main(String[] args) {

        // Mutable and not synchronized; faster than StringBuffer.

        StringBuilder s= new StringBuilder("Java "); // Created with a string literal

        System.out.println(s);

        System.out.println(s.append("11"));

        System.out.println(s.insert(5," Web "));

        System.out.println(s.replace(5, 9, " Mobile "));

        System.out.println(s.delete(5, 12));

        System.out.println(s.reverse());

        System.out.println(s);
    }
}
