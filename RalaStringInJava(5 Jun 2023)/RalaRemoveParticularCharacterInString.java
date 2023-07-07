public class RalaRemoveParticularCharacterInString {
    public static void main(String[] args) {
        String str= "Rohit Singh";

        System.out.println("Original String : " + str);

        // Remove index 7
        int i =8;
        str=str.substring(0, i) + str.substring(i+1);

        System.out.println("After Remove index " + i + " : " + str);
    }
}
