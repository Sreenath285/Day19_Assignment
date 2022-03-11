import java.util.Scanner;

public class Main {

    /***
     * main method for manipulation
     * @param args - default param(not used)
     */
    public static void main(String[] args) {

        /***
         * PROCEDURE
         * 1. created user registration
         * 2. while loop to iterate choice
         */

        /***
         * 1. created user registration
         */
        UserRegistration userRegistration = new UserRegistration();

        /***
         * 2. while loop to iterate choice
         */
        while (true) {
            System.out.println("1. Validate first name \n2. Validate last name" +
                                "\n3. Exit");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    userRegistration.validateFirstName();
                    break;
                case 2 :
                    userRegistration.validateLastName();
                    break;
                case 3 :
                    System.exit(0);
                default :
                    System.out.println("Invalid input");
            }
        }
    }
}
