package biblioteca.models.padraoprojeto;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class CReflection<T> {
    public Field[] getAtributos(T objeto){
        return objeto.getClass().getDeclaredFields();
    }

    public Method[] getMetodos(T objeto){
        return objeto.getClass().getDeclaredMethods();
    }

    public void getLista(List<T> lista){
        for (T item: lista){
            System.out.println(item);
        }
    }
}
