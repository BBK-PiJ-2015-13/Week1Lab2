import java.util.Scanner;

/**
 * Created by Tom on 09/04/2017.
 */
public class MyReader {
    public void readInterface(Class z) throws ClassNotFoundException {
        //Scanner scanner = new Scanner(System.in);
        //String x = scanner.next();
        //java.lang.Class.forName(x.getName());
        //System.out.println(java.lang.Class.forName);
        MyReader y = new MyReader();
        //y.readInterface("AClass");
        Scanner scanner = new Scanner(System.in);
        //String z = scanner.next();

        System.out.println(z.getInterfaces());
    }
}
