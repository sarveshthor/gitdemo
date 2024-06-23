public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        int years = 0;
        System.out.println("Addition -> " + Calculator.add(10,15));
        System.out.println("compound interest calculation-> "+ compoundInterestCalc.calculate(1000, 3, 2));
        System.out.println("SIP-> " + SIPCalculator.calculate(100, 10, 34, 30));

    }
}
