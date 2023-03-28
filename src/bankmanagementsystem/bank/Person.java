package bankmanagementsystem.bank;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Person implements Attribute {
    private String acc_name;
    private int acc_number;
    private final Bank[] acc_bankType = new Bank[2];
    private final static List<Person> personList = new ArrayList<>();
    private final static HashMap<Integer, String> personDetails = new HashMap<>();
    private final static HashMap<Integer, Person> user = new HashMap<>();

    public Person () {
    }

    Person setPersonDetails() {
        try {
            setAcc_name();
            setAcc_number();
            personDetails.putIfAbsent(getAcc_number(), getAcc_name());
        } catch (InputMismatchException ime) {
            System.out.println("Enter a valid value! Reenter your acc_name and acc_number!");
            setPersonDetails();
        }
        return this;
    }

    private void setAcc_name() {
        System.out.print(acc_nameMessage.get());
        Scanner str = new Scanner(System.in);
        setAcc_name(str.nextLine());
    }

    private void setAcc_number() throws InputMismatchException {
        System.out.print(acc_numberMessage.get());
        Scanner num = new Scanner(System.in);
        setAcc_number(num.nextInt());
    }

    private void setAcc_bankType() throws NullPointerException {
        try {
            if (acc_bankType[0] != null && acc_bankType[1] != null) {
                throw new IllegalStateException("Cannot proceed!!! User already opened both of the available bank type!!!");
            }
            System.out.print(acc_bankTypeMessage.get());
            int selector = num.nextInt();
            if (selector != 1 && selector != 2)
                throw new IllegalArgumentException("Cannot proceed!!! no bank type selected!!!");
            setAcc_bankType(selector == 1 ? new CurrentAccount() : new SavingsAccount());
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid account balance!!!");
        } catch (Exception npe) {
            System.out.println(npe.getMessage());
        }
    }

    private void setAcc_name(String acc_name) {
        this.acc_name = acc_name;
        acc_names.add(getAcc_name());
    }

    private void setAcc_number(int acc_number) {
        if (personDetails.containsKey(acc_number))
            throw new IllegalArgumentException(String.format("Cannot proceed! Account number %d already been used!!! " +
                    "Reenter your acc_name and acc_number!!!", acc_number));
        this.acc_number = acc_number;
        acc_nums.add(getAcc_number());
    }

    private void setAcc_bankType(Bank bankType) {
        try {
            checkDoubleInstanceBank(acc_bankType[0], bankType);
            if (acc_bankType[0] == null) {
                this.acc_bankType[0] = bankType.intro();
            } else {
                this.acc_bankType[1] = bankType.intro();
            }
        } catch (MalformedParameterizedTypeException mpe) {
            System.out.println(mpe.getMessage());
        }
    }

    private void checkDoubleInstanceBank(Bank f_bank, Bank incomingBank) {
        BiPredicate<Bank, Bank> current = (bank1, bank2) -> bank1 instanceof CurrentAccount
                && bank2 instanceof CurrentAccount;
        BiPredicate<Bank, Bank> savings = (bank1, bank2) -> bank1 instanceof SavingsAccount
                && bank2 instanceof SavingsAccount;
        if (current.or(savings).test(f_bank, incomingBank))
            throw new MalformedParameterizedTypeException("Cannot open twice of the same bank type per user!!!");
    }

    public String getAcc_name() {
        return acc_name;
    }
    public int getAcc_number() {
        return acc_number;
    }
    public Bank[] getAcc_bankType() throws NullPointerException {
        return acc_bankType;
    }

    @Override
    public String toString() {
        return "Person{" +
                "acc_name='" + acc_name + '\'' +
                ", acc_number=" + acc_number +
                ", acc_bankType=" + Arrays.stream(acc_bankType) +
                '}';
    }

    public abstract static class PersonHelper {
        private static int number;

        public static void howManyUser(int numberOfUser) {
            if (numberOfUser <= 0) throw new IllegalArgumentException("Cannot proceed! at least 1 person must be listed");
            System.out.println("----User Registration----");
            for (int i = 0; i < numberOfUser; i++) {
                personList.add(new Person().setPersonDetails());
            }
            personList.forEach(person -> user.putIfAbsent(person.getAcc_number(), person));
        }

        public static void openAccount() {
            if (personList.isEmpty()) throw new NullPointerException("No person listed!!! howManyUser(int numberOfUser) must be called first!!!");
            try {
                System.out.print("Select person you want to open an account: ");
                openAccount(recursiveNumber());
            } catch (NullPointerException e) {
                System.out.printf("Account number %d doesn't exist! select only within registered users!%n", PersonHelper.number);
            } catch (InputMismatchException ime) {
                System.out.println("Enter a valid account number: open account");
            } catch (IllegalAccessException e) {
                System.out.println(e.getMessage());
            }
        }

        private static void openAccount(int acc_number) throws IllegalAccessException {
            Person client = user.get(acc_number);
            System.out.printf("%nOpen an account for %s with account number of %d %n" ,client.getAcc_name(), client.getAcc_number());
            System.out.printf("   ---%s Bank---%n", personDetails.get(acc_number));
            client.setAcc_bankType();
        }

        public static void selectPerson() {
            if (personList.isEmpty()) throw new NullPointerException("No person listed!!! openAccount() must be called first!!!");
            try {
                System.out.print("Select person you want to modify: ");
                selectPerson(recursiveNumber());
            } catch (NullPointerException | IllegalAccessException npe) {
                System.out.println(npe.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid account number: select person");
            }
        }

        private static void selectPerson(int acc_number) throws IllegalAccessException, InputMismatchException {
            if (!user.containsKey(acc_number)) throw new NullPointerException("Selected user doesn't exist!!!");
            Person client = user.get(acc_number);
            Predicate<Person> checkAccount = person -> person.getAcc_bankType()[0] == null
                    && person.getAcc_bankType()[1] == null;
            if (checkAccount.test(client)) throw new NullPointerException("Selected user doesn't have account yet!!!");
            Bank clientBank = selectPersonBank(client);
            if (clientBank == null) {
                System.out.println("Selected bank is not yet been open!!!");
                return;
            }
            System.out.printf("---%s's %s Bank---%n", client.getAcc_name(), clientBank.getClass().getSimpleName());
            clientBank.mainMenu(clientBank.get_mainMenu());
        }

        private static Bank selectPersonBank(Person client) {
            Bank bank1 = client.getAcc_bankType()[0];
            Bank bank2 = client.getAcc_bankType()[1];
            try {
                System.out.println("1. " + bank1.getClass().getSimpleName());
                System.out.println("2. " + bank2.getClass().getSimpleName());
            } catch (InputMismatchException ime) {
                System.out.println("Choose only within the selectors!!!");
            } catch (NullPointerException npe) {
                System.out.println(npe.getMessage());
            }
            System.out.print("Bank you want to modify: ");
            Scanner num = new Scanner(System.in);
            return num.nextInt() == 1 ? bank1 : bank2;
        }

        public static HashMap<Integer, String> generatePersonDetails() {
            return personDetails;
        }

        private static int recursiveNumber() {
            try {
                Scanner in = new Scanner(System.in);
                PersonHelper.number = in.nextInt();
                return PersonHelper.number;
            } catch (InputMismatchException ime) {
                System.out.print("Enter a valid account number: recirsve number");
                return recursiveNumber();
            }
        }
    }
}
