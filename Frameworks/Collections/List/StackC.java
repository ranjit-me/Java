import java.util.*;
public class StackC {
    public static void main(String[] args) {
        //LIFO
        Stack<Integer> ss=new Stack<>();
        ss.push(12);
        ss.push(1);
        ss.push(4);
        ss.pop();

        ss.isEmpty();
        ss.size();
        
        System.out.println(ss.peek());
        System.out.println(ss);
    }
}
