package bankmanagementsystem.bank;

public final class SavingsAccount extends Bank {
    final double INTEREST_RATE = 1.3; // Can be edited

    public SavingsAccount() {
        super();
    }

    @Override
    public SavingsAccount intro() {
        System.out.println("-----Savings Account-----");
        super.intro();
        return this;
    }

    private void calculateInterestRate(){
        System.out.println("   ---Interest Rate---");
        double interest_value;
        System.out.print("Time duration (in years): ");
        final int time_duration_by_years =  num.nextInt();
        interest_value = (int) (getAcc_balance() * INTEREST_RATE/100 * time_duration_by_years);
        System.out.print("Interest rate: " + interest_value + " for your current balance: " + getAcc_balance() + "\n");
    }

    @Override
    void mainMenu(int selector) {
        super.mainMenu(selector);
        if (selector == 6) calculateInterestRate();
    }

    @Override
    int getAcc_min_bal(){
        return 500;
    }
    @Override
    int getChooser() {
        return 7;
    }
    @Override
    String get_mainMenu() {
        return savings_mainMenu.get();
    }
}
