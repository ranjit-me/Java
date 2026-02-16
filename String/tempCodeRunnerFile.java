
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
    public static void main(String[] args) {
        length("Ranjit");
        System.out.println(length("Ranjit"));
        System.out.println(CharAt("Ranjit", 1));
    }    
}
