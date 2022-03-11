import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public String regexPattern;
    Scanner sc = new Scanner(System.in);

    /***
     * validateFirstName method created to check given first name matches the pattern or not
     */
    public void validateFirstName () {

        regexPattern = "^[A-Z]{1}[a-z]{2,}$";
        System.out.print("Enter first name : ");
        String firstName = sc.next();
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("Valid input");
        }
        else {
            System.out.println("Invalid input");
        }
    }

    /***
     * validateLastName method created to check given last name matches the pattern or not
     */
    public void validateLastName() {

        regexPattern = "^[A-Z]{1}[a-z]{2,}$";
        System.out.print("Enter last name : ");
        String lastName = sc.next();
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("Valid input");
        }
        else {
            System.out.println("Invalid input");
        }
    }

    /***
     * validateEmail method created to check given email matches the pattern or not
     */
    public void validateEmail() {

        regexPattern = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}+(.[a-z]{2}+.[a-z]{2}+)*$";
        System.out.print("Enter email id : ");
        String email = sc.next();
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Valid input");
        }
        else {
            System.out.println("Invalid input");
        }
    }

    /***
     * validateMobileNumber method created to check given mobile number matches the pattern or not
     */
    public void validateMobileNumber() {

        regexPattern = "^(\\d{2}[- ]?){1}\\d{10}$";
        System.out.print("Enter mobile number : ");
        String mobileNumber = sc.next();
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(mobileNumber);
        if (matcher.matches()) {
            System.out.println("Valid input");
        }
        else {
            System.out.println("Invalid input");
        }
    }

    /***
     * validatePassword method created to check given password matches the pattern or not
     */
    public void validatePassword() {

        regexPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*]{1})[A-Za-z\\d!@#$%^&*]{8,}$";
        System.out.print("Enter password : ");
        String password = sc.next();
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Valid input");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
