import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordGeneratorTest {
    @Test
    public void checkSecretPassword () {
        String secretPassword = "";

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        assertThat(bCryptPasswordEncoder.matches(secretPassword,
                "$2a$10$N43LdqU9b1ZMuZM2KiBnIeaXiPqxYcTEVoMFabb9ZV2jfG82jupD6"))
                .isTrue();


    }

    @Test
    public void minLength4 () {
        PasswordGenerator passwordGenerator = new PasswordGenerator();

        String password = passwordGenerator.runner(4, 3, 7);
        assertThat(password.length()).isGreaterThanOrEqualTo(4);
    }

    @Test
    public void minLength20 () {
        PasswordGenerator passwordGenerator = new PasswordGenerator();

        String password = passwordGenerator.runner(20, 3, 7);
        assertThat(password.length()).isGreaterThanOrEqualTo(20);
    }

    @Test
    public void numberAmountHas7Nums () {
        PasswordGenerator passwordGenerator = new PasswordGenerator();

        String password = passwordGenerator.runner(20, 3, 7);

        int numberOfNumbers = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) > 48 & password.charAt(i) < 57) {

                numberOfNumbers += 1;
            }

        }
        assertThat(numberOfNumbers).isEqualTo(7);
    }
}
