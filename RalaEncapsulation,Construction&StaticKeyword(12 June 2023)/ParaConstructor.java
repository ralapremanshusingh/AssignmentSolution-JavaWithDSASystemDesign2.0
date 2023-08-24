/*
 * 
 * Write a program and create a constructor with parameters and initialise the variable using a constructor.
 * 
 */
public class ParaConstructor {

    static private int i;

    public ParaConstructor(int i) {
       this.i=i;
    }

    public static int init() {
        return i;
    }
    public static void main(String[] args) {

        ParaConstructor paraConstructor = new ParaConstructor(20);

        System.out.println("The value is "+ ParaConstructor.init());
    }
}
