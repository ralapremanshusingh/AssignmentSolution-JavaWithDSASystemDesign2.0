/*
 * 
 * Use a private keyword for a variable and use setter and getter methods to initialise and print the values.
 * 
 */
public class GetterSetter {
   private static int i;

    public static void setter(int a) {
     i=a;
    }

    public static int getter() {
        return i;
    }

    public static void main(String[] args) {
        GetterSetter.setter(20);
        System.out.println("The Value is " + GetterSetter.getter());

    }
}
