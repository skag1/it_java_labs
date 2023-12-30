import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TopWords {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String sourceFile = "C:\\Users\\aavkk\\IdeaProjects\\it_java_lab6\\src\\source.txt";
        File file = new File(sourceFile);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения файла");;
        }

        ArrayList<Integer> list = new ArrayList<>();
        Set<String> setKeys = map.keySet();
        for (String s: setKeys){
            list.add(map.get(s));
        }

        Collections.sort(list);
        Collections.reverse(list);

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(count < 10) {
                Integer value1 = list.get(i);
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Integer value2 = entry.getValue();
                    if (value1 == value2) {
                        System.out.println(value2 + " - " + key);
                        count++;
                        map.remove(key);
                        break;
                    }
                }
            }
        }
    }
}