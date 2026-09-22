import java.lang.reflect.*;


public class Reflective {

    public static void main(String[] args) {

        SimpleClass simpleClass = new SimpleClass();

        Class<?> c = simpleClass.getClass();
        System.out.println(c.getName());
        System.out.println("------------\n");

        Method[] m = c.getDeclaredMethods();
        System.out.println("  Methods:");
        System.out.println("  ------------");

        for (int i = 0; i < m.length; i++) {
            System.out.println("  " + m[i]);
        }

        System.out.println();
        
        Field[] f = c.getDeclaredFields();
        System.out.println("  Fields:");
        System.out.println("  ------------");
        for (int i = 0; i < f.length; i++)
            System.out.println("  " +  f[i]);
        }

}