import java.lang.reflect.*;
public class ReflectionExample {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("Person");
            Method[] methods = cls.getDeclaredMethods();
            System.out.println("Methods in class " + cls.getName() + ":");
            for (Method method : methods) {
                System.out.print(method.getName() + "(");
                Class<?>[] paramTypes = method.getParameterTypes();
                for (int i = 0; i < paramTypes.length; i++) {
                    System.out.print(paramTypes[i].getSimpleName());
                    if (i < paramTypes.length - 1) System.out.print(", ");
                }
                System.out.println(")");
            }
            Constructor<?> constructor = cls.getConstructor(String.class);
            Object obj = constructor.newInstance("Poojitha");
            Method greetMethod = cls.getMethod("greet");
            greetMethod.invoke(obj);
            Method setNameMethod = cls.getMethod("setName", String.class);
            setNameMethod.invoke(obj, "Bhuma");
            greetMethod.invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}