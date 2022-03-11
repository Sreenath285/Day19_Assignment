import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public String namePattern;

    /***
     * validateFirstName method created to check given first name is valid or not
     */
    public void validateFirstName () {

        namePattern = "^[A-Z]{1}[a-z]{2,}$";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name : ");
        String firstName = sc.next();
        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("Valid input");
        }
        else {
            System.out.println("Invalid input");
        }
    }

    public void validateLastName() {

        namePattern = "^[A-Z]{1}[a-z]{2,}$";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter last name : ");
        String lastName = sc.next();
        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("Valid input");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
