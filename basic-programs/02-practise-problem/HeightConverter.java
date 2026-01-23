import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in centimeters: ");
        double heightInCm = sc.nextDouble();

        double totalInches = heightInCm / 2.54;

        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + heightInCm +
                " while in feet is " + feet +
                " and inches is " + inches);

        sc.close();
    }
}
