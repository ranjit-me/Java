//Base Class
class Vehical{
    private String VehicalNumber;
    public Vehical(String VehicalNumber){
        this.VehicalNumber=VehicalNumber;
    }
    public void honk(){
        System.out.println("honk!!!!!!!!");
    }
    public void printVehicalNumber(){
        System.out.println(VehicalNumber);
    }
}
//Derived Class
  class Car extends Vehical{
        public Car(String CarNumber) {
            super(CarNumber);
        }
    }
    // Derived class
    class Bus extends Vehical{
        public Bus(String BusNumber) {
            super(BusNumber);
        }
    }
    
public class Inheritance {
    public static void main(String[] args) {
        Car car=new Car("dsf");
        car.honk();
        car.printVehicalNumber();
        Bus bus=new Bus("MH13BN6064");
        bus.honk();
        bus.printVehicalNumber();
    }
}
