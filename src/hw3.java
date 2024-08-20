import org.w3c.dom.ls.LSOutput;

public class hw3 {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float maleName = 3.4f;
        double g = 6;

        double allSum = a + b + c + d + maleName + g;

        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной maleName с типом float равно " + maleName);
        System.out.println("Значение переменной g с типом double равно " + g);
        System.out.println("Значение переменной allSum с типом double равно " + String.format("%.3f", allSum));

        //Task 2
        System.out.println("\n");
        System.out.println("Task 2");
        float k = 27.12f;
        long j = 987678965549L;
        short p = 2786;
        short o = 569;
        short l = -159;
        short h = 27897;
        byte w = 67;

        allSum = k + j + p + o + l + h + w;
        System.out.println("Значение переменной allSum равно " + String.format("%.3f", allSum));

        //Task 3
        System.out.println("\n");
        System.out.println("Task 3");

        byte k1 = 23;
        byte k2 = 27;
        byte k3 = 30;
        short allPaper = 480;

        byte allPupils = (byte) (k1 + k2 + k3);
        short onePupil = (short) (allPaper / allPupils);

        System.out.println("Всего учеников в трёх классах " + allPupils + " учеников.");
        System.out.println("На каждого ученика рассчитано " + onePupil + " листов бумаги.");

        //Task 4
        System.out.println("\n");
        System.out.println("Task 4");

        byte min2 = 16;
        //Bottles for 1 min
        byte min1= (byte) (min2 / 2);
        System.out.println("За 1 минуту машина произвела " + min1 + " штук бутылок.");

        short min20 = (short) (min1 * 20);
        System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок.");

        short day = (short) (min1 * 60 * 24);
        System.out.println("За 1 день машина произвела " + day + " штук бутылок.");

        int day3 = day * 3;
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок.");

        int day30 = day * 30;
        System.out.println("За месяц машина произвела " + day30 + " штук бутылок.");

        //Task 5
        System.out.println("\n");
        System.out.println("Task 5");

        byte allPaint = 120;
        //120 = n(2w+4b)
        byte classesCount = (byte) (allPaint / 6);
        byte white = (byte) (classesCount * 2);
        byte brown = (byte) (classesCount * 4);
        System.out.println("В школе, где " + classesCount + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски.");

        //Task 6
        System.out.println("\n");
        System.out.println("Task 6");

        byte banana = 80;
        byte milk = 105;
        byte ice = 100;
        byte egg = 70;

        short fullWeight = (short) (5 * banana + 2 * milk + 2 * ice + 4 * egg);
        System.out.println("Общий вес спортзавтрака равен " + fullWeight + " гр. Или же " + fullWeight / 1000 + "кг " + fullWeight % 1000 + " гр.");

        //Task 7
        System.out.println("\n");
        System.out.println("Task 7");

        short lostWeight = 7*1000;
        short lost1 = 250;
        short lost2 = 500;

        short dayLost1 = (short) (lostWeight / lost1);
        short dayLost2 = (short) (lostWeight / lost2);
        System.out.println("Для того, чтобы похудеть на 7 кг по 250 гр./день, необходимо " + dayLost1 + " дней.");
        System.out.println("Для того, чтобы похудеть на 7 кг по 500 гр./день, необходимо " + dayLost2 + " дней.");

        //Task 8
        System.out.println("\n");
        System.out.println("Task 8");

        int mpayMasha = 67760;
        int mpayDenis = 83690;
        int mpayKris = 76230;

        int ypayMasha1 = mpayMasha * 12;
        int ypayDenis1 = mpayDenis * 12;
        int ypayKris1 = mpayKris * 12;

        //Salary + 10%
        mpayMasha = (int) (mpayMasha + mpayMasha * 0.1);
        mpayDenis = (int) (mpayDenis + mpayDenis * 0.1);
        mpayKris = (int) (mpayKris + mpayKris * 0.1);
        //System.out.println(mpayMasha);
        //System.out.println(mpayDenis);
        //System.out.println(mpayKris);

        int ypayMasha2 = mpayMasha * 12;
        int ypayDenis2 = mpayDenis * 12;
        int ypayKris2= mpayKris * 12;

        //Difference between salaries
        int ypayMasha = ypayMasha2 - ypayMasha1;
        int ypayDenis = ypayDenis2 - ypayDenis1;
        int ypayKris = ypayKris2 - ypayKris1;

        System.out.println("Маша теперь получает " + mpayMasha + " рублей. Годовой доход вырос на " + ypayMasha + " рублей.");
        System.out.println("Денис теперь получает " + mpayDenis + " рублей. Годовой доход вырос на " + ypayDenis + " рубля.");
        System.out.println("Кристина теперь получает " + mpayKris + " рублей. Годовой доход вырос на " + ypayKris + " рублей.");


    }
}