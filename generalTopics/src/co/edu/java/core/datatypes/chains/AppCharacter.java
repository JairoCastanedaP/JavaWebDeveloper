package co.edu.java.core.datatypes.chains;

public class AppCharacter {

    public static void main(String[] args) {

        char c='F';
        Character c1='M';

        System.out.println(c);
        System.out.println(c1);


        System.out.println(Character.isDigit('x'));
        System.out.println(Character.isDigit('8'));

        System.out.println(Character.isLetter('x'));
        System.out.println(Character.isLetter('8'));

        System.out.println(Character.isLetterOrDigit('x'));

        System.out.println(Character.isSpace(' ')); // Deprecated API

        System.out.println(Character.isSpaceChar(' '));


    }

}