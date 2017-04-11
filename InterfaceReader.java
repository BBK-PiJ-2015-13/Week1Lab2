import java.util.Scanner;

/**
 * Created by Tom on 07/03/2017.
 */
public class InterfaceReader {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //MyReader y = new MyReader();
        //y.readInterface("AClass");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        Class [] f = java.lang.Class.forName(x).getInterfaces();
        for (int i = 0; i<f.length; i++) {
            System.out.println(f[i]);
        }
        //f.toString();
        BClass a = new BClass("hello");
        StringMaker v = new StringMaker(a);
        v.toString();
    }

   // static
}
