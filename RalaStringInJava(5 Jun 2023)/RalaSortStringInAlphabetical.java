import java.util.Arrays;

public class RalaSortStringInAlphabetical {
    
    public static void main(String[] args) {
        String str="welcome";
        System.out.println(str);
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        System.out.println(String.valueOf(ch));
    }
}