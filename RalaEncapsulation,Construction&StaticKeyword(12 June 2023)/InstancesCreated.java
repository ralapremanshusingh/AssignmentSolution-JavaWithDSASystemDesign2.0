/*
 * 
 * Create a class that keeps track of the number of instances created. Implemented a static variable and method to accomplish this.
 * 
 */
public class InstancesCreated {

    static private int i;

    public InstancesCreated() {
        i++;
    }

    public static int time() {
        return i;
    }


    public static void main(String[] args) {

        InstancesCreated instancesCreated1 = new InstancesCreated();
        InstancesCreated instancesCreated2 = new InstancesCreated();
        InstancesCreated instancesCreated3 = new InstancesCreated();
        InstancesCreated instancesCreated4 = new InstancesCreated();

        System.out.println("The number of instances created is " + InstancesCreated.time());

        
    }
}
