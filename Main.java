import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
  @author Master WARzu.
 */

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Start.startCreation();

        //Restart();
    }

    /*public static void Restart() throws Exception
    {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.print("\nЕщё раз? (Y / N) -> ");
            String temp = reader.readLine();
            if (temp.equals())
            if ((temp == 'Y') || (temp == 'y'))
                Start.startCreation();
            if ((temp == 'N') || (temp == 'n')) {
                System.out.println("Выхожу...");
                System.exit(1);
            }
        }
        catch (IOException e)
        {
            System.out.println("ОШИБКА ВВОДА!!!");
        }
    }*/
}