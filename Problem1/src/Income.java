import java.text.DecimalFormat;
import java.util.Scanner;
class Income
{
    public static void main(String args[]) {
        System.out.println("Problem 1 Taxable Income and Total Tax Payable");

        double income = 0;
        double totalIncome = 0;

        do {
            income = getIncome();
            if (income != -1) {
                totalIncome += income;
            }
        } while (income != -1 );

        DecimalFormat decFormat = new DecimalFormat("###,###");

        System.out.println("Total Taxable Income: " + decFormat.format(totalIncome));
        System.out.println("Total Tax Payable: " + decFormat.format(calculateTaxPayable(totalIncome)));
    }
    static double getIncome()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter taxable income ( or -1 to end ) : ");

        int income = 0;

        try {
            income = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input! Only Integers are accepted.");
            getIncome();
        }

        return income;
    }
    static double calculateTaxPayable(double i)
    {
        double tax;

        if (i <= 250000)
            tax = 0;
        else if (i <= 400000)
            tax = 0.20 *  (i - 250000);
        else if (i <= 800000)
            tax = (0.25 * (i - 400000)) + 30000;
        else if (i <= 2000000)
            tax = (0.30 * (i - 800000)) + 130000;
        else if (i <= 8000000)
            tax = (0.32 * (i - 2000000)) + 490000;
        else
            tax = (0.35 * (i - 80000000)) + 2410000;
        return tax;

    }
}
