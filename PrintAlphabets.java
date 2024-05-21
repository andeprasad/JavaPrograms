public class PrintAlphabets {
    public static void main(String[] args) {

        char A = 'A';
        char Z = 'Z';
        System.out.println("\nCapital Letters");
        for(char c=A;c<=Z;c++)
        {
            System.out.print(c);
        }

        char a = 'a';
        char z = 'z';
        System.out.println("\n\nSmall Letters");
        for(char c=a;c<=z;c++)
        {
            System.out.print(c);
        }
    }
}
