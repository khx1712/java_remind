package chapter10.classTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String [] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c1 = String.class;

        String str = new String();
        Class c2 = str.getClass();

        Class c3 = Class.forName("java.lang.String");

        Constructor[] constructors = c3.getConstructors();

        for(Constructor constructor:constructors){
            System.out.println(constructor);
        }
        System.out.println("-------------");
        Method[] methods = c3.getMethods();

        for(Method method : methods){
            System.out.println(method);
        }

        Class c4 = Class.forName("chapter10.classTest.Person");

        Person person = (Person)c4.newInstance();


    }
}
