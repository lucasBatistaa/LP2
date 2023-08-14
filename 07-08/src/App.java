import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        // - João [Ana, Lucas {Maria, Pedro (Luiz), Ricardo}, Anthony {Felipe (Carol)}, ]
        
        GenerateFolders folders = new GenerateFolders();

        File path = new File("");
        String actualPath = path.getAbsolutePath();
        
        String principalFolder[] = {"Joao"};
        String subFoldersJoao[] = {"Ana", "Lucas", "Anthony"};
        String subFolderLucas[] = {"Maria", "Pedro", "Ricardo"};
        String subFoldersPedro[] = {"Luiz"};
        String subFoldersAnthony[] = {"Felipe"};
        String subFoldersFelipe[] = {"Carol"};

        folders.createFolders(principalFolder, actualPath);
        folders.createFolders(subFoldersJoao, actualPath + "\\Joao");
        folders.createFolders(subFolderLucas, actualPath + "\\Joao\\Lucas");
        folders.createFolders(subFoldersPedro, actualPath + "\\Joao\\Lucas\\Pedro");
        folders.createFolders(subFoldersAnthony, actualPath + "\\Joao\\Anthony");
        folders.createFolders(subFoldersFelipe, actualPath + "\\Joao\\Anthony\\Felipe");
    }
}