public class Super {
    public void vehiclesSound() {
        System.out.println("Vehicles sounds are very amazing");
    }

    class Car extends Super {
        public void vehiclesSound() {
            super.vehiclesSound();
            System.out.println("Cars make Vroom-Vroom sounds");
        }
    }

    public static void main(String[] args) {
        Super superInstance = new Super();  // Create an instance of the outer class
        Super.Car car = superInstance.new Car();  // Create an instance of the nested class
        car.vehiclesSound();
    }
}
