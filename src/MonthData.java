public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 1; i < days.length; i++) {
            System.out.println( (i) + " день: " + days[i]);
        }
    }

    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps += days[i];
        }
        return sumSteps;
    }

    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            if (maxSteps < days[i]){
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }
    int bestSeries(int goalStepsPerDay) {
        int finalSeries = 0;
        int currentSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] >= goalStepsPerDay) {
                currentSeries++;
                if (currentSeries >= finalSeries){
                    finalSeries = currentSeries;
                }
            } else {
                currentSeries = 0;
            }
        }
        return finalSeries;
    }
}
