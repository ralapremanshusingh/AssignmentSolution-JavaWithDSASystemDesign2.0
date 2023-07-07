public class RalaStringIsPalidrome {
    public static void main(String[] args) {
        String str1="4145414";
        String str2="";

        for(int j=str1.length()-1; j>=0; j--)
            str2+=str1.charAt(j);
        System.out.println(str1);
        System.out.println("Is Palidrome : " + str1.equals(str2));
    }
    
}
