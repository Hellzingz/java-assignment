package CreateYourOwnClass;

public class CreateYourOwnClass {
    public static void main(String[] args) {
        class Car {
            private String brand;
            private double speed;

            public void setSpeed(double speed) {
                if (speed >= 50) {
                    this.speed = speed;
                } else {
                    System.out.println("A standard car speed must be greater than 50 km/h");
                }
            }

            public void setBrand(String brand) {
                this.brand = brand;
            }

            public String getBrand() {
                return brand;
            }

            public double getSpeed() {
                return speed;
            }

            void displayInfo() {
                System.out.println("Car brand: " + getBrand() + ", Speed: " + getSpeed() + " km/h");
            }
        }
        Car Car1 = new Car();
        Car1.setBrand("Toyota");
        Car1.setSpeed(50);
        Car1.displayInfo();
    }
}
