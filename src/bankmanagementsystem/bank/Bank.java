package bankmanagementsystem.bank;
import java.util.*;
import static java.lang.Math.abs;

public abstract class Bank implements Attribute {
    private double balance;
    private double withdraw_amount;
    private double deposit_amount;

    public Bank() {

    }

    public void mainMenu(String mainMenu) {
        do {
            System.out.println(mainMenu);
            System.out.print("Choose: ");
            int selector = num.nextInt();
            if (selector == 0 || selector >= getChooser()) {
                System.out.println("   ---Invalid--- Exiting...\n");
                break;
            }
            mainMenu(selector);
        } while (true);
    }

    void mainMenu(int selector) {
        if (selector == 1) showAllUser();
        if (selector == 2) searchAcc_num();
        if (selector == 3) deposit();
        if (selector == 4) withdraw();
        if (selector == 5) showBalance();
    }

    private void withdraw() {
        if (getAcc_min_bal() >= (getAcc_balance() - getAcc_min_bal())) {
            System.out.println("Cannot withdraw! balance reached minimum withdrawal amount!");
            return;
        }
        System.out.println(" \n  ---Withdraw---");
        System.out.print(withdrawMessage.get());
        try {
            withdraw(num.nextDouble());
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("Enter a valid number!!!");
        }
    }
    public void withdraw(double withdraw_amount) {
        try {
            setWithdraw_amount(withdraw_amount);
            if (getWithdraw_amount() <= getAcc_balance() - getAcc_min_bal()) {
                setAcc_balance(balance -= getWithdraw_amount()); // Continuously deduct the withdrawal amount
                System.out.println("Withdrawn Successfully!");
                System.out.println("Withdrawn amount: " + getWithdraw_amount());
                System.out.println("New balance is: " + getAcc_balance() + "\n");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Minimum withdrawal amount is " + getAcc_min_bal());
        } catch (ArithmeticException e) {
            System.out.println("Withdraw amount exceeds to balance! available withdrawal below "
                    + (getAcc_balance() - getAcc_min_bal()));
        } catch (IllegalStateException e) {
            System.out.println("Can't withdraw leftover amount!, recommended withdrawal "
                    + (withdraw_amount - (abs(withdraw_amount)%100)));
        }
    }

    private void deposit() {
        System.out.println("\n   ---Deposit---");
        System.out.print(depositMessage.get());
        try {
            deposit(num.nextDouble());
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("Enter a valid number!!!");
        }
    }
    public void deposit(double deposit_amount) {
        try {
            setDeposit_amount(deposit_amount);
            setAcc_balance(balance += getDeposit_amount());
            System.out.println("Deposited amount: " + getDeposit_amount());
            System.out.println("New balance is: " + getAcc_balance() + "\n");
        } catch (IllegalArgumentException e) {
            System.out.printf("Minimum deposit amount is %d %n", getAcc_min_bal());
        } catch (IllegalStateException ise) {
            System.out.println("Can't deposit leftover amount!, recommended deposit " +
                    (deposit_amount - (abs(deposit_amount)%100)));
        }
    }

    private void showAllUser() {
        final HashMap<Integer, String> personDetails = Person.PersonHelper.generatePersonDetails();
        if (personDetails.isEmpty()) {
            System.out.println("Currently no person listed! ");
            return;
        }
        System.out.println("\n ---Display All---");
        for (Map.Entry<Integer, String> personDetail: personDetails.entrySet()) {
            System.out.println(personDetail.getKey() + "     " + personDetail.getValue());
        }
        System.out.println();
    }

    public void searchAcc_num() throws InputMismatchException, NullPointerException {
        System.out.println("\n   ---Search Account Number---");
        System.out.print(find_acc_numMessage.get());
        try {
            searchAcc_num(num.nextInt());
        } catch (InputMismatchException ime) {
            System.out.println("Enter a valid account number!!!");
        }
    }
    private void searchAcc_num(int acc_number){
        if (acc_nums.isEmpty()) {
            System.out.println("Currently no person listed! ");
            return;
        }
        int result = Collections.binarySearch(acc_nums, acc_number);
        final String resultSet = !(result < 0) ? "Account number found!: " + acc_nums.get(result) + " "
                + acc_names.get(result) : acc_numberMessage.get() + acc_number + " not found!";
        System.out.println(resultSet + "\n");
    }

    void showBalance() {
        System.out.println("\n   ---Account balance---: " + getAcc_balance() + "\n");
    }

    public Bank intro() {
        try {
            System.out.print(initial_balanceMessage.get());
            setAcc_balance(num.nextDouble());
        } catch (InputMismatchException e) {
            throw new IllegalStateException("Cannot proceed!!! balance has not been initialized!!!");
        }
        mainMenu(get_mainMenu());
        return this;
    }

    void setAcc_balance(double balance) {
        if (balance < getAcc_min_bal()) throw new IllegalArgumentException("Acceptable minimum balance is: " + getAcc_min_bal());
        if (((abs(balance)%100) / 10 != 0)) throw new IllegalArgumentException("Cannot proceed! leftover amount can't be deposited!");
        if (balance <= 0) throw new ArithmeticException("Account Closed!, Your balance reached 0!");
        this.balance = balance;
    }
    private void setWithdraw_amount(double withdraw_amount) {
        if (withdraw_amount < getAcc_min_bal()) throw new IllegalArgumentException();
        if (withdraw_amount >= (getAcc_balance() - getAcc_min_bal())) throw new ArithmeticException();
        if (((abs(withdraw_amount)%100) / 10 != 0)) throw new IllegalStateException();
        this.withdraw_amount = withdraw_amount;
    }
    private void setDeposit_amount(double deposit_amount) {
        if (deposit_amount < getAcc_min_bal()) throw new IllegalArgumentException();
        if (((abs(deposit_amount)%100) / 10 != 0)) throw new IllegalStateException();
        this.deposit_amount = deposit_amount;
    }
    abstract int getAcc_min_bal();
    abstract int getChooser();
    abstract String get_mainMenu();
    double getWithdraw_amount() {
        return withdraw_amount;
    }
    double getDeposit_amount() {
        return deposit_amount;
    }
    double getAcc_balance() {
        return balance;
    }
}


