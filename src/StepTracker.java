import java.util.Scanner;

public class StepTracker {
    Scanner scanner;

    /*Добавьте поле monthToData c типом «массив объектов класса MonthData»
    и присвойте ему пустой массив с размером в 12 элементов.*/
    MonthData[] monthToData = new MonthData[12];

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
        if (numberOfMonth < 0 || numberOfMonth > 13 ) {
            System.out.println("Вы ввели некорректный номер месяца");
            return;
        }
    }
}
