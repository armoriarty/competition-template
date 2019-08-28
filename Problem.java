import java.io.*;
import java.util.*;

public class Problem {

    private static Scanner in;
    private static PrintWriter out;

    public static void main(String[] args) throws Exception {
        /*
        in = new Scanner(new File ("input.in"));
        out = new PrintWriter("output.out");
         */

        in = new Scanner(System.in);
        out = new PrintWriter(System.out);

        String line = in.nextLine();
        out.println("You typed \"" + line + "\".");

        in.close();
        out.close();
    }
}
