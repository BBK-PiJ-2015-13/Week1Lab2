import java.util.Scanner;

/**
 * Created by Tom on 07/03/2017.
 */
public class InterfaceReader {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        System.out.println(java.lang.Class.forName(x));
    }

   // static
}
