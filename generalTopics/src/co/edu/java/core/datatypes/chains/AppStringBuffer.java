package co.edu.java.core.datatypes.chains;

public class AppStringBuffer {

    public static void main(String[] args) {


        //StringBuffer s1= "Java ";
        // Mutable and synchronized; thread-safe but slower.

        StringBuffer s= new StringBuffer("Java "); // Created with a string literal

        System.out.println(s);

        System.out.println(s.append("26"));

        System.out.println(s.insert(5," Web "));

        System.out.println(s.replace(5, 9, " Mobile "));

        System.out.println(s.delete(5, 12));

        System.out.println(s.reverse());

        System.out.println(s);

    }
}
