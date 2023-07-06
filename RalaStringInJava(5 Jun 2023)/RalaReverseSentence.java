public class RalaReverseSentence {
    public static void main(String args[]) {
        String str= "Think Twice";
        String[] arrstr = str.split(" ");
        String revstr="";
        
        for(String vstr: arrstr) {
            for(int i=vstr.length()-1; i>=0; i--)
                revstr+=vstr.charAt(i);
            revstr=revstr+" ";
        }
        System.out.println(revstr);

    }
}