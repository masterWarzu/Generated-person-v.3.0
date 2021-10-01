import java.util.Random;

public class Classes
{
    public static String[] ClassArray()
    {
        String[] class_array = {"Варвар","Бард","Жрец","Друид","Воин","Монах","Паладин","Следопыт","Плут",
                "Чародей","Колдун","Волшебник"};
        return class_array;
    }

//====================================- вызывает генератор характеристик для каждой расы -==============================
    public static void ClassChoice(String clas)
    {
        switch (clas)
        {
            case "Варвар" -> Barbarian();
            case "Эльф" -> Bard();
            case "Полурослик" -> Priest();
            case "Человек" -> Druid();
        }
    }

    public static void Barbarian()
    {
        System.out.println("\nБонус мастерства: +2.");
        System.out.println("Ярость: 2.");
        System.out.println("Урон ярости: +2.");
        System.out.println("Кость хитов: 1d12 за каждый уровень варвара.");
        System.out.println("Хиты на 1 уровне: " + " (12 + модификатор Телосложения).");
    }

    public static void Bard()
    {
        System.out.println("\nБонус мастерства: +2.");
        System.out.println("Известные заговоры: " + "(два из списка).");
        System.out.println("Известные заклинания: " + "(четыре из списка).");
        System.out.println("Ячейки заклинаний 1-го уровня: 2.");
        System.out.println("Кость хитов: 1d8 за каждый уровень барда.");
        System.out.println("Хиты на 1 уровне: " + " (8 + модификатор Телосложения).");

    }

    public static void Priest()
    {
        System.out.println("\nБонус мастерства: +2.");
        System.out.println("Известные заговоры: " + "(три из списка).");
        System.out.println("Ячейки заклинаний 1-го уровня: 2.");
        System.out.println("Кость хитов: 1d8 за каждый уровень жреца.");
        System.out.println("Хиты на 1 уровне: " + " (8 + модификатор Телосложения).");
    }

    public static void Druid()
    {
        System.out.println("\nБонус мастерства: +2.");
        System.out.println("Известные заговоры: " + "(два из списка).");
        System.out.println("Ячейки заклинаний 1-го уровня: 2.");
        System.out.println("Кость хитов: 1d8 за каждый уровень друида.");
        System.out.println("Хиты на 1 уровне: " + " (8 + модификатор Телосложения).");
    }
}