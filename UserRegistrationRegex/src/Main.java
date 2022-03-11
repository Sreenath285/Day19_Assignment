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
         * 3. created static method testSampleEmails
         */

        /***
         * 1. created user registration
         */
        UserRegistration userRegistration = new UserRegistration();

        /***
         * 2. while loop to iterate choice
         */
        while (true) {
            System.out.println("\n1. Validate first name \n2. Validate last name" +
                                "\n3. Validate email id \n4. Validate mobile number" +
                                "\n5. Validate password \n6. Test sample email ids" +
                                "\n7. Exit");
            
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
                    userRegistration.validateEmail();
                    break;
                case 4 :
                    userRegistration.validateMobileNumber();
                    break;
                case 5 :
                    userRegistration.validatePassword();
                    break;
                case 6 :
                    testSampleEmails();
                    break;
                case 7 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    /***
     * 3. created static method testSampleEmails
     */
    private static void testSampleEmails() {

        // calling TestEmails class methods
        TestEmails.validEmailTest();
        TestEmails.inValidEmailTest();
    }
}
