// package OOPS;
//Encapsualtion 
class Car {
    String colour;
    int price;
    Car(String colour,int price){
        this.colour=colour;
        this.price=price;
    }
    void showCar(){
        System.out.print("Car colour is"+colour+"Price is"+price);
    }
    //use of static keyword
    public static void hello(){
        System.out.print("Ranjit Bichukale");
    }
}

public class Basic {
    
    public static void main(String[] args) {
        Car c1=new Car("BMW", 12000);
        c1.showCar();//here we created object and then calling method with help of object
        Car.hello();//here we using method from another class without creating object
    }
}
