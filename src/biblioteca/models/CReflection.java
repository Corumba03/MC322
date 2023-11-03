package biblioteca.models;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CReflection<T> {
    public Field[] getAtributos(T objeto){
        return objeto.getClass().getDeclaredFields();
    }

    public Method[] getMetodos(T objeto){
        return objeto.getClass().getDeclaredMethods();
    }
}
