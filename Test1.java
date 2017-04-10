/**
 * Created by Tom on 10/04/2017.
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test1 {
    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        BClass tester = new BClass("df"); // MyClass is tested
        Class<?> x = tester.getClass();
        Field[] y = x.getDeclaredFields();
        Method[] m = x.getDeclaredMethods();
        Constructor[] v = x.getDeclaredConstructors();
        int num = 0;
        for (int i = 0; i<m.length; i++) {
            if (m[i].getExceptionTypes().length > 0) {
                assert(false);
            }
            if (m[i].getReturnType().equals(num)) {

            }
        }
        for (int i=0;i<v.length; i++) {
            if (v[i].getParameterCount() < 1) {
                assert(false);
            }
        }
        ArrayList<?> t = new ArrayList<>();
        for (int i = 0; i<y.length; i++) {
            if (y[i].getType().equals(t.getClass())) {
                assert(false);
            }
        }
        Method[] z = x.getDeclaredMethods();
        for (int i = 0; i<z.length; i++) {

        }

        // assert statements
       assert(x.getDeclaredFields().length < 5);
        assert(x.getFields().length < 1);

          }
}

