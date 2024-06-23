public class compoundInterestCalc {

    public static double calculate(int principal, int time, int rate){

        double annualRate = rate / 100;

        // Calculate compound interest
        double amount = principal * Math.pow(1 + annualRate, time);

        return amount;
    }
}
