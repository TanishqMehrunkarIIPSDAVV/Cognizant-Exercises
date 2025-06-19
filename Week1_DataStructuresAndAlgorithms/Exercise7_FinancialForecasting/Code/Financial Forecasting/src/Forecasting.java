public class Forecasting
{
    public static double futureValueRecursive(double principal, double rate, int periods)
    {
        if (periods == 0)
        {
            return principal;
        }
        return futureValueRecursive(principal * (1 + rate), rate, periods - 1);
    }

    public static double futureValueFormula(double principal, double rate, int periods)
    {
        return principal * Math.pow(1 + rate, periods);
    }

    public static void main(String[] args)
    {
        double principal = 1000.0;
        double rate = 0.10;
        int periods = 5;

        double recursiveResult = futureValueRecursive(principal, rate, periods);
        double formulaResult = futureValueFormula(principal, rate, periods);

        System.out.println("Future Value (Recursive): " + recursiveResult);
        System.out.println("Future Value (Formula): " + formulaResult);
    }
}