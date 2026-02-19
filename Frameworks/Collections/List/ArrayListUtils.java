import java.util.ArrayList;

public class ArrayListUtils<T> {

    ArrayList<T> list = new ArrayList<>();

    public void add(T value) {
        list.add(value);
    }

    public void print() {
        System.out.println(list);
    }
}
