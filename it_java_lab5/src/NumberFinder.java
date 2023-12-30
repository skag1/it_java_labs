import java.util.ArrayList;
import java.util.regex.*;

public class NumberFinder {

    public static void main(String[] args) {
        System.out.println(findNumbers("The price of the product is $19.99 -123123.12314 11 2323.2"));
    }

    public static String findNumbers(String string) {
        Pattern pattern = Pattern.compile("-?\\d+[.]?\\d+");
        Matcher matcher = pattern.matcher(string);
        ArrayList<Double> digits = new ArrayList<>();

        while (matcher.find()) {
            try {
                digits.add(Double.parseDouble(matcher.group()));
            } catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }

        return digits.toString();
    }
}