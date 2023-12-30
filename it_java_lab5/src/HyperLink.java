import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HyperLink {
    public static void main(String[] args) {
        String text = "Пример текста с ссылкой: http://www.example.com. И еще одна ссылка: https://www.google.com";
        String replacedText = replaceLinks(text);
        System.out.println(replacedText);
    }

    public static String replaceLinks(String text) {
        // Создаем регулярное выражение для поиска ссылок
        String regex = "\\b((https|ftp|file)://[a-zA-Z0-9.]*[a-zA-Z0-9])";

        // Создаем Pattern объект с заданным регулярным выражением
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Заменяем найденные ссылки на гиперссылки
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            // Отлавливаем возможные ошибки при замене ссылок
            try {
                // Заменяем найденную ссылку на гиперссылку
                matcher.appendReplacement(sb, "<a href=\"$0\">$0</a>");
            } catch (IllegalArgumentException e) {
                // В случае ошибки выводим сообщение и продолжаем выполнение
                System.out.println("Ошибка при замене ссылки: " + e.getMessage());
            }
        }
        matcher.appendTail(sb);

        return sb.toString();
    }
}