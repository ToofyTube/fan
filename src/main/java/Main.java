import java.util.Scanner; // Import the Scanner class for reading user inputs

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Create a Scanner object for reading console input
    System.out.println("Enter fan speed (1 for SLOW, 2 for MEDIUM, 3 for FAST):");
    int fanSpeed = input.nextInt(); // Read user input

    String speedSetting = ""; // Variable to hold the speed setting as a String

    // Assign the string representation based on the integer input
    switch (fanSpeed) {
        case 1:
            speedSetting = "SLOW";
            break;
        case 2:
            speedSetting = "MEDIUM";
            break;
        case 3:
            speedSetting = "FAST";
            break;
        default:
            System.out.println("Invalid input. Please enter 1, 2, or 3."); // Handle invalid inputs
            return; // Exit the method if input is invalid
    }


    System.out.println("Enter fan Radius:");
    int radius = input.nextInt();

    input.nextLine(); // Consume the newline character.

    System.out.println("Enter fan Color:");
    String color = input.nextLine(); // Corrected: Read color as String.

    System.out.println("Is the fan on?");
    String fa = input.nextLine();
    if (fa.equalsIgnoreCase("yes")) {
      System.out.println("Fan speed setting: " + speedSetting + "; Radius: " + radius + "; Color: " + color + " Fan is on");
    }
    else {
      System.out.println("Fan speed setting: " + speedSetting + "; Radius: " + radius + "; Color: " + color + " Fan is off");
    }

  }
}