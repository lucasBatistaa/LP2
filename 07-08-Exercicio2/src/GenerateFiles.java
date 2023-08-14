import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JFileChooser;

public class GenerateFiles {

    JFileChooser chooser = new JFileChooser();
    int returnValue;

    public void write(int minValue, int maxValue, String folderPath) {
        try {
            FileWriter writer = new FileWriter(folderPath, false);
            BufferedWriter bufferWriter = new BufferedWriter(writer);

            int randomNumber;
            
            for (int count = minValue; count < maxValue; count++) {
                randomNumber = (int) Math.floor(minValue + (Math.random() * (maxValue - minValue)));
                bufferWriter.append(randomNumber + "\n");
            }      

            bufferWriter.close();
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    } 
}