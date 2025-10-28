import java.util.Scanner;
import java.text.DecimalFormat;

public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double initialBalance = input.nextDouble();

        double[] interestRates = {0.02, 0.03, 0.04, 0.05};

        for (double rate : interestRates) {
            double balance = initialBalance;

            System.out.printf("%nWith an initial balance of %.1f at an interest rate of %.2f%n", initialBalance, rate);

            for (int year = 1; year <= 4; year++) {
                balance += balance * rate;

                DecimalFormat formatter;
                if (year == 1 || year == 2) {
                    formatter = new DecimalFormat("0.0");
                } else if (year == 3) {
                    formatter = new DecimalFormat("0.00");
                } else {
                    formatter = new DecimalFormat("0.0000########");
                }

                String formattedBalance = formatter.format(balance);
                System.out.println("After year " + year + " balance is " + formattedBalance);
            }
        }

        System.out.println("\n----GRASP: Operation complete.");
    }
}
