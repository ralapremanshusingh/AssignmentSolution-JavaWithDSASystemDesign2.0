public class RalaFindIndexOfSubString {
    public static void main(String[] args) {
        String str="Rohit Singh";
        int index=str.indexOf("Singh");

        if(index==-1)
            System.out.println("Not Found");
        else
            System.out.println("Your Index is " + index);

    }
}
