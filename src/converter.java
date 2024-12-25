public class converter 
{
    public static double usd;

    public double euroToUSD(double amt)
    {
        System.out.format("Euros to US Dollars: %.2f", (amt*1.0404));
        return amt;
    }

    public double yenToUSD(double amt)
    {
        System.out.format("Yen to US Dollars: %.2f", (amt*0.0064));
        return amt;
    }

    public double poundsToUSD(double amt)
    {
        System.out.format("Yen to US Dollars: %.2f", (amt*1.2542));
        return amt;
    }

    public double rupeesToUSD(double amt)
    {
        System.out.format("Rupees to US Dollars: %.2f", (amt*.012));
        return amt;
    }

    public double audToUSD(double amt)
    {
        System.out.format("Australian Dollars to US Dollars: %.2f", (amt*0.6236));
        return amt;
    }

    public double cadToUSD(double amt)
    {
        System.out.format("Canadian Dollars to US Dollars: %.2f", (amt*0.6965));
        return amt;
    }
}
