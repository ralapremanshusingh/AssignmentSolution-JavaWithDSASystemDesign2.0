import java.util.Scanner;

public class RalaDeleteAllConsonat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        String str2="";
        
        for(int i=0; i<str.length(); i++)
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'o' || str.charAt(i) == 'U' || str.charAt(i) == 'u' )
            str2+=str.charAt(i);

        System.out.println(str2);

    }
}
