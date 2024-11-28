package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double buyDollar(double dollar, double quantity){
        return dollar*quantity+(quantity*IOF);
    }
}
