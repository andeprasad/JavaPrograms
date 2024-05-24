
public class FIndWordFromString {
    public static void main(String[] args) {
        String str = "I am Prasad from Surat, Gujarat.";
        String find = "am";
        
        String[] search = str.split(" ");
        int found = 0;
        for(String s : search)
        {
            if(s.equals(find))
            {
                found = 1;
                break;
            }
            else
            {
                found = 0;
            }
        }
        if (found == 1) 
        {
            System.out.println("\nYes '" + find + "' is present in that Sentence");
        }
        else
        {
            System.out.println("\nNo '" + find + "' is Not present in that Sentence");
        }
    }
}
