package by.it.uskoryaev.jd01_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> mathClass = Math.class;
        Method[] methods = mathClass.getMethods();
        for (Method method:methods) {
            //   if (Modifier.isPublic(method.getModifiers()));
            if ((method.getModifiers()& Modifier.PUBLIC)== Modifier.PUBLIC){
                String res = method.toString().replaceAll("java.lang.Math.","");
                System.out.println(res);
            }
        }
        Field[] fields = mathClass.getFields();
        for (Field field:fields){
            String res = field.toString().replaceAll("java.lang.Math.","");
            System.out.println(res);
        }
    }
}
