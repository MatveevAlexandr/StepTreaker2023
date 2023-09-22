import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (command == 2) {
              stepTracker.changeStepGoal();
            } else if (command == 3) {
                System.out.println("Укажите месяц от 0 до 11 за который необходимо вывести статистику: ");
                int monthForStats = scanner.nextInt();
                    if (monthForStats < 0 || monthForStats > 11) {
                        System.out.println("Вы ввели некорректный номер месяца");
                    } else {
                        stepTracker.printStatistic(monthForStats);
                    }
            } else if (command == 0) {
                System.out.println("Пока!");
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }

    }
    public static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println ("1 - Ввести количество шагов за определённый день");
        System.out.println ("2 - Изменить цель по количеству шагов в день");
        System.out.println ("3 - Напечатать статистику за определённый месяц");
        System.out.println ("0 - выйти из приложения");
    }
}