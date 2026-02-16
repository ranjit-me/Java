
public class StMethods {
    //String Length()
    public static int length(String s){
        int length=s.length();
        return length;
    }
    //CharAt()
    public static char CharAt(String s,int index){
        return s.charAt(index);
    }
    //substring
    public static String subString(String s,int start, int end){
        return s.substring(1,5);
    }
    //equal 
    public static Boolean equal(String s, String s1){
        return s.equals(s1);
    }
    //equalsIgnorCase
    public static Boolean equalIgnore(String s,String s1){
        return s.equalsIgnoreCase(s1);
    }
    //toUpperCase
    public static String toUpperCase(String s){
        return s.toUpperCase();
    }
    //toLowerCase
    public static String toLowerCase(String s){
        return s.toLowerCase();
    }
    //trim.  remove space at start and end 
    public static String trim(String s){
        return s.trim();
    }
    //contain
    public static Boolean contain(String s,String contain){
        return s.contains(s);
    }
    //indexOf()
    public static int indexOf(String s,char c){
        return s.indexOf(c);
    }
    //replace
    public static String replace(String s,char index, char c){
        return s.replace(index, c);
    }
    //startWith()
    public static Boolean startWith(String s,String cod){
        return s.startsWith(cod);
    }
    //endWith()
    public static Boolean endWith(String s,String cod){
        return s.endsWith(cod);
    }
    //isEmpty()
    public static Boolean isEmpty(String s){
        return s.isEmpty();
    }
    //toCharArray()
    public static char ch(String s,int index){
        char arr[]=s.toCharArray();
        return arr[index];
        
        
    }
    //character.isDigit()
    public static boolean isOnlyDigits(String s){
    
    for(int i = 0; i < s.length(); i++){
        
        if(!Character.isDigit(s.charAt(i))){
            return false;
        }
        
    }
    
        return true;
    }
    //split
    public static String split(String s){
    
        String arr[]=s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            result.append(arr[i]);
            if(i!=0){
                result.append(" ");
            }

        }
        return result.toString();        
    }
    //String.valueOF()
    public static void valueOF(){
        int num = 123;
        String s = String.valueOf(num);
        System.out.println(s);
        //char to value
        char[] arr = {'h','e','l','l','o'};
        String d = String.valueOf(arr);
        System.out.println(d);


    }
    //concat
    public static void concat(){
        String s1 = "Hello";
        String s2 = "World";

        String result = s1.concat(" ").concat(s2);

        System.out.println(result);

    }
    //repeat
    public static void repeat(){
        String s = "Hi ";

        System.out.println(s.repeat(3));

    }
    //join
    public static void join(){
        String result = String.join("-", "Java", "is", "easy");

        System.out.println(result);

    }
    public static void main(String[] args) {
        // length("Ranjit");
        System.out.println("Ranjit String Length:- "+length("Ranjit"));
        System.out.println("Char at index 1:- "+CharAt("Ranjit",1));
        System.out.println("SubString:- "+ subString("Ranjit", 1, 5));
        System.out.println("Same Type compare :- "+equal("Ranjit", "Ranjit"));
        System.out.println("Upper Lower compare:- "+equalIgnore("RANJIT", "ranjit"));
        System.out.println("toUpperCase:- "+toUpperCase("ranjit"));
        System.out.println("toLowerCase:- "+toLowerCase("RANJIT"));
        System.out.println("Trim:-"+trim("  Hello   "));
        System.out.println("  Hello.  ");
        System.out.println(contain("Hello World","Hello"));
        System.out.println(indexOf("Ranjit", 'a'));
        System.out.println(replace("Hello", 'l', 'c'));
        System.out.println(startWith("hello", "he"));
        System.out.println(endWith("hello", "lo"));
        System.out.println(isEmpty(""));
        System.out.println(ch("Ranjit", 0));
        System.out.println(isOnlyDigits("Ranji"));
        System.out.println(split("the sky is blue"));
        valueOF();
        concat();
        repeat();
        join();
    }    
}
