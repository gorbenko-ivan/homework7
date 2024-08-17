public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");

        int accumulation = 2459000;
        int sum = 15000;
        int total = 0;
        int mouth = 0;
        while (total < accumulation) {
            total = total + sum;
            mouth++;
            System.out.println(" Месяц " + mouth + " сумма накоплений равна " + total + " рублей ");
        }


        System.out.println("Задача №2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println(" ");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }


        System.out.println(" ");
        System.out.println("Задача №3");
        int population = 12000000;
        int birthRateOn1000 = 17;
        ;
        int mortalityOn1000 = 8;
        for (int year = 1; year <= 10; year++) {

            population = (population / 1000 * (birthRateOn1000 - mortalityOn1000)) + population;

            System.out.println(" Год " + year + " численность населения составляет  " + population);
        }


        System.out.println(" ");
        System.out.println("Задача №4");
        double percent = 7;
        int accumulation1 = 12_000_000;
        sum = 15000;
        mouth = 0;
        while (sum < accumulation1) {
            sum = (int) (sum + (sum / 100 * percent));
            mouth++;
            System.out.println(" Месяц " + mouth + " сумма накоплений равна " + sum + " рублей ");
        }


        System.out.println(" ");
        System.out.println("Задача №5");
        percent = 7;
        accumulation1 = 12_000_000;
        sum = 15000;
        mouth = 0;
        while (sum < accumulation1) {
            sum = (int) (sum + (sum / 100 * percent));
            mouth++;
            if (mouth % 06 == 0) {
                System.out.println(" Месяц " + mouth + " сумма накоплений равна " + sum + " рублей ");
            }
        }


        System.out.println(" ");
        System.out.println("Задача №6");
        percent = 7;
        accumulation1 = 12_000_000;
        sum = 15000;
        int mouths = 12 * 9;
        mouth = 0;
        while (mouth < mouths) {
            sum = (int) (sum + (sum / 100 * percent));
            mouth++;
            if (mouth % 06 == 0) {
                System.out.println(" Месяц " + mouth + " сумма накоплений равна " + sum + " рублей ");
            }
        }


        System.out.println(" ");
        System.out.println("Задача №7");
        int firstFriday = 2;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница " + day + "-е число. Необходимо подготовить отчет");
        }


        System.out.println(" ");
        System.out.println("Задача №8");
        int period = 79;
        int starSeeing = 0;
        int curentYear = 2024;
        int start = curentYear - 200;
        int end = curentYear + 100;
        for (int year = starSeeing; year < end; year += period) {
            if (year > start) {
                System.out.println(year);
            }
        }
    }
}

