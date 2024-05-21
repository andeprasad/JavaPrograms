// import java.util.*;

class ReadCmdLineArgument
{
    public static void main(String[] args) {
        int n = args.length;
        System.out.println("Length of cmdline is " + n);

        System.out.println("Values given in Cmd line\n");
        for(int i = 0;i<n;i++)
        {
            System.out.println(args[i]);
        }
    }
}