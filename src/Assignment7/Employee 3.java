package Assignment7;
public class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " " + id + " " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 101, 50000);
        emp.display();
    }
}