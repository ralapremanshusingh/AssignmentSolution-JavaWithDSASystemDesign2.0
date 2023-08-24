/*
 * 
 * Write a program which has static block and constructor overloading, initialise variables using constructors and print it.
 * 
 */
public class ConsOver {

    static int i;
    
    static {
        System.out.println("This is static block.");
    }

    public ConsOver() {
        System.out.println("This is no parameters constructor.");
    }

    public ConsOver(int a) {
        this();
        i=a;
    }

    public static void main(String[] args) {
        ConsOver consOver = new ConsOver(30);

        System.out.println("This is Value : " + ConsOver.i);
    }
}
