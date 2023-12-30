import java.util.regex.*;

public class CheckIP {
    public static void main(String[] args) {
        System.out.println(checkIP("250.249.150.1"));
    }

    public static String checkIP(String ip) {
        String result = "";

        Pattern pattern = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[0-1]?[0-9]?[0-9])[.]){3}(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]?[0-9])$");
        Matcher matcher = pattern.matcher(ip);
        if (matcher.find()) {
            result = "Correct IP";
        } else {
            result = "Incorrect IP";
        }
        return result;
    }
}