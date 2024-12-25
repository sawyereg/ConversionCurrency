import java.util.Scanner;

public class CurrencyConverter
{
    public static void main(String[] args) throws Exception 
    {
        converter cv = new converter();
        Scanner sc = new Scanner(System.in);
        System.out.println("What Currency are you wanting to convert to usd? (please type in lowercase)");
        System.out.println("Options are euro, yen, pounds, rupees, aud, and cad");
        String input = sc.nextLine();
        System.out.println("Enter the amount you would like to convert: ");
        Double amount = sc.nextDouble();

            switch (input)
            {
                case "euro":
                cv.euroToUSD(amount);
                break;

                case "yen":
                cv.yenToUSD(amount);
                break;

                case "pounds":
                cv.poundsToUSD(amount);
                break;

                case "rupees":
                cv.rupeesToUSD(amount);
                break;

                case "aud":
                cv.audToUSD(amount);
                break;

                case "cad":
                cv.cadToUSD(amount);
                break;
        }
        sc.close();
    }
}
