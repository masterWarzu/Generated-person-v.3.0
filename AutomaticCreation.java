import java.util.Random;

public class AutomaticCreation
{
    public static String ras = Race();
    public static String clas = Clas();
    public static String gen = Gender();

//====================================- рандом расы -===================================================================
    static String Race()
    {
        String[] array = Races.RaceArray();
        int size = array.length;
        Random rand = new Random();
        int choice = rand.nextInt(size);
        return array[choice];
    }

//====================================- рандом пола -===================================================================
    static String Gender()
    {
        String[] sex = {"Мужской","Женский"};
        int size = sex.length;
        Random rand = new Random();
        int choice = (rand.nextInt(size) + 1);
        if (choice == 1)
            return "Мужской";
        else
            return "Женский";
    }

//====================================- рандом класса -===================================================================
    static String Clas()
    {
        String[] array = Classes.ClassArray();
        int size = array.length;
        Random rand = new Random();
        int choice = rand.nextInt(size);
        return array[choice];
    }

//====================================- создание персонажа -============================================================
    public static void Creating()
    {
        System.out.println("\n--> Автоматическое создание персонажа началось...\n");
        System.out.println("Раса: " + ras);
        System.out.println("Класс: " + clas);
        System.out.println("Пол: " + gen);
        System.out.print("Имя: ");
        Names.RaceName(ras);
        Races.RaceChoice(ras);
        Classes.ClassChoice(clas);
    }

}