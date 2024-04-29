package classwork11.user;

// Написать тесты для методов setEmail и setPassword.

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class UserTest {
    private String okEmail = "example@mail.com";
    private String wrongEmail = "examplemail.com";
    private String okPassword = "qwerty1234";
    private String wrongPassword = "qwerty";

    @Test
    public void testSetEmail() {
        User user = new User(okEmail, okPassword);
        Assertions.assertEquals(okEmail, user.getEmail());

        user = new User(wrongEmail, okPassword);
        Assertions.assertNull(user.getEmail());
    }

    @Test
    public void testSetPassword() {
        User user = new User(okEmail, okPassword);
        Assertions.assertEquals(okPassword, user.getPassword());

        user = new User(okEmail, wrongPassword);
        Assertions.assertNull(user.getPassword());
    }
}