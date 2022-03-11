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
         * 2. taking input from user
         * 3. calling method
         */

        /***
         * 1. created user registration
         */
        UserRegistration userRegistration = new UserRegistration();

        /***
         * 2. taking input from user
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name : ");
        String firstName = sc.next();

        /***
         * 3. calling method validateFirstName, passing user input to the pattern
         */
        userRegistration.validateFirstName(firstName);
    }
}
