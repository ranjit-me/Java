import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;
public class ListIterator {
    public static void main(String[] args) {
        List<Integer> al=new ArrayListR<>();
        al.add(2);
        al.add(4);
        al.add(1);
        al.add(0);
        al.add(6);
        Iterator<Integer> iterator=al.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
