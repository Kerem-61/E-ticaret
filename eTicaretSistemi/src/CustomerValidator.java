import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerValidator {


    boolean isEmailValid(String email) {
        String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;

        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        return matcher.matches();
    }

     public boolean allValid(Customer customer) {
        if (!customer.name.isEmpty() && !customer.surname.isEmpty() && customer.password.length() == 6) {
            return true;
        } else {
            return false;
        }
    }



}
