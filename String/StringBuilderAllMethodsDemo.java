public class StringBuilderAllMethodsDemo {

    public static void main(String[] args) {

        // 1. Creating StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial: " + sb);

        // 2. append() → adds text at end
        sb.append(" World");
        System.out.println("append(): " + sb);

        // 3. insert() → inserts text at specific index
        sb.insert(5, " Java");
        System.out.println("insert(): " + sb);

        // 4. replace() → replaces characters between indexes
        sb.replace(6, 10, "C++");
        System.out.println("replace(): " + sb);

        // 5. delete() → deletes characters between indexes
        sb.delete(6, 10);
        System.out.println("delete(): " + sb);

        // 6. deleteCharAt() → deletes character at index
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt(): " + sb);

        // 7. reverse() → reverses string
        sb.reverse();
        System.out.println("reverse(): " + sb);

        // Reverse back to original
        sb.reverse();

        // 8. length() → returns length
        System.out.println("length(): " + sb.length());

        // 9. capacity() → returns capacity
        System.out.println("capacity(): " + sb.capacity());

        // 10. charAt() → returns character at index
        System.out.println("charAt(1): " + sb.charAt(1));

        // 11. setCharAt() → changes character at index
        sb.setCharAt(0, 'h');
        System.out.println("setCharAt(): " + sb);

        // 12. substring() → returns substring
        String sub = sb.substring(0, 5);
        System.out.println("substring(): " + sub);

        // 13. indexOf() → returns index of first occurrence
        System.out.println("indexOf('World'): " + sb.indexOf("World"));

        // 14. lastIndexOf() → returns last occurrence
        sb.append(" World");
        System.out.println("lastIndexOf('World'): " + sb.lastIndexOf("World"));

        // 15. ensureCapacity() → increases capacity
        sb.ensureCapacity(50);
        System.out.println("ensureCapacity(): " + sb.capacity());

        // 16. setLength() → sets new length
        sb.setLength(5);
        System.out.println("setLength(): " + sb);

        // 17. toString() → converts to String
        String finalString = sb.toString();
        System.out.println("toString(): " + finalString);

    }
}
