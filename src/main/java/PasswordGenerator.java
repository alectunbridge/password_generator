import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public String generatePassword () {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input minimum password length: ");

        int minPassLength = scanner.nextInt();

        System.out.println("Input how many special characters: ");

        int characters = scanner.nextInt();

        System.out.println("Input how many numbers: ");

        int numbers = scanner.nextInt();


        return runner(minPassLength, characters, numbers);

    }


    public String runner ( int minPassLength, int numsOfSpecialCharacters, int numsOfNums ) {

        List<String> specialChar = new ArrayList<>();

        specialChar.add("$");
        specialChar.add("*");
        specialChar.add("#");
        specialChar.add("?");
        specialChar.add("!");

            Random random = new Random();
        String password = "";


        for (int i = 0; i < numsOfNums; i++) {
            int number = (int) (Math.random() * 8 + 1);

            password += number;

        }
        for (int i = 0; i < numsOfSpecialCharacters; i++) {
            String randomElement = specialChar.get(random.nextInt(specialChar.size()));

            password += randomElement;


        }

        List<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < minPassLength; i++) {
            for (char a = 'a'; a < 'z'; a++) {
                alphabet.add(a);

            }

            password += alphabet.get(random.nextInt(alphabet.size()));
        }


        return password;

    }

    public static void main ( String[] args ) {

        PasswordGenerator passwordGenerator = new PasswordGenerator();

        System.out.println(passwordGenerator.generatePassword());


    }

}
