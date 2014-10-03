/*
 * Main.java
 *
 * Created on 16 March 2004, 14:20
 */

package HelloWorld;

/**
 *
 * @author  Mad_Fool
 */
public class Main
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Greeter worldGreeter = new Greeter();
        System.out.println(worldGreeter.sayHello());
    }
    
}
