public class SIPCalculator {

    public static double calculate(int amount, int noOfSIP, int rate, int years){

        double monthlyRate = rate / 12 / 100;
        // Total number of months
        int totalMonths = years * 12;

        double futureValue = 0;

        for (int i = 0; i < totalMonths; i++) {
            // Future value for each installment
            futureValue += amount * Math.pow(1 + monthlyRate, totalMonths - i);
        }

        return futureValue;
    }
}
