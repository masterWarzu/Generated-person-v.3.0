import java.io.*;
import java.nio.charset.*;

public class ReadOfFile
{
    public static String ReadFile(String fileName) throws Exception
    {
        BufferedReader myFile = new BufferedReader((new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8)));
        String line;
        StringBuilder lineOut = new StringBuilder(" ");
        while ((line = myFile.readLine()) != null)
        {
            lineOut.append(line);
        }
        myFile.close();
        return lineOut.toString();
    }
}