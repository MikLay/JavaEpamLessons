package factorials;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter the n: ");
        long n = input.nextLong();
        NumberFormat formatter = new DecimalFormat("0.######E0", DecimalFormatSymbols.getInstance(Locale.ROOT));
        String result = formatter.format(factorialBig(n));
        System.out.println("Factorial of: "  +n +"\nIs: "+result);
    }


    private static BigInteger factorialBig(long n)
    {
        BigInteger result = BigInteger.ONE;
        for(;n > 1; n--)
        {
            result =result.multiply(BigInteger.valueOf(n));
        }
        return result;
    }
}
