import java.io.File;

public class GenerateFolders {
    public void createFolders(String nameFolders[], String path) {
        for (String name : nameFolders) {
            
            File folder = new File(path + "\\" + name);

            if (!folder.exists()) {
                folder.mkdir();
                System.out.println(folder.getAbsolutePath()); 
            }
        }
    }
}