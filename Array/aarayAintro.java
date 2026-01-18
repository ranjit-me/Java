package Array;

public class aarayAintro {
    void arrayIntro(){
        System.out.println("An array is a collection of similar types of data stored in contiguous memory locations. It is used to store multiple values in a single variable, instead of declaring separate variables for each value.");
        System.out.println("Types of arrays in Java: \n 1. Single Dimensional Array \n 2. Multi Dimensional Array \n 3. Jagged Array");
    }
    void arrayDeclaration(){
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println("Array Declaration Syntax: \n dataType[] arrayName; \n or \n dataType arrayName[];");
        System.out.println("Example: \n int[] numbers; \n or \n int numbers[];");
    }
    void arrayInitialization(){
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println("Array Initialization Syntax: \n arrayName = new dataType[size];");
        System.out.println("Example: \n numbers = new int[5];");
        System.out.println("You can also initialize an array at the time of declaration: \n int[] numbers = {1, 2, 3, 4, 5};");
    }
    void arrayAccess(){
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println("Value at index 4: " + arr[4]);
        System.out.println("Accessing Array Elements: \n You can access array elements using their index. The index starts from 0.");
        System.out.println("Example: \n int firstElement = numbers[0]; // Accesses the first element of the array");
    }
    
    public static void main(String[] args) {
        aarayAintro arrayIntroObj = new aarayAintro();
        arrayIntroObj.arrayIntro();
        System.out.println();
        arrayIntroObj.arrayDeclaration();
        System.out.println();
        arrayIntroObj.arrayInitialization();
        System.out.println();
        arrayIntroObj.arrayAccess();
        
    }
}
