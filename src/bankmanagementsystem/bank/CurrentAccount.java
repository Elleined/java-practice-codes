package bankmanagementsystem.bank;

public final class CurrentAccount extends Bank {

    public CurrentAccount() {
        super();
    }

    @Override
    public CurrentAccount intro() {
        System.out.println("-----Current Account-----");
        super.intro();
        return this;
    }

    @Override
    int getAcc_min_bal(){
        return 1000;
    }
    @Override
    int getChooser() {
        return 6;
    }
    @Override
    String get_mainMenu() {
        return current_mainMenu.get();
    }
}

// Ordering a new check book
//    below maintaning balanca
//    closing fee
//    dormancy fee
//    returned checks
//    bank statement reprinting
//    stop payment order
// no interest