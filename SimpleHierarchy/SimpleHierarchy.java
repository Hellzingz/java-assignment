package SimpleHierarchy;

public class SimpleHierarchy {

    public static void main(String[] args) {
        class Vehicle {
            protected String brand;

            public void setBrand(String brand) {
                this.brand = brand;
            }
            public String getBrand() {
                return brand;
            }

         void startEngine() {
            System.out.println("Starting engine of " + getBrand());
         }
        }

        class Car extends Vehicle {
            void drive() {
                System.out.println(getBrand()+ " กำลังขับเคลื่อนบนถนน.");
            }
        }

        Car Mycar = new Car();
        Mycar.setBrand("Toyota");
        Mycar.startEngine();
        Mycar.drive();
    }
}
