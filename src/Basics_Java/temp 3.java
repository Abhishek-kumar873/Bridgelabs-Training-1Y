package Basics_Java;

public class temp {

    public static class Employee {
        String name;
        int id;
        double salary;
        void displayDetails() {
            System.out.println("Employee Details:");
            System.out.println("Name   : " + name);
            System.out.println("ID     : " + id);
            System.out.println("Salary : " + salary);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Employee emp1 = new Employee();
            emp1.name = "John Doe";
            emp1.id = 101;
            emp1.salary = 50000.0;
            emp1.displayDetails();
        }
    }

}




