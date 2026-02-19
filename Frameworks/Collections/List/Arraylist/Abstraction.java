
import java.util.ArrayList;

// Abstract class (Parent)
abstract class ListOperations {

    protected ArrayList<Integer> list = new ArrayList<>();

    // Abstract methods
    abstract void addElement(int element);

    abstract void removeElement(int element);

    abstract void printList();

    abstract void canSearch(int element);

    // Concrete method
    int getSize() {
        return list.size();
    }
}


// SavingList (Child class)
class SavingList extends ListOperations {

    @Override
    void addElement(int element) {
        list.add(element);
        System.out.println(element + " added to SavingList");
    }

    @Override
    void removeElement(int element) {
        list.remove(Integer.valueOf(element));
        System.out.println(element + " removed from SavingList");
    }

    @Override
    void printList() {
        System.out.println("SavingList: " + list);
    }

    @Override
    void canSearch(int element) {
        if (list.contains(element)) {
            System.out.println(element + " found in SavingList");
        } else {
            System.out.println(element + " not found in SavingList");
        }
    }
}


// CurrentList (Child class)
class CurrentList extends ListOperations {

    int maxLimit = 5;

    @Override
    void addElement(int element) {
        if (list.size() < maxLimit) {
            list.add(element);
            System.out.println(element + " added to CurrentList");
        } else {
            System.out.println("Cannot add, limit reached in CurrentList");
        }
    }

    @Override
    void removeElement(int element) {
        list.remove(Integer.valueOf(element));
        System.out.println(element + " removed from CurrentList");
    }

    @Override
    void printList() {
        System.out.println("CurrentList: " + list);
    }

    @Override
    void canSearch(int element) {
        if (list.contains(element)) {
            System.out.println(element + " found in CurrentList");
        } else {
            System.out.println(element + " not found in CurrentList");
        }
    }
}


// Main class
public class Abstraction {

    public static void main(String[] args) {

        // Polymorphism
        ListOperations list1 = new SavingList();

        list1.addElement(10);
        list1.addElement(20);
        list1.addElement(30);

        list1.printList();

        list1.canSearch(20);

        System.out.println("Size: " + list1.getSize());

        list1.removeElement(20);

        list1.printList();


        System.out.println("--------------------");


        // ListOperations list2 = new CurrentList();

        // list2.addElement(100);
        // list2.addElement(200);
        // list2.addElement(300);
        // list2.addElement(400);
        // list2.addElement(500);
        // list2.addElement(600); // exceeds limit

        // list2.printList();

        // list2.canSearch(300);
    }
}
