public class CheckOnCorrectInput {

    public boolean isMonthInputCorrect (int numberOfMonth) {
        if (numberOfMonth > 0 && numberOfMonth < 12) {
            return true;
        } else {
            System.out.println("Вы ввели некорректный номер месяца");
            return false;
        }
    }

    public boolean isDayInputCorrect (int numberOfDay) {
        if (numberOfDay > 0 && numberOfDay < 31) {
            return true;
        } else {
            System.out.println("Вы ввели некорректный день");
            return false;
        }
    }

    public boolean isStepsInputCorrect (int countOfSteps) {
        if (countOfSteps > 0 && countOfSteps < 200000) {
            return true;
        } else {
            System.out.println("Вы ввели некорректное количество шагов");
            return false;
        }
    }

}
