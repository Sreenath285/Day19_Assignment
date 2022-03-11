import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public String firstNamePattern;

    /***
     * validateFirstName method created to check given first name is valid or not
     * @param firstName - to pass the first name
     */
    public void validateFirstName (String firstName) {

        // pattern that first name must follow
        firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("Valid input");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
