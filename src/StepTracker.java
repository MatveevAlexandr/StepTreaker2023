import java.util.Scanner;

public class StepTracker {
    Scanner scanner;

    /*Добавьте поле monthToData c типом «массив объектов класса MonthData»
    и присвойте ему пустой массив с размером в 12 элементов.*/
    MonthData[] monthToData = new MonthData[12];
    MonthData monthData = new MonthData();
    Converter converter = new Converter();
    int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();

        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца от 1 до 12");
        Scanner scanner = new Scanner(System.in);
        int numberOfMonth = scanner.nextInt();
        if (numberOfMonth < 0 || numberOfMonth > 13) {
            System.out.println("Вы ввели некорректный номер месяца");
            return;
        }
        System.out.println("Введите день от 1 до 30 (включительно)");
        int numberOfDay = scanner.nextInt();
        if (numberOfDay < 0 || numberOfDay > 30) {
            System.out.println("Вы ввели некорректный день");
            return;
        }
        System.out.println("Введите количество шагов");
        int countOfSteps = scanner.nextInt();
        if (countOfSteps < 0 || countOfSteps > 100000) {
            System.out.println("Вы ввели некорректное число шагов");
            return;
        }
    }
    void changeStepGoal() {
        System.out.println("Введите целевое количество шагов");
        Scanner scanner = new Scanner(System.in);
        goalByStepsPerDay = scanner.nextInt();
    }

    void printStatistic(int numberOfMonth) {
        monthToData[numberOfMonth].printDaysAndStepsFromMonth(); // количество пройденных шагов по дням;
        System.out.println("Сумма шагов за месяц: " + monthToData[numberOfMonth].sumStepsFromMonth()); // общее количество шагов за месяц;
        System.out.println("Максимальное количество шагов: " + monthToData[numberOfMonth].maxSteps()); // максимальное пройденное количество шагов в месяце;
        System.out.println("Среднее количество шагов в месяце " + numberOfMonth +": " + (monthToData[numberOfMonth].sumStepsFromMonth() /30)); // среднее количество шагов;
        System.out.println("Пройденная дистанция (в км): " + converter.convertToKm(monthToData[numberOfMonth].sumStepsFromMonth()));// пройденная дистанция (в км);
        System.out.println("Количество сожжённых килокалорий: " + converter.convertStepsToKilocalories(monthToData[numberOfMonth].sumStepsFromMonth())););// количество сожжённых килокалорий;
        System.out.println("Лучшая серия: " + monthToData[numberOfMonth].bestSeries(goalByStepsPerDay)); // лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было равно или выше целевого.
    }
}
