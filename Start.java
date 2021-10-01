import java.io.*;
import java.awt.*;
import java.util.*;

public class Start
{
    static int choice;
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    static void startCreation() throws Exception    // главное меню
    {
        System.out.println("\nChoose your destiny:");
        System.out.println("# 1. Автоматическое создание.");
        System.out.println("# 2. Полу-автоматическое создание.");
        System.out.println("# 3. Ручное создание.");
        System.out.println("# 4. Больше информации.");
        System.out.print("Твой выбор? : ");
        choice = Integer.parseInt(keyboard.readLine());

        switch (choice)
        {
            case 1 -> AutomaticCreation.Creating();
            case 2 -> HalfHandCreation.Creating();
            case 3 -> System.out.println("--> Вы выбрали ручное создание персонажа...");
            case 4 -> infoChoice();
        }
    }

//====================================- расчитывает количество выводимых символов, исходя из разрешения экрана -========
    static int resolution()
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();   // присваивает переменной значение разрешения экрана по оси Х, в пикселях.
        int symbol = 8; // в гугле один символ равен 8 пикселям.
        int quantity;
        quantity = ((int) (width / symbol) - 27);   // значение, при котором будет переходить на новую строку.
        return quantity;
    }

//====================================- красивый вывод описанмя рас и классов -=========================================
    static void descriptionOut(int quantity, String textIn) // выводит нужное количество текста на экран.
    {
        char[] text = textIn.toCharArray();  // массив символов, в который загоняется текст описания.
        int j = 1;
        System.out.println();   // делает разделитель в виде пустой строки
        for (int i = 0; i < text.length; i++)
        {
            if (text[i] == '\t') // если текущий элемент массива является символом перехода на новую строку, то...
            {
                text[i] = '\n'; // переводит каретку на новую строку
                System.out.print(text[i]); // выводит текущий символ массива символов
                j = 1;  //... счётчик символов в строке сбрасывается на 1.
                text[i] = '\t'; // делает отступ для абзаца
            }
            if (j % quantity == 0)  // если счётчик символов в строке, поделённый без остатка на расчёт quantity...
            {
                for (; i < text.length; i++)    // запускается цикл, который продолжает выводить массив символов.
                {
                    if ((text[i] == ' ') && (j >= quantity))    // если элемент массива равен пустому месту (пробел),
                    // и при этом счётчик j больше или равен расчёту quantity...
                    {
                        System.out.print(text[i] + "\n");   // ... то вывод массива переносится на новую строку...
                        j = 1;  // ... счётчик символов в строке сбрасывается на 1.
                        break;  // производится вохож из этого цикла.
                    }
                    else
                    {
                        System.out.print(text[i]);  //... иначе, продолжается вывод массива в строку
                        j++;    // с увеличением счётчика в переменной j.
                    }
                }
            }
            else
            {
                System.out.print(text[i]);  // выводит очередной символ массива символов
                j++;    // увеличение счётчика в переменной j.
            }
        }
        System.out.println();   // делает разделитель в виде пустой строки
    }

//====================================- меню больше информации -========================================================
    static void infoChoice() throws Exception   // меню "Больше информации".
    {
        System.out.println("\n# 1. Больше информации по расам.");
        System.out.println("# 2. Больше информации по классам.");
        System.out.println("# 0. Назад.");
        System.out.print("Твой выбор? : ");
        choice = Integer.parseInt(keyboard.readLine());

        switch (choice)
        {
            case 0 -> startCreation();
            case 1 -> descriptionsRaces();
            case 2 -> descriptionClasses();
        }
    }

//====================================- рандом класса -=================================================================
    static String Class()
    {
        String[] array = Classes.ClassArray();
        int size = array.length;
        Random rand = new Random();
        int choice = rand.nextInt(size);
        return array[choice];
    }

//====================================- рандом с двумя входными параметрами -===========================================
    public static int RandAll(int min, int max)
    {
        Random rand = new Random();
        int diff = max - min;
        int out = rand.nextInt(diff + 1);
        return out += min;
    }

//====================================- метод выводящий список рас на экран и запоминающий выбор -======================
    static Integer choiceRase() throws Exception
    {
        System.out.println("\nВыберите расу:");
        String[] races_array = Races.RaceArray();
        for (int i = 0; i < races_array.length; i++)
        {
            System.out.println("# " + (i + 1) + ". " + races_array[i]);
        }
        System.out.println("# 0. Назад.");
        System.out.print("Твой выбор? : ");
        choice = Integer.parseInt(keyboard.readLine());
        return choice;
    }

//====================================- чтение файлов с описанием рас персонажей -======================================
    static void descriptionsRaces() throws Exception    // меню запроса выбора расы для получения информации
    {
        switch (choiceRase())
        {
            case 0: infoChoice();
                break;
            case 1: descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Races\\dwarfs.txt"));
                break;
            case 2: descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Races\\elf's.txt"));
                break;
            case 3: descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Races\\halfling.txt"));   // вывод не работает как надо!
                break;
            case 4: descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Races\\humans.txt"));
                break;
            case 5: descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Races\\dragonborn.txt"));
                break;
            case 6: descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Races\\gnomes.txt"));
                break;
            case 7: descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Races\\halfElf's.txt"));
                break;
            case 8: descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Races\\halfOrk's.txt"));
                break;
            case 9: descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Races\\tifling's.txt"));
                break;
            default:
                break;
        }
    }

//====================================- метод выводящий список классов на экран и запоминающий выбор -==================
    static Integer choiceClass() throws Exception
    {
        System.out.println("\nВыберите класс:");
        String [] class_array = Classes.ClassArray();
        for (int i = 0; i < class_array.length; i++)
        {
            System.out.println("# " + (i + 1) + ". " + class_array[i]);
        }
        System.out.println("# 0. Назад.");
        System.out.print("\nТвой выбор? : ");
        choice = Integer.parseInt(keyboard.readLine());
        return choice;
    }

//====================================- чтение файлов с описанием рас персонажей -======================================
    static void descriptionClasses() throws Exception   // меню запроса выбора класса для получения информации
    {
        switch (choiceClass())
        {
            case 0 -> infoChoice();
            case 1 -> descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Classes\\barbarian.txt"));
            case 2 -> descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Classes\\bard.txt"));
            case 3 -> descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Classes\\priest.txt"));
            case 4 -> descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Classes\\druid.txt"));
            case 5 -> descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Classes\\warrior.txt"));
            case 6 -> descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Classes\\monk.txt"));
            case 7 -> descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Classes\\paladin.txt"));
            case 8 -> descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Classes\\pathfinder.txt"));  // вывод не работает как надо!!!
            case 9 -> descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Classes\\rogue.txt"));
            case 10 -> descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Classes\\magician.txt"));
            case 11 -> descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Classes\\sorcerer.txt"));
            case 12 -> descriptionOut(resolution(), ReadOfFile.ReadFile("F:\\Java code\\My project\\Person creator\\Classes\\wizard.txt"));
        }
    }
}