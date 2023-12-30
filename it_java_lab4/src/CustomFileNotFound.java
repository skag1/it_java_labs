import java.io.FileNotFoundException;

public class CustomFileNotFound extends Exception {
    public CustomFileNotFound() {
        super("Файл по указанному по пути не найден");
    }

    public CustomFileNotFound(String message){
        super(message);
    }
}