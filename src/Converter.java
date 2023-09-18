public class Converter {

    double convertToKm (int steps) {
        double convertedStepsToKm = steps*0.75/1000;
        return convertedStepsToKm;
    }

    int convertStepsToKilocalories(int steps) {
        int convertedStepsToKilCal = steps*50/1000;
        return convertedStepsToKilCal;
    }
}
