package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String name = "world";
        if (args.length > 0){
            name = String.join(" ", args);
        }
 
        System.out.println( "Hello " + name + "!" );
    }
}