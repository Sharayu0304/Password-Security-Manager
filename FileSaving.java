import java.io.FileWriter;
import java.io.IOException;

public class FileSaving {

    void savePassword(Password p) {

        try {

            FileWriter writer = new FileWriter("passwords.txt");

            writer.write("Website: " + p.wbst + "\n");
            writer.write("Password: " + p.pwd + "\n");

            writer.close();

            System.out.println("Password saved successfully.");

        }
        catch (IOException e) {

            System.out.println("Error while saving file.");

        }
    }
}