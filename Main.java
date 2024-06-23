public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Addition -> " + Calculator.add(10,15));
        System.out.println("Interest calculation-> " + InterestCalculator.calculate(5000,6,10));
        System.out.println("compound interest calculation-> "+ compoundInterestCalc.calculate(1000, 3, 2));
    }
}
