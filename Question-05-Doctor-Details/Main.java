import java.util.Scanner;
class Doctor {
    private String name;
    private String address;
    private int wardNumber;
    Doctor(String name, String address, int wardNumber) {
        this.name = name;
        this.address = address;
        this.wardNumber = wardNumber;
    }
    void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Ward Number : " + wardNumber);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String address = sc.nextLine();
        int wardNumber = sc.nextInt();
        Doctor doctor = new Doctor(name, address, wardNumber);
        doctor.displayDetails();
    }
}
