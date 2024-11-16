import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String text =  "My phone number is 123-456-7890, but you can also reach me at 555-123-4567. My birthday is 12/25/1990. Don't call me before 9am or after 10pm.";

        Pattern getNumbers = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
        Matcher matchNumbers = getNumbers.matcher(text);

        Pattern getDates = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        Matcher matchDates = getDates.matcher(text);

        while(matchNumbers.find()){
            System.out.println("The phone numbers in this text are : " + matchNumbers.group());
        }

        while(matchDates.find()){
            System.out.println("The dates in this text are : " + matchDates.group());
        }
    }
}
