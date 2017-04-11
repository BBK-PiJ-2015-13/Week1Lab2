/**
 * Created by Tom on 11/04/2017.
 */
public class StringRunner {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        BClass a = new BClass("hello");
        StringMaker v = new StringMaker(a);
        System.out.println(v.toString());
    }
}
