import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/**
 * Created by Tom on 10/04/2017.
 */
public class Creator {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        Constructor<?>[] f = java.lang.Class.forName(x).getConstructors();
        Class<?> r = java.lang.Class.forName(x);
        Object a = r.getConstructor().newInstance();
        //Object r = java.lang.Class.forName(x).newInstance(r...f[0]);
        //java.lang.reflect.Constructor.newInstance();
        //r.newInstance(f[0]);
        //Object<> Y = new java.lang.Class.forName(x)f[0]);
        for (int i = 0; i<f.length; i++) {
            System.out.println(f[i]);
        }
    }
}
