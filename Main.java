import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        for(Field x : ClassHelp.class.getFields()){
            System.out.println(x.get(x));
        }

    }
}
