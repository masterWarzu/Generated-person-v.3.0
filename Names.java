import java.util.Random;

public class Names
{
    public static void RaceName(String race)
    {
        switch (race)
        {
            case "Дварф" -> DwarfsName(AutomaticCreation.gen);
            case "Эльф" -> ElfsName(AutomaticCreation.gen);
            case "Полурослик" -> HalflingsName(AutomaticCreation.gen);
            case "Человек" -> HumansName(AutomaticCreation.gen);
            case "Драконорожденный" -> DragonbornName(AutomaticCreation.gen);
            case "Гном" -> GnomesName(AutomaticCreation.gen);
            case "Полуэльф" -> HalfElfs(AutomaticCreation.gen);
            case "Полуорк" -> HalfOrks(AutomaticCreation.gen);
            case "Тифлинг" -> Tiflings(AutomaticCreation.gen);
        }
    }

//====================================- имена дварфов -=================================================================
    public static void DwarfsName(String gender)
    {
        Random rand = new Random();

        String[] manDwarfName = {"Адрик", "Альберих", "Баренд", "Баэрн", "Броттор", "Бруенор", "Вондал", "Вэйт",
                "Гардаин", "Даин", "Даррак", "Делг", "Килдрак", "Моргран", "Орсик", "Оскар", "Рангрим", "Рюрик",
                "Таклинн", "Торадин", "Тордек", "Торин", "Травок", "Траубон", "Ульфгар", "Фаргрим", "Флинт", "Харбек",
                "Эберк", "Эйнкиль"};
        int sizeMan = manDwarfName.length;
        int choiceMan = rand.nextInt(sizeMan);

        String[] womanDwarfName = {"Артин", "Бардрин", "Вистра", "Гуннлода", "Гурдис", "Дагнал", "Диеза", "Илде",
                "Катра", "Кристид", "Лифтраса", "Мардред", "Одхильд", "Рисвин", "Саннл", "Торбера", "Торгга",
                "Фалкрунн", "Финеллен", "Хельджа", "Хлин", "Эльдет", "Эмбер"};
        int sizeWoman = womanDwarfName.length;
        int choiceWoman = rand.nextInt(sizeWoman);

        String[] clans = {"Балдерк", "Боевой Молот", "Горунн", "Данкил", "Железный Кулак", "Крепкая Наковальня",
                "Ледяная Борода", "Лодерр", "Лютгер", "Огненная Кузня", "Рамнахейм", "Стракелн", "Торунн", "Унгарт",
                "Холдерхек"};
        int sizeClans = clans.length;
        int choiceClans = rand.nextInt(sizeClans);

        if (gender == "Мужской")
            System.out.println(manDwarfName[choiceMan]);
        if (gender == "Женский")
            System.out.println(womanDwarfName[choiceWoman]);

        System.out.println("Клан: " + clans[choiceClans]);
    }

//====================================- имена эльфов -==================================================================
    public static void ElfsName(String gender)
    {
        Random rand = new Random();

        String[] manElfsName = {"Адран", "Арамиль", "Араннис", "Ауст", "Аэлар", "Бейро", "Берриан", "Варис",
                "Галинндан", "Ивеллиос", "Иммераль", "Каррик", "Куарион", "Лаусиан", "Миндартис", "Паэлиас", "Перен",
                "Риардон", "Ролен", "Совелисс", "Тамиорн", "Таривол", "Терен", "Хадарай", "Химо", "Хэйян", "Эниалис",
                "Эрдан", "Эреван"};
        int sizeMan = manElfsName.length;
        int choiceMan = rand.nextInt(sizeMan);

        String[] womanElfsName = {"Адрие", "Альтеа", "Анастрианна", "Андрасте", "Антинуа", "Бетринна", "Бирель",
                "Вадания", "Валанте", "Джеленетт", "Друсилиа", "Йелениа", "Каэлинн", "Квеленна", "Квиласи", "Кейлет",
                "Ксанафия", "Лешанна", "Лиа", "Миали", "Мэриэль", "Найвара", "Сариэль", "Силакви", "Теирастра", "Тиа",
                "Фелосиаль", "Шава", "Шанайра", "Энна"};
        int sizeWoman = womanElfsName.length;
        int choiceWoman = rand.nextInt(sizeWoman);

        String[] surnameElfs = {"Амакиир (Сверкающий Цветок)", "Амастасия (Звёздный Цветок)",
                "Галанодель (Лунный Шёпот)", "Ильфелкиир (Сверкающий Бутон)", "Ксилосент (Золотой Лепесток)",
                "Лиадон (Серебряный Лист)", "Найло (Ночной Бриз)", "Сианодель (Лунный Ручей)",
                "Холимион (Алмазная Роса)"};
        int sizeSurname = surnameElfs.length;
        int choiceSurname = rand.nextInt(sizeSurname);

        if (gender == "Мужской")
            System.out.println(manElfsName[choiceMan]);
        if (gender == "Женский")
            System.out.println(womanElfsName[choiceWoman]);

        System.out.println("Фамилия: " + surnameElfs[choiceSurname]);
    }

//====================================- имена полуросликов -============================================================
    public static void HalflingsName(String gender)
    {
        Random rand = new Random();

        String[] manHobbitsName = {"Альтон", "Андер", "Гаррет", "Кейд", "Коррин", "Лайл", "Линдал", "Майло", "Меррик",
                "Осборн", "Перрин", "Рид", "Роско", "Уэллби", "Финнан", "Элдон", "Эррих"};
        int sizeMan = manHobbitsName.length;
        int manChoice = rand.nextInt(sizeMan);

        String[] womanHobbitsName = {"Бри", "Вани", "Верна", "Джиллиан", "Китри", "Кора", "Кэлли", "Лавиния", "Лидда",
                "Мерла", "Недда", "Паэла", "Портия", "Серафина", "Трим", "Шаэна", "Эндри", "Юфемия"};
        int sizeWoman = womanHobbitsName.length;
        int womanChoice = rand.nextInt(sizeWoman);

        String[] hobbitsSurname = {"Вверхтормашкин", "Высокохолм", "Галькоброс", "Добробочка", "Зеленофляг",
                "Кустосбор", "Лугодуг", "Подветкин", "Репейник", "Чайнолист"};
        int sizeSurname = hobbitsSurname.length;
        int surnameChoice = rand.nextInt(sizeSurname);

        if (gender == "Мужской")
            System.out.println(manHobbitsName[manChoice]);
        if (gender == "Женский")
            System.out.println(womanHobbitsName[womanChoice]);

        System.out.println("Фамилия: " + hobbitsSurname[surnameChoice]);    // доработать сколение по гендеру
    }

//====================================- имена людей -===================================================================
    public static void HumansName(String gender)
    {
        Random rand = new Random();

        String[] etnos = {"Дамарец", "Иллусканец", "Калишит", "Мулан", "Рашеми", "Тетирец", "Тёрами", "Чондатанец",
                "Шу"};
        int sizeEtnos = etnos.length;
        int etnosChoice = rand.nextInt(sizeEtnos);

//****************************=- имена дамарцев -=**********************************************************************

        if (etnos[etnosChoice] == "Дамарец")
        {
            String[] manDamarName = {"Айвор", "Бор", "Глэр", "Григор", "Иган", "Козеф", "Миваль", "Орел", "Павел",
                    "Сергор", "Фодель"};
            int sizeManDamarName = manDamarName.length;
            int manDamarChoice = rand.nextInt(sizeManDamarName);

            String[] womanDamarName = {"Алетра", "Зора", "Кара", "Катернин", "Мара", "Натали", "Ольма", "Тана"};
            int sizeWomanDamarName = womanDamarName.length;
            int womanDamarChoice = rand.nextInt(sizeWomanDamarName);

            String[] surnameDamar = {"Берск", "Дотск", "Куленов", "Марск", "Немецк", "Стараг", "Чернин", "Шемов"};
            int sizeSurnameDamar = surnameDamar.length;
            int surnameDamarChoice = rand.nextInt(sizeSurnameDamar);

            if (gender == "Мужской")
                System.out.println(manDamarName[manDamarChoice]);
            if (gender == "Женский")
                System.out.println(womanDamarName[womanDamarChoice]);

            System.out.println("Фамилия: " + surnameDamar[surnameDamarChoice]);
        }

//****************************=- имена иллусканцев -=*******************************************************************
        if (etnos[etnosChoice] == "Иллусканец")
        {
            String[] manIlluskanName = {"Блас", "Бран", "Гет", "Ландер", "Лют", "Малсер", "Стор", "Таман", "Урт",
                    "Фрат", "Эндер"};
            int sizeManIlluskanName = manIlluskanName.length;
            int manIlluskanChoice = rand.nextInt(sizeManIlluskanName);

            String[] womanIlluskanName = {"Амафрея", "Бетха", "Вестра", "Кетра", "Мара", "Ольга", "Силифрей", "Цефрея"};
            int sizeWomanIlluskanName = womanIlluskanName.length;
            int womanIlluskanChoice = rand.nextInt(sizeWomanIlluskanName);

            String[] surnameIlluskan = {"Брайтвуд", "Виндривер", "Лакмэн", "Хелдер", "Хорнрейвен", "Штормвинд"};
            int sizeSurnameIlluskan = surnameIlluskan.length;
            int surnameIlluskanChoice = rand.nextInt(sizeSurnameIlluskan);

            if (gender == "Мужской")
                System.out.println(manIlluskanName[manIlluskanChoice]);
            if (gender == "Женский")
                System.out.println(womanIlluskanName[womanIlluskanChoice]);

            System.out.println("Фамилия: " + surnameIlluskan[surnameIlluskanChoice]);
        }

//****************************=- имена калишитов -=*********************************************************************
        if (etnos[etnosChoice] == "Калишит")
        {
            String[] manKalishitName = {"Асеир", "Бардеид", "Зашеир", "Кхемед", "Мехмен", "Судейман", "Хасеид"};
            int sizeManKalishitName = manKalishitName.length;
            int manKalishitChoice = rand.nextInt(sizeManKalishitName);

            String[] womanKalishitName = {"Атала", "Джасмаль", "Зашеида", "Мейлиль", "Сейдиль", "Сейпора", "Хама",
                    "Яшеира"};
            int sizeWomanKalishitName = womanKalishitName.length;
            int womanKalishitChoice = rand.nextInt(sizeWomanKalishitName);

            String[] surnameKalishit = {"Баша", "Джассан", "Думеин", "Кхалид", "Мостана", "Пашар", "Рейн"};
            int sizeKalishitSurname = surnameKalishit.length;
            int surnameKalishitChoice = rand.nextInt(sizeKalishitSurname);

            if (gender == "Мужской")
                System.out.println(manKalishitName[manKalishitChoice]);
            if (gender == "Женский")
                System.out.println(womanKalishitName[womanKalishitChoice]);

            System.out.println("Фамилия: " + surnameKalishit[surnameKalishitChoice]);
        }

//****************************=- имена муланов -=***********************************************************************
        if (etnos[etnosChoice] == "Мулан")
        {
            String[] manMulanName = {"Аот", "Барерис", "Кетот", "Му-мед", "Рамас", "Со-Кехур", "Тхазар-Де", "Урхур",
                    "Эхпут-Ки"};
            int sizeManMulanName = manMulanName.length;
            int manMulanChoice = rand.nextInt(sizeManMulanName);

            String[] womanMulanName = {"Аризима", "Золис", "Мурити", "Нефис", "Нулара", "Сефрис", "Тола", "Умара",
                    "Чатхи"};
            int sizeWomanMulanName = womanMulanName.length;
            int womanMulanChoice = rand.nextInt(sizeWomanMulanName);

            String[] surnameMulan = {"Анкхалаб", "Анскульд", "Натандем", "Серпет", "Уутракт", "Фезим", "Хахпет"};
            int sizeMulanSurname = surnameMulan.length;
            int surnameMulanChoice = rand.nextInt(sizeMulanSurname);

            if (gender == "Мужской")
                System.out.println(manMulanName[manMulanChoice]);
            if (gender == "Женский")
                System.out.println(womanMulanName[womanMulanChoice]);

            System.out.println("Фамилия: " + surnameMulan[surnameMulanChoice]);
        }

//****************************=- имена рашеми -=************************************************************************
        if (etnos[etnosChoice] == "Рашеми")
        {
            String[] manRashemiName = {"Боривик", "Владислак", "Джандар", "Канитар", "Мадислак", "Ральмевик",
                    "Фаургар", "Шаумар"};
            int sizeManRashemiName = manRashemiName.length;
            int manRashemiChoice = rand.nextInt(sizeManRashemiName);

            String[] womanRashemiName = {"Имзель", "Иммит", "Наварра", "Таммит", "Файварра", "Хульмарра", "Шеварра",
                    "Юльдра"};
            int sizeWomanRashemiName = womanRashemiName.length;
            int womanRashemiChoice = rand.nextInt(sizeWomanRashemiName);

            String[] surnameRashemi = {"Дайрнина", "Илтазяра", "Мурнитара", "Стаянога", "Улмокина", "Чергоба"};
            int sizeRashemiSurname = surnameRashemi.length;
            int surnameRashemiChoice = rand.nextInt(sizeRashemiSurname);

            if (gender == "Мужской")
                System.out.println(manRashemiName[manRashemiChoice]);
            if (gender == "Женский")
                System.out.println(womanRashemiName[womanRashemiChoice]);

            System.out.println("Фамилия: " + surnameRashemi[surnameRashemiChoice]);
        }

//****************************=- имена тетирийцев и чондатанцев -=******************************************************
        if ((etnos[etnosChoice] == "Тетирец") || (etnos[etnosChoice] == "Чондатанец"))
        {
            String[] manName = {"Горстаг", "Грим", "Дарвин", "Дорн", "Маларк", "Морн", "Рэндал", "Стедд", "Хельм",
                    "Эвендур"};
            int sizeManName = manName.length;
            int manChoice = rand.nextInt(sizeManName);

            String[] womanName = {"Арвин", "Джессаиль", "Керри", "Лурин", "Мири", "Рован", "Тесселе", "Шандри",
                    "Эсвель"};
            int sizeWomanName = womanName.length;
            int womanChoice = rand.nextInt(sizeWomanName);

            String[] surname = {"Бакмэн", "Грэйкасл", "Дандрэгон", "Толстаг", "Эвенвуд", "Эмблкроун"};
            int sizeSurname = surname.length;
            int surnameChoice = rand.nextInt(sizeSurname);

            if (gender == "Мужской")
                System.out.println(manName[manChoice]);
            if (gender == "Женский")
                System.out.println(womanName[womanChoice]);

            System.out.println("Фамилия: " + surname[surnameChoice]);
        }

//****************************=- имена тёрамийцев -=********************************************************************
        if (etnos[etnosChoice] == "Тёрами")
        {
            String[] manTeramiName = {"Антон", "Диеро", "Маркон", "Пьерон", "Римардо", "Ромеро", "Салазар", "Умберо"};
            int sizeManTeramiName = manTeramiName.length;
            int manTeramiChoice = rand.nextInt(sizeManTeramiName);

            String[] womanTeramiName = {"Балама", "Вонда", "Джалана", "Дона", "Куара", "Луиза", "Марта", "Селизе",
                    "Фаила"};
            int sizeWomanTeramiName = womanTeramiName.length;
            int womanTeramiChoice = rand.nextInt(sizeWomanTeramiName);

            String[] surnameTerami = {"Агосто", "Асторио", "Домине", "Калабра", "Маривальди", "Писакар", "Рамондо",
                    "Фалоне"};
            int sizeSurnameTerami = surnameTerami.length;
            int surnameTeramiChoice = rand.nextInt(sizeSurnameTerami);

            if (gender == "Мужской")
                System.out.println(manTeramiName[manTeramiChoice]);
            if (gender == "Женский")
                System.out.println(womanTeramiName[womanTeramiChoice]);

            System.out.println("Фамилия: " + surnameTerami[surnameTeramiChoice]);
        }

//****************************=- имена шу -=****************************************************************************
        if (etnos[etnosChoice] == "Шу")
        {
            String[] manShuName = {"Ан", "Вэнь", "Лонг", "Лянь", "Менг", "Он", "Фай", "Цзюн", "Цзянь", "Чен", "Чи",
                    "Шань", "Шуй"};
            int sizeManShuName = manShuName.length;
            int manShuChoice = rand.nextInt(sizeManShuName);

            String[] womanShuName = {"Бай", "Ксяо", "Лей", "Мей", "Тай", "Цзя", "Чао", "Шуй"};
            int sizeWomanShuName = womanShuName.length;
            int womanShuChoice = rand.nextInt(sizeWomanShuName);

            String[] surnameShu = {"Вань", "Као", "Кунг", "Лао", "Линг", "Мей", "Пинь", "Сум", "Тань", "Хуан", "Чиень",
                    "Шин"};
            int sizeSurnameShu = surnameShu.length;
            int surnameShuChoice = rand.nextInt(sizeSurnameShu);

            if (gender == "Мужской")
                System.out.println(manShuName[manShuChoice]);
            if (gender == "Женский")
                System.out.println(womanShuName[womanShuChoice]);

            System.out.println("Фамилия: " + surnameShu[surnameShuChoice]);
        }

        System.out.println("Этнос: " + etnos[etnosChoice]);
    }

//====================================- имена драконорожденных -========================================================
    public static void DragonbornName(String gender)
    {
        Random rand = new Random();

        String[] manDragonbornName = {"Арджхан", "Баласар", "Бхараш", "Гхеш", "Донаар", "Крив", "Медраш", "Мехен",
                "Надарр", "Панджед", "Патрин", "Рхогар", "Тархун", "Торинн", "Хескан", "Шамаш", "Шединн"};
        int sizeManDragonbornName = manDragonbornName.length;
        int manDragonbornChoice = rand.nextInt(sizeManDragonbornName);

        String[] womanDragonbornName = {"Акра", "Бири", "Даар", "Джхери", "Кава", "Коринн", "Мисханн", "Нала", "Перра",
                "Райанн", "Сора", "Сурина", "Тхава", "Уаджит", "Фаридэ", "Хавилар", "Харанн"};
        int sizeWomanDragonbornName = womanDragonbornName.length;
        int womanDragonbornChoice = rand.nextInt(sizeWomanDragonbornName);

        String[] clansDragonborn = {"Версисатургиеш", "Даардендриан", "Делмирев", "Драчедандион", "Кепешкмолик",
                "Керрилон", "Кимбатуул", "Клестинсиаллор", "Линксакасендалор", "Мястан", "Неммонис", "Нориксиус",
                "Офиншталажир", "Прексижандилин", "Турнурот", "Фенкенкаьрадон", "Шестенделиат", "Яржерит"};
        int sizeClansDragonborn = clansDragonborn.length;
        int clansDragonbornChoice = rand.nextInt(sizeClansDragonborn);

        if (gender == "Мужской")
            System.out.println(manDragonbornName[manDragonbornChoice]);
        if (gender == "Женский")
            System.out.println(womanDragonbornName[womanDragonbornChoice]);

        System.out.println("Клан: " + clansDragonborn[clansDragonbornChoice]);
    }

//====================================- имена гномов -==================================================================
    public static void GnomesName(String gender)
    {
        Random rand = new Random();

        String[] manGnomName = {"Алвин", "Алстон", "Боддинок", "Брок", "Бюргел", "Варрин", "Вренн", "Гербо", "Гимбл",
                "Глим", "Джебеддо", "Димбл", "Зук", "Келлен", "Намфудл", "Оррин", "Рундар", "Сибо", "Синдри", "Фонкин",
                "Фрюг", "Элдон", "Эрки"};
        int sizeManGnomName = manGnomName.length;
        int manGnomChoice = rand.nextInt(sizeManGnomName);

        String[] womanGnomName = {"Бимпноттин", "Брина", "Вейуокет", "Донелла", "Дувамил", "Занна", "Карамип",
                "Карлин", "Лилли", "Лорилла", "Лупмоттин", "Маднаб", "Никс", "Нисса", "Ода", "Орла", "Ройвин", "Тана",
                "Шамил", "Эливик", "Элиджобелл", "Элла"};
        int sizeWomanGnomName = womanGnomName.length;
        int womanGnomChoice = rand.nextInt(sizeWomanGnomName);

        String[] clanGnom = {"Берен", "Гаррик", "Даергел", "Мёрниг", "Накл", "Нингел", "Раулнор", "Тимберс", "Турен",
                "Фолькор", "Шеппен"};
        int sizeClanGnom = clanGnom.length;
        int clanGnomChoice = rand.nextInt(sizeClanGnom);

        String[] nicknameGnom = {"Барсук", "Босоног", "Двазамок", "Колотушка", "Ку", "Ним", "Пеплосерд", "Пивохлёб",
                "Плащ", "Пок", "Самоцвет", "Стамблдак", "Фниппер"};
        int sizeNicknameGnom = nicknameGnom.length;
        int nicknameGnomChoice = rand.nextInt(sizeNicknameGnom);

        if (gender == "Мужской")
            System.out.println(manGnomName[manGnomChoice]);
        if (gender == "Женский")
            System.out.println(womanGnomName[womanGnomChoice]);

        System.out.println("Клан: " + clanGnom[clanGnomChoice]);
        System.out.println("Прозвище: " + nicknameGnom[nicknameGnomChoice]);
    }

//====================================- имена полуэльфов -==============================================================
    public static void HalfElfs(String gender) // продумать, что бы не выходили кланы эльфов и этносы людей!!!
    {
        Random rand = new Random();
        int halfElfsChoice = (rand.nextInt(2) + 1);
        if (halfElfsChoice == 1)
            HumansName(gender);
        else
            ElfsName(gender);
    }

//====================================- имена полуорков -===============================================================
    public static void HalfOrks(String gender)
    {
        Random rand = new Random();

        String[] manHalfOrksName = {"Гел", "Денч", "Имш", "Кет", "Краск", "Муррен", "Ронт", "Токк", "Фенг", "Хенк",
                "Холг", "Шамп"};
        int sizeManHalfOrksName = manHalfOrksName.length;
        int manHalfOrksChoice = rand.nextInt(sizeManHalfOrksName);

        String[] womanHalfOrksName = {"Багги", "Вола", "Волен", "Евельда", "Кансиф", "Мев", "Нига", "Овак", "Оунка",
                "Сута", "Шаута", "Эмен", "Энгонг"};
        int sizeWomanHalfOrksName = womanHalfOrksName.length;
        int womanHalfOrksChoice = rand.nextInt(sizeWomanHalfOrksName);

        if (gender == "Мужской")
            System.out.println(manHalfOrksName[manHalfOrksChoice]);
        if (gender == "Женский")
            System.out.println(womanHalfOrksName[womanHalfOrksChoice]);
    }

//====================================- имена тифлингов -===============================================================
    public static void Tiflings(String gender)  // продумать как вписать "Инфернальное" перед именем!!!
    {
        Random rand = new Random();

        String[] manTiflingsName = {"Акменос", "Амнон", "Баракас", "Дамакос", "Йадос", "Кайрон", "Люцис", "Мелех",
                "Мордай", "Мортос", "Пелайос", "Скамос", "Терай", "Экемон"};
        int sizeManTiflingsName = manTiflingsName.length;
        int manTiflingsChoice = rand.nextInt(sizeManTiflingsName);

        String[] womanTiflingsName = {"Акта", "Анакис", "Брисеис", "Дамая", "Каллиста", "Криелла", "Лерисса",
                "Макария", "Немея", "Орианна", "Риета", "Фелая", "Эа"};
        int sizeWomanTiflingsName = womanTiflingsName.length;
        int womanTiflingsChoice = rand.nextInt(sizeWomanTiflingsName);

        String[] ideaNameTiflings = {"Безрассудство", "Вера", "Идеал", "Искусство", "Музыка", "Мука", "Надежда",
                "Напев", "Нигде", "Открытость", "Отчаяние", "Падаль", "Поиск", "Почтение", "Поэзия", "Превосходство",
                "Скорбь", "Слава", "Случайность", "Страх", "Усталость"};
        int sizeClansTiflings = ideaNameTiflings.length;
        int clansTiflingsChoice = rand.nextInt(sizeClansTiflings);

        if (gender == "Мужской")
            System.out.println(manTiflingsName[manTiflingsChoice]);
        if (gender == "Женский")
            System.out.println(womanTiflingsName[womanTiflingsChoice]);

        System.out.println("\"Идейное\" имя: " + ideaNameTiflings[clansTiflingsChoice]);
    }
//======================================================================================================================
}