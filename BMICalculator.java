import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter the weight in kg
        System.out.print("Enter your weight in kilograms (kg): ");
        double weight = sc.nextDouble();
        // Enter the height in meters
        System.out.print("Enter your height in meters (m): ");
        double height = sc.nextDouble();
        // Calculate the BMI
        double bmi = weight / (height * height);
        // BMI Categories
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            category = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obese";
        }
        // Print the output
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("BMI Category: " + category);
    }
}
