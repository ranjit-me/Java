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
        @Override
        public void honk(){
            System.out.print("car honk !!!!!");
        }
    }
    // Derived class
    class Bus extends Vehical{
        public Bus(String BusNumber) {
            super(BusNumber);
        }
    }

public class polymorphisum {
    public static void main(String[] args) {
        Car car=new Car("MH13BN3767");
        car.honk();
        car.printVehicalNumber();
        Bus bus=new Bus("MH13BN6064");
        bus.honk();
        bus.printVehicalNumber();
    }
}
