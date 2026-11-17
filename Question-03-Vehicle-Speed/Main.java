import java.util.Scanner;
class Vehicle {
    double distance;
    Vehicle(double distance) {
        this.distance = distance;
    }
}
class Car extends Vehicle {
    double time;
    Car(double distance, double time) {
        super(distance);
        this.time = time;
    }
    double calculateSpeed() {
        return distance / time;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextDouble();
        double time = sc.nextDouble();
        Car car = new Car(distance, time);
        System.out.println("Speed: " +car.calculateSpeed() + " km/h");
    }
}
