import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        MonthData monthData = new MonthData();

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {

            } else if (command == 2) {
              stepTracker.changeStepGoal();
            } else if (command == 3) {
                monthData.printDaysAndStepsFromMonth();
                System.out.println("Сумма шагов за месяц: " + monthData.sumStepsFromMonth());
                System.out.println("Максимальное количество шагов: " + monthData.maxSteps());
                System.out.println("Лучшая серия: " + monthData.bestSeries(stepTracker.goalByStepsPerDay));
            } else if (command == 0) {
                System.out.println("Пока!");
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }

    }
    public static void printMenu() {
        System.out.println("Что вы хотите сделать?" +
                "1 - Ввести количество шагов за определённый день" +
                "2 - Изменить цель по количеству шагов в день" +
                "3 - Напечатать статистику за определённый месяц" +
                "0 - выйти из приложения");
    }
}