public class SwapCharacterUpperToLowwerAndViceVersaInAnString {
    public static void main(String[] args) {
        String str1="Rohit Singh SoNu SiNgH";

        char[] chrStr = new char[str1.length()];
        chrStr = str1.toCharArray();

        for(int i=0; i<chrStr.length; i++)
            if(chrStr[i]>='a' && chrStr[i]<='z')
                chrStr[i]-=32;
            else if(chrStr[i]>='A' && chrStr[i]<='Z')
                chrStr[i]+=32;
        System.out.println();
        for(int i=0; i<chrStr.length; i++)
            System.out.print(chrStr[i]);
        System.out.println("\n");
    }
}
