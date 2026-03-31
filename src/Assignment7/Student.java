package Assignment7;
class Student {
    String name;
    int rollNo;
    int marks;
    char grade;
    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        calculateGrade();
    }
    void calculateGrade() {
        if (marks >= 90)
            grade = 'A';
        else if (marks >= 75)
            grade = 'B';
        else if (marks >= 50)
            grade = 'C';
        else
            grade = 'F';
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        Student s1 = new Student("John Doe", 20, 99);
        s1.display();
    }
}