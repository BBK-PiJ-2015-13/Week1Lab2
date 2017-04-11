import java.lang.reflect.Field;
import java.util.Scanner;

/**
 * Created by Tom on 11/04/2017.
 */
public class StringMaker {
    private Object myObject;

    public StringMaker() throws IllegalAccessException, InstantiationException {
    }
    public StringMaker(Object y) throws IllegalAccessException, InstantiationException {
        myObject = y;
    }

    /*public static void main(String[] args) throws IllegalAccessException, InstantiationException {

    }*/
@Override
    public String toString() {
    Class p = myObject.getClass();
        String returnString = "";
        Field[] a = p.getDeclaredFields();
        for (int i = 0; i<a.length; i++) {
            returnString += a[i].getName();
            returnString += a[i].getType();
        }
        return returnString;
    }
    }

