package co.edu.java.core.datatypes.chains;

public class PerformanceApp {


    public static void main(String[] args) {

        long startTime;
        long endTime;

        final long ITERATION_COUNT = 100_000; // Iteration count.

        //ITERATION_COUNT = 6_000_000;
        //ITERATION_COUNT=1000;

        String s = new String("");

        startTime = System.currentTimeMillis();

        for (int i = 0; i < ITERATION_COUNT; i++) {
            s.concat("x");
        }
        endTime = System.currentTimeMillis();

        System.out.println("String :"+(endTime - startTime));


        StringBuffer sb = new StringBuffer("");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            sb.append("x");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer :"+(endTime - startTime));


        StringBuilder sbi = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            sbi.append("x");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder :"+(endTime - startTime));


    }
}
