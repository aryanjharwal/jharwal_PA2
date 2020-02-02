
import java.util.Scanner;
public class BMICalculator {
	   private double weight;
	   private double height;
	   private double bmi;
	   private int choice;

	   public BMICalculator() {

	   }

	   public void readUserData() {
	       /*
	       * Creating an Scanner class object which is used to get the inputs
	       * entered by the user
	       */
	       Scanner sc = new Scanner(System.in);

	       while (true) {
	           // Getting the input entered by the user
	           System.out.println("1.Weight in Pounds, Height in Inches.");
	           System.out.println("2.Weight in Kilograms, Height in meters.");
	           System.out.print("Enter Choice :");
	           choice = sc.nextInt();
	           if (choice == 1) {
	               System.out.print("Enter Weight (in Pounds):");
	               weight = sc.nextDouble();

	               System.out.print("Enter Height (in inches):");
	               height = sc.nextDouble();

	               break;
	           } else if (choice == 2) {
	               System.out.print("Enter Weight (in Kilograms):");
	               weight = sc.nextDouble();

	               System.out.print("Enter Height (in meters):");
	               height = sc.nextDouble();
	               break;
	           } else {
	               System.out.println("** Inavlid Choice **");
	               continue;
	           }
	       }

	   }

	   public void calculateBmi() {
	       if (choice == 1) {
	          
	           bmi = (weight * 703) / (height * height);

	       } else {
	           bmi = weight / (height * height);

	       }
	   }

	   public void displayBmi() {
	       String category = "";
	       if (bmi < 18.5)
	           category = "UnderWeight";
	       else if (bmi >= 18.5 && bmi <= 24.9)
	           category = "Normal";
	       else if (bmi >= 25 && bmi <= 29.9)
	           category = "OverWeight";
	       else if (bmi >= 30)
	           category = "Obese";
	       System.out.println("YOur BMI:" + bmi);
	       System.out.println("You are " + category);

	   
	}

public static void main(String[] args) {
	   BMICalculator app = new BMICalculator();
	   app.readUserData();
	   app.calculateBmi();
	   app.displayBmi();
	   }

	}
