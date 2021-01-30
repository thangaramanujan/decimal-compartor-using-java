public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        int num1 = (int) (number1 * 100);
        int num2 = (int) (number2 + 100);

        if (num1 == num2) {
            return true;
        }
        return false;
    }
}
