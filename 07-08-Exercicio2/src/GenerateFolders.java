import java.io.File;

public class GenerateFolders {
    public String createFolder(String nameFolder, String path) {
        File folder = new File(path + "\\" + nameFolder);

            if (!folder.exists()) {
                folder.mkdir();
                System.out.println(folder.getAbsolutePath());
            }

        return folder.getAbsolutePath();
    }
}