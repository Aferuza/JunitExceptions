package Junit_book;

import jdk.nashorn.internal.runtime.UserAccessorProperty;
import org.junit.Rule;
import org.junit.Test;

public class checkForExceptions {
    @Test(expected = InvalidPassword.class)
    public void expectInvalPasswExcep() throws InvalidPassword{
        User user =new User("username", "<5");

    }

//    @Rule

}
