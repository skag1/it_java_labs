import java.util.regex.*;

public class FindWord {
    public static void main(String[] args) {
        String result = wordSearch('o', "Andreyondrey andrey ondrey Ondrey ooo oleg olga");
        if (result.isEmpty()) {
            System.out.println("В строке нет слов начинающихся с этой буквы");
        } else {
            System.out.println(result);
        }
    }

    public static String wordSearch(char letter, String string) {
        String result = "";
        String newLetter = "" + letter;
        String regularExpression = "\\b[" + newLetter + "][A-Za-z]*";
        Pattern pattern = Pattern.compile(regularExpression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            result += matcher.group() + " ";
        }

        return result;
    }
}