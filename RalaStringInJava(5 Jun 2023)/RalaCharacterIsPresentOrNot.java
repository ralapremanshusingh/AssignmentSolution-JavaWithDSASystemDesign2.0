public class RalaCharacterIsPresentOrNot {
    public static void main(String[] args) {
        String str = "Umbrella";
        boolean is = false;
        System.out.print("E is present : ");
        for(int i=0; i<str.length(); i++)
            if('e'==str.charAt(i))
                is=true;
            
        System.out.println(is);

    }
}
