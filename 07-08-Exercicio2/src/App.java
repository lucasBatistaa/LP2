import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        
        GenerateFolders folder = new GenerateFolders();
        GenerateFiles file = new GenerateFiles();

        String nameFolders[] = new String[]{"100", "1000", "10000", "50000", "100000"};

        File actualPath = new File("");

        for (String name : nameFolders) {
            String folderPath = folder.createFolder(name, actualPath.getAbsolutePath());

            int totalValues = Integer.parseInt(name);
            int minValue = 0;
            int maxValue = totalValues;

            for (int count = 1; count <= 10; count++) {
                

                file.write(minValue, maxValue, folderPath + "\\arq" + count + ".txt" );

                minValue += totalValues;
                maxValue += totalValues;
            }
        }
    }
}