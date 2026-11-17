import java.util.Scanner;
class Person {
    private String name;
    Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    void displayName() {
        System.out.println(name);
    }
}
class Staff extends Person {
    private int staffId;
    Staff(String name, int staffId) {
        super(name);
        this.staffId = staffId;
    }
    public int getStaffId() {
        return staffId;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    void displayStaffId() {
        System.out.println(staffId);
    }
}
class TemporaryStaff extends Staff {
    private int days;
    private int hoursWorked;
    TemporaryStaff(String name, int staffId, int days, int hoursWorked) {
        super(name, staffId);
        this.days = days;
        this.hoursWorked = hoursWorked;
    }
    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days = days;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    int calculateSalary() {
        return days * hoursWorked * 50;
    }
    void displayDetails() {
        displayName();
        displayStaffId();
        System.out.println(days);
        System.out.println(hoursWorked);
        System.out.println(calculateSalary());
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int staffId = sc.nextInt();
        int days = sc.nextInt();
        int hoursWorked = sc.nextInt();
        TemporaryStaff staff = new TemporaryStaff(name, staffId, days, hoursWorked);
        staff.displayDetails();
    }
}
