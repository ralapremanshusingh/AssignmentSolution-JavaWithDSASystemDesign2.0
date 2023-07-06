import java.util.Scanner;

public class RalaTakeStringInputFromUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String str=sc.nextLine();
        System.out.print("Your name is : " + str);
        sc.close();
    }
}
