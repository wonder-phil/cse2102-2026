import java.lang.reflect.*;


public class ReflectiveInvoke {


    public static void main(String[] args) {

        SimpleClass simpleClass = new SimpleClass();

        Class<?> c = simpleClass.getClass();
        System.out.println(c.getName());

        String methodOfInterest = "addValues";
        int argument1 = 99;
        int argument2 = 101;

        try {

            System.out.println(methodOfInterest + " " + argument1 + " + " + argument2);
        
            Method m_add = c.getDeclaredMethod(methodOfInterest, int.class, int.class);
            Object result = m_add.invoke(simpleClass,argument1,argument2);

            System.out.println((int) result);

        } catch(NoSuchMethodException nsm) {
            nsm.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
       
    }
    

}