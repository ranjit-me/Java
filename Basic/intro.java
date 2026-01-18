package Basic;

public class intro {
    public static void main(String args[]){
        System.out.println("Hello");
        String s1 = "Hello";
char[] arr = {'W', 'o', 'r', 'l', 'd'};
String s2 = new String(arr); // char array to string
String name="rajesh";
String names="rajesh";
boolean result=name.equals("raj");
System.out.println(s1 + " " + s2); // Concatenate: Hello World
System.out.println(s1.charAt(1)); // Char at index 1: 'e'
System.out.println(s1.length()); // Length: 5
System.out.println(s1.substring(0, 2)); // Substring: "He"
System.out.println(s1.equals("Hello"));

    }
}
