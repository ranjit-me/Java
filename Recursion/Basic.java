import java.util.*;

class Basic {

    public static void num(int n,
                           ArrayList<Integer> al,
                           LinkedList<Integer> li,
                           HashSet<Integer> hs,
                           Vector<Integer> vl) {

        if (n == 0) {
            return;
        }

        // recursive call first to store in ascending order
        num(n - 1, al, li, hs, vl);

        // add elements
        al.add(n);
        li.add(n);
        hs.add(n);
        vl.add(n);
    }

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> li = new LinkedList<>();
        HashSet<Integer> hs = new HashSet<>();
        Vector<Integer> vl = new Vector<>();

        num(6, al, li, hs, vl);

        // print all collections
        System.out.println("ArrayList: " + al);
        System.out.println("LinkedList: " + li);
        System.out.println("HashSet: " + hs);
        System.out.println("Vector: " + vl);
    }
}
