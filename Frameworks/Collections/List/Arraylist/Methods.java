import java.util.*;

// Abstract class (Parent)
abstract class listOperation {

    protected AbstractList<Integer> list = new ArrayList<>();

    // Abstract methods
    abstract void addElement(int element);

    abstract void addElementAt(int index, int element);

    abstract void removeElement(int element);

    abstract void removeAt(int index);

    abstract void printList();

    abstract void searchElement(int element);

    abstract void getElement(int index);

    abstract void setElement(int index, int element);

    abstract void checkEmpty();

    abstract void findIndex(int element);

    abstract void findLastIndex(int element);

    abstract void clearList();

    abstract void sortList();

    abstract void reverseList();

    abstract void cloneList();

    abstract void convertToArray();

    abstract void iterateList();

    abstract void checkEquals();

    abstract void subList(int start, int end);

    abstract void addAllElements();

    abstract void removeAllElements();

    abstract void retainAllElements();

    abstract void ensureCapacity(int capacity);

    abstract void trimList();

    // Concrete method
    int getSize() {
        return list.size();
    }
}


// Child class
class createList extends listOperation {

    void addElement(int element) {
        list.add(element);
        System.out.println(element + " added");
    }

    void addElementAt(int index, int element) {
        list.add(index, element);
        System.out.println(element + " added at index " + index);
    }

    void removeElement(int element) {
        list.remove(Integer.valueOf(element));
        System.out.println(element + " removed");
    }

    void removeAt(int index) {
        list.remove(index);
        System.out.println("Element removed at index " + index);
    }

    void printList() {
        System.out.println("List: " + list);
    }

    void searchElement(int element) {
        System.out.println(list.contains(element) ? "Found" : "Not Found");
    }

    void getElement(int index) {
        System.out.println("Element: " + list.get(index));
    }

    void setElement(int index, int element) {
        list.set(index, element);
        System.out.println("Updated index " + index);
    }

    void checkEmpty() {
        System.out.println(list.isEmpty() ? "List is empty" : "List is not empty");
    }

    void findIndex(int element) {
        System.out.println("Index: " + list.indexOf(element));
    }

    void findLastIndex(int element) {
        System.out.println("Last Index: " + list.lastIndexOf(element));
    }

    void clearList() {
        list.clear();
        System.out.println("List cleared");
    }

    void sortList() {
        Collections.sort((ArrayList<Integer>) list);
        System.out.println("List sorted");
    }

    void reverseList() {
        Collections.reverse((ArrayList<Integer>) list);
        System.out.println("List reversed");
    }

    void cloneList() {
        ArrayList<Integer> newList = (ArrayList<Integer>) ((ArrayList<Integer>) list).clone();
        System.out.println("Cloned List: " + newList);
    }

    void convertToArray() {
        Object[] arr = list.toArray();
        System.out.println("Array: " + Arrays.toString(arr));
    }

    void iterateList() {
        System.out.print("Iterator: ");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    void checkEquals() {
        ArrayList<Integer> newList = new ArrayList<>(list);
        System.out.println("Equals: " + list.equals(newList));
    }

    void subList(int start, int end) {
        System.out.println("SubList: " + list.subList(start, end));
    }

    void addAllElements() {
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(100);
        newList.add(200);
        list.addAll(newList);
        System.out.println("Added all elements");
    }

    void removeAllElements() {
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(100);
        newList.add(200);
        list.removeAll(newList);
        System.out.println("Removed all matching elements");
    }

    void retainAllElements() {
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(2);
        list.retainAll(newList);
        System.out.println("Retained common elements");
    }

    void ensureCapacity(int capacity) {
        ((ArrayList<Integer>) list).ensureCapacity(capacity);
        System.out.println("Capacity ensured: " + capacity);
    }

    void trimList() {
        ((ArrayList<Integer>) list).trimToSize();
        System.out.println("Trimmed list");
    }
}


// Main class
public class Methods {

    public static void main(String[] args) {

        listOperation l1 = new createList();

        // Add elements
        for (int i = 1; i <= 5; i++) {
            l1.addElement(i);
        }

        l1.printList();

        l1.addElementAt(2, 50);

        l1.printList();

        l1.getElement(2);

        l1.setElement(2, 99);

        l1.printList();

        l1.searchElement(3);

        l1.findIndex(3);

        l1.findLastIndex(3);

        System.out.println("Size: " + l1.getSize());

        l1.sortList();

        l1.printList();

        l1.reverseList();

        l1.printList();

        l1.cloneList();

        l1.convertToArray();

        l1.iterateList();

        l1.checkEquals();

        l1.subList(0, 2);

        l1.addAllElements();

        l1.printList();

        l1.removeAllElements();

        l1.printList();

        l1.ensureCapacity(50);

        l1.trimList();

        l1.checkEmpty();

        l1.clearList();

        l1.printList();
    }
}
