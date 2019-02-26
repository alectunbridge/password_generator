import java.util.Random;

class CharacterGenerator {

    private Random random = new Random();

    private char alphaCharArray[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private char numberCharArray[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',};

    private char specialCharArray[] = {'£', '$', '!', '#', '@', '+', '-', '/', '*'};


    char randomIndexSelector(char[] array) {
        int max = array.length;

        int randomIndex = random.nextInt(max);
        return array[randomIndex];
    }

    char[] getAlphaCharArray() {
        return alphaCharArray;
    }

    char[] getNumberCharArray() {
        return numberCharArray;
    }

    char[] getSpecialCharArray() {
        return specialCharArray;
    }
}
