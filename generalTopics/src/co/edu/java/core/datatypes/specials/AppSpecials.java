package co.edu.java.core.datatypes.specials;

import java.math.BigDecimal;
import java.math.BigInteger;

public class AppSpecials {

    public static void main(String[] args) {

        boolean primitiveBoolean = false;
        Boolean wrappedBoolean = true;
        //Boolean primitiveBoolean2 = new Boolean(true);

        System.out.println(primitiveBoolean);
        System.out.println(!wrappedBoolean);// Logical negation
        //System.out.println(primitiveBoolean2);

        BigInteger be = new BigInteger("4554785222112");
        System.out.println(be);
        System.out.println(be.floatValue());

        BigDecimal bd = new BigDecimal("4554785222112.145552522");
        System.out.println(bd);
        System.out.println(bd.multiply(new BigDecimal(2)));

        int quantity= 634_787_427;
        int secondQuantity= 634_787_427;

        System.out.println(quantity);
        System.out.println(secondQuantity);

    }

}
