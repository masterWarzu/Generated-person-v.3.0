import java.io.*;

public class HalfHandCreation
{

    public static void Creating() throws Exception
    {
        int choice;
        System.out.println("--> Полу-автоматическое создание персонажа началось...");
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nВыберите расу:");
        String[] races_array = Races.RaceArray();
        for (int i = 0; i < races_array.length; i++)
        {
            System.out.println("# " + (i + 1) + ". " + races_array[i]);
        }
        System.out.println("# 0. Назад.");
        System.out.print("Твой выбор? : ");
        choice = Integer.parseInt(keyboard.readLine());
        switch (choice)
        {
            case 0:
                Start.startCreation();

            case 1:
                Start.descriptionOut(Start.resolution(), ReadOfFile.ReadFile("dwarfs.txt"));
                Races.Dwarf();
                //Names.DwarfsName(AutomaticCreation.gen);
                Creation.Creating();
                break;

            case 2:
                //a_Main.descriptionOut(a_Main.resolution(), ReadOfFile.ReadFile("elf's.txt"));
                Races.Elf();
                break;
            /*case 3 -> a_Main.descriptionOut(a_Main.resolution(), ReadOfFile.ReadFile("hobbits.txt"));   // вывод не работает как надо!
            case 4 -> a_Main.descriptionOut(a_Main.resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Races\\humans.txt"));
            case 5 -> a_Main.descriptionOut(a_Main.resolution(), ReadOfFile.ReadFile("dragonborn.txt"));
            case 6 -> a_Main.descriptionOut(a_Main.resolution(), ReadOfFile.ReadFile("gnomes.txt"));
            case 7 -> a_Main.descriptionOut(a_Main.resolution(), ReadOfFile.ReadFile("halfElf's.txt"));
            case 8 -> a_Main.descriptionOut(a_Main.resolution(), ReadOfFile.ReadFile("halfOrk's.txt"));
            case 9 -> a_Main.descriptionOut(a_Main.resolution(), ReadOfFile.ReadFile("tifling's.txt"));*/
            default:
                break;
        }

        //a_Start.descriptionsRaces();
    }

}