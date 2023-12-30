import java.io.*;

public class InputOutput {
    public static void main(String[] args) throws CustomFileNotFound {
        String sourceFile = "C:\\Users\\aavkk\\IdeaProjects\\it_java_lab4\\src\\notsource.txt",
                destinationFile = "C:\\Users\\aavkk\\IdeaProjects\\it_java_lab4\\src\\destination.txt",
                exceptionFile = "C:\\Users\\aavkk\\IdeaProjects\\it_java_lab4\\src\\exception.txt";
        try {
            if(new File(destinationFile).exists()) {
                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(destinationFile);
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
                System.out.println("Файл успешно скопирован.");
                fis.close();
                fos.close();
            }
            else {
                throw new CustomFileNotFound("Файл для записи по указанному по пути не найден");
            }
        } catch (FileNotFoundException e) {
            try (FileOutputStream eos = new FileOutputStream(exceptionFile,true)) {
                eos.write(("Файл для чтения по указанному по пути не найден" + "\n").getBytes());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Файл для чтения по указанному по пути не найден");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
