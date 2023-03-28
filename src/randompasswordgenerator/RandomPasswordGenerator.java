package randompasswordgenerator;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RandomPasswordGenerator {
    private static final List<StringBuilder> passwords = new ArrayList<>();
    private static final List<Character> consonants = new ArrayList<>();
    private static final List<Character> vowels = new ArrayList<>();

    public RandomPasswordGenerator() {

    }

    public RandomPasswordGenerator generatePassword() {
        final Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        final List<Integer> arrayNum = Arrays.asList(numbers);
        final Character[] consonant = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p',
                'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        final Character[] vowel = {'a', 'e', 'i', 'o', 'u'}; // vowels another method
        final Character[] specialChar = {'@', '#', '$', '_', '/' };
        final List<Character> specialCharacters = Arrays.asList(specialChar);

        shuffleLists(arrayNum, consonant, vowel, specialCharacters);
        // printShuffleLists(arrayNum, specialCharacters);
        generateRandomPassword(arrayNum, consonant, vowel, specialCharacters);
        System.out.println(getGenerateRandomPassword());
        return this;
    }

    public static String getGenerateRandomPassword() {
        return "Generated password: " + passwords.get(0);
    }

    private static void generateRandomPassword(List<Integer> arrayNum,
                                               Character[] arrayConsonants,
                                               Character[] arrayVowels,
                                               List<Character> arraySpecialCharacters) {
        final Random random = new Random();
        final Supplier<Integer> numberElement = () -> random.nextInt(arrayNum.size());
        final Supplier<Integer> consonantElement = () -> random.nextInt(arrayConsonants.length);
        final Supplier<Integer> vowelElement = () -> random.nextInt(arrayVowels.length);
        final Supplier<Integer> specialCharElement = () -> random.nextInt(arraySpecialCharacters.size());

        final StringBuilder password = new StringBuilder();
        char sc = arraySpecialCharacters.get(specialCharElement.get());
        password.append(sc);
        for (int i = 0; i < 3; i++){
            int n = arrayNum.get(numberElement.get());
            char c = consonants.get(consonantElement.get());
            char v = vowels.get(vowelElement.get());
            password.append(c);
            password.append(v);
            password.append(n);
        }
        passwords.add(password);
    }

    private static void printShuffleLists(List<Integer> arrayNum,
                                          List<Character> arraySpecialCharacters) {
        printShuffledNumbers(arrayNum);
        printShuffledConsonants();
        printShuffledVowels();
        printShuffledSpecialCharacters(arraySpecialCharacters);
        Collections.shuffle(arrayNum);
    }

    private static void shuffleLists(List<Integer> arrayNum,
                                     Character[] arrayConsonants,
                                     Character[] arrayVowels,
                                     List<Character> arraySpecialCharacters) {
        shuffleArrayNum(arrayNum);
        shuffleRandomLetter(arrayConsonants, arrayVowels);
        shuffleSpecialChar(arraySpecialCharacters);
    }

    private static void shuffleSpecialChar(List<Character> arraySpecialCharacters) {
        Collections.shuffle(arraySpecialCharacters);
    }

    private static void shuffleArrayNum(List<Integer> arrayNum) {
        Collections.shuffle(arrayNum);
    }

    private static void shuffleRandomLetter(Character[] arrayConsonants, Character[] arrayVowels) {
        final Random random = new Random();
        final Predicate<Character> isLower = letter -> random.nextBoolean();
        final Predicate<Character> isUpper = letter -> random.nextBoolean();
        for (Character consonant: arrayConsonants) {
            if (isUpper.or(isLower).test(consonant)) {
                consonants.add(Character.toUpperCase(consonant));
            } else {
                consonants.add(Character.toLowerCase(consonant));
            }
        }
        for (Character vowel: arrayVowels) {
            if (isUpper.or(isLower).test(vowel)) {
                vowels.add(Character.toUpperCase(vowel));
            } else {
                vowels.add(Character.toLowerCase(vowel));
            }
        }
        shuffleRandomLetter();
    }

    private static void shuffleRandomLetter() {
        final Runnable shuffle = () -> {
            Collections.shuffle(consonants);
            Collections.shuffle(vowels);
        };
        shuffle.run();
    }


    private static void printShuffledNumbers(List<Integer> arrayNum) {
        System.out.print("Shuffled numbers: ");
        for (Integer number: arrayNum) {
            System.out.print(number);
        }
        System.out.println();
    }

    private static void printShuffledConsonants(){
        System.out.print("Shuffled consonants: ");
        for (Character consonant: consonants) {
            System.out.print(consonant);
        }
        System.out.println();
    }

    private static void printShuffledVowels() {
        System.out.print("Shuffled vowels: ");
        for (Character vowel: vowels) {
            System.out.print(vowel);
        }
        System.out.println();
    }

    private static void printShuffledSpecialCharacters(List<Character> arraySpecialCharacters) {
        System.out.print("Shuffled special characters: ");
        for (Character specialCharacter: arraySpecialCharacters) {
            System.out.print(specialCharacter);
        }
        System.out.println();
    }
}
