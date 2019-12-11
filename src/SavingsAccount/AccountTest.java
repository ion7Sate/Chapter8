package SavingsAccount;
import static SavingsAccount.SavingsAccount.modifyInterestRate;

public class AccountTest {
    public static void main(String[] args) {
        modifyInterestRate(4);
        SavingsAccount saver1 = new SavingsAccount(1100);
        SavingsAccount saver2 = new SavingsAccount(2350);
        for (int i = 0; i < 12; i++) {
            saver1.calculateMonthlyRate();
            System.out.printf("Saver1 Month %d, Balance %.2f%n", i + 1, saver1.getSavingsBalance());
        }
        modifyInterestRate(5);
        for (int i = 0; i < 12; i++) {
            saver2.calculateMonthlyRate();
            System.out.printf("Saver2 Month %d, Balance %.2f%n", i + 1, saver2.getSavingsBalance());
        }
        System.out.println();
        saver1.calculateMonthlyRate();
        saver2.calculateMonthlyRate();
        System.out.printf("Saver1's balance for next interest month with 5 percents is %.2f%n",saver1.getSavingsBalance());
        System.out.printf("Saver2's balance for next interest month with 5 percents is %.2f%n",saver2.getSavingsBalance());
    }
}
