public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача №1");
        int i = 0;
        int money = 0;
        while (money <= 2_459_000) {
            money += 15000;
            i++;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей\n", i, money);
            System.out.println("Всего месяцев потребуется " + i);
        }

        System.out.println("Задача №2");
        int a = 1;
        while (a <= 10) {
            System.out.print(" " + a + " ");
            a = a + 1;
        }
        System.out.println();
        for (int b = 10; b >= 1; b--) {
            System.out.print(" " + b + " ");
        }

        System.out.println();

        System.out.println("Задача №3");
        int peopleAmount = 12_000_000;
        int birthRate = 17;
        int die = 8;
        int difference = birthRate - die;
        int birthRateYear = (peopleAmount * difference) / 1000;
        for (i = 1; i <= 10; i++, peopleAmount += birthRateYear) {

            System.out.printf("Год %s, численность населения составляет %s\n", i, peopleAmount);
        }

        System.out.println("Задача №4");
        for (int mounth = 1, contribution = 15000; contribution <= 12_000_000; mounth++,contribution = (int) (contribution * 1.07)) {

            System.out.printf("Месяц %s, сумма накоплений равна %s рублей\n", mounth, contribution);
            System.out.println("Всего месяцев потребуется " + mounth);
        }

        System.out.println("Задача №5");
        for (int mounth = 1, contribution = 15000; contribution <= 12_000_000; mounth++) {
            contribution = (int) (contribution * 1.07);
            if (mounth % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %s рублей\n", mounth, contribution);
                System.out.println("Всего месяцев потребуется " + mounth);
            }

        }

        System.out.println("Задача №6");
        double contribution = 15000;
        int mounthNineYears = 9 * 12;
        for (double mounth = 1; mounth <= mounthNineYears; mounth += 0.5) {
            contribution =  contribution * 1.07;
            System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей\n", mounth, contribution);

        }
        System.out.println("Задача №7");
            for (int day = 5; day <= 31; day++) {
                if (day % 5 == 0) {
                    System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет\n", day);
                }
            }
        System.out.println("Задача №8");
            int nowYear=2024;
            int beforeYear=nowYear-200;
            int afterYear=nowYear+100;
            for (int year = 0; year <afterYear; year++) {
                if (year >beforeYear && year %79==0) {
                    System.out.println(year);
                }
            }

    }
}