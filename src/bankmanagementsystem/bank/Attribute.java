package bankmanagementsystem.bank;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Supplier;

interface Attribute {
    ArrayList<String> acc_names = new ArrayList<>();
    ArrayList <Integer> acc_nums = new ArrayList<>();
    Scanner num = new Scanner(System.in);


    Supplier<String> acc_numberMessage = () ->  "Account number: ";
    Supplier<String> acc_bankTypeMessage = () -> """
            1. CurrentAccount
            2. SavingsAccount
            Select bank type:\040""";
    Supplier<String> acc_nameMessage = () ->  "Account name: ";
    Supplier<String> withdrawMessage = () -> "Withdraw amount: ";
    Supplier<String> depositMessage = () -> "Deposit amount: ";
    Supplier<String> find_acc_numMessage = () -> "Find account number: ";
    Supplier<String> initial_balanceMessage = () -> "Account initial balance: ";

    Supplier<String> current_mainMenu = () -> """
                ----Main Menu-----
            1. Display All
            2. Search By Account
            3. Deposit
            4. Withdraw
            5. Check Balance
            0. Exit""";

    Supplier<String> savings_mainMenu = () -> """
                    ----Main Menu-----
                1. Display All
                2. Search By Account
                3. Deposit
                4. Withdraw
                5. Check Balance
                6. Interest Rate
                0. Exit""";
}
