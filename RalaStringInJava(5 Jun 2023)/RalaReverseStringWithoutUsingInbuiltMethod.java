public class RalaReverseStringWithoutUsingInbuiltMethod {
    public static void main(String[] args) {
        String str1="Rohit Singh";
        String str2="";

        for(int j=str1.length()-1; j>=0; j--)
            str2+=str1.charAt(j);

        System.out.println(str2);        
    }
}
