public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");
        int accumulation = 2459000;
        int sum = 15000;
        int total = 0;
        int mouth = 0;
        double percent = 1d / 100;
        while (total < accumulation) {
            total = total + sum;
            total = (int) (total * (1 + percent));
            mouth++;
            System.out.println(" Месяц " + mouth + " сумма накоплений равна " + total + " рублей ");
        }

        System.out.println("Задача №2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number > 0; number--) {
            System.out.print(number + " ");
        }

        System.out.println(" ");
        System.out.println("Задача №3");
        int population = 12000000;
        int birthRateOn1000 = 17;
        int mortalityOn1000 = 8;
        for (int year = 1; year <= 10; year++) {
            population = (population / 1000 * (birthRateOn1000 - mortalityOn1000)) + population;
            System.out.println(" Год " + year + " численность населения составляет  " + population);
        }

        System.out.println(" ");
        System.out.println("Задача №4");
        percent = 7d / 100;
        accumulation = 12000000;
        sum = 15000;
        mouth = 0;
        while (sum < accumulation) {
            sum = (int) (sum * (1 + percent));
            mouth++;
            System.out.println(" Месяц " + mouth + " сумма накоплений равна " + sum + " рублей ");
        }

        System.out.println(" ");
        System.out.println("Задача №5");
        sum = 15000;
        mouth = 0;
        while (sum < accumulation) {
            sum = (int) (sum * (1 + percent));
            mouth++;
            if (mouth % 6 == 0) {
                System.out.println(" Месяц " + mouth + " сумма накоплений равна " + sum + " рублей ");
            }
        }

        System.out.println(" ");
        System.out.println("Задача №6");
        sum = 15000;
        mouth = 0;
        int accumulationPeriod = 12 * 9;
        while (mouth < accumulationPeriod) {
            sum = (int) (sum * (1 + percent));
            mouth++;
            if (mouth % 6 == 0) {
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
        int currentYear = 2024;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = starSeeing; year < end; year += period) {
            if (year > start) {
                System.out.println(year);
            }
        }
    }
}

