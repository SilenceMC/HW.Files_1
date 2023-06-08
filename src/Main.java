import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String mainDirectory = "/Users/archr/Games";
        List<String> directories = Arrays.asList(
                "src",
                "src/main",
                "src/main/Main.java",
                "src/main/Utils.java",
                "src/test",
                "res",
                "res/drawables",
                "res/vectors",
                "res/icons",
                "savegames",
                "temp",
                "temp/temp.txt");

        StringBuilder logs = new StringBuilder();

        for (String directory:directories) {
            File makeNewDirecory = new File(mainDirectory, directory);
            if (directory.contains(".")){
                makeNewDirecory.createNewFile();
                logs.append("Создан файл. Путь до файла: " + makeNewDirecory + "\n");
            }
            else{
                makeNewDirecory.mkdir();
                logs.append("Создана директория: " + makeNewDirecory + "\n");
            }
        }

        FileWriter saveLogs = new FileWriter("/Users/archr/Games/temp/temp.txt");
            saveLogs.write(logs.toString());
            saveLogs.close();
    }
}
