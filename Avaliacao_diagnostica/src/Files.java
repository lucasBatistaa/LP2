import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Files {

    JFileChooser chooser = new JFileChooser();
    int returnValue;

    public void Write(int vector[]) {
        try {
            String pathFileWriter = "";

            returnValue = chooser.showSaveDialog(chooser);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                pathFileWriter = chooser.getSelectedFile().getAbsolutePath();
            }

            System.out.println("Escrevendo no arquivo " + pathFileWriter);

            FileWriter writer = new FileWriter(pathFileWriter, false);
            BufferedWriter bufferWriter = new BufferedWriter(writer);

            for (int number : vector) {
                bufferWriter.append(number + "\n");
            }

            bufferWriter.close();
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }   

    public int[] fileRead() {
        try {
            String line;
            String fileRead = "";
            String readNumbers = "";
            String vector[];

            FileNameExtensionFilter filter = new FileNameExtensionFilter("txt ou doc", "txt");

            chooser.addChoosableFileFilter(filter);

            returnValue = chooser.showOpenDialog(chooser);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                System.out.println(chooser.getSelectedFile());
                fileRead = chooser.getSelectedFile().getAbsolutePath();
            }

            BufferedReader bufferReader = new BufferedReader(new FileReader(fileRead));
            // System.out.println("Lendo o arquivo " + fileRead);

            while ((line = bufferReader.readLine()) != null) {
                readNumbers += line + ", ";
            }

            bufferReader.close();

            vector = readNumbers.split(", ");

            int N = Integer.parseInt(vector[0]);
            
            int vectorInNumbers[] = new int[N];

            for (int count = 0; count < N; count++) {
                vectorInNumbers[count] = Integer.parseInt(vector[count + 1]);
            }

            return vectorInNumbers;
            
        } catch (Exception e) {
            System.out.println(e);

        }

        int vectorInNumbers[] = {};

        return vectorInNumbers;
    }

}
