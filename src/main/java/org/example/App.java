package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int addMe(int a, int b) {return a+b;}
    public static int subtractMe(int a, int b) {return a-b;}

    public static void main( String[] args )
    {
        System.out.println( "Hello World!"+ addMe(2,3) );
    }

}
