package featuretest.authentification;

import featuretest.BaseTestCase;
import featuretest.content.Login;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by aepifanov on 18.11.2016.
 */
public class TestCase extends BaseTestCase{
    private static Logger logger = LoggerFactory.getLogger(TestCase.class);

    private final Login login;
    private Login webUILogin;
    private final boolean exists;
    private final String passwordDuringLogin;
    private final String errorMessage;

    public TestCase(Login login, boolean exists) {
        this.login = login;
        this.exists = exists;
        this.passwordDuringLogin = null; // equals from login
        this.errorMessage = null;
    }

    public TestCase(Login login, boolean exists, String passwordDuringLogin, String errorMessage) {
        this.login = login;
        this.exists = exists;
        this.passwordDuringLogin = passwordDuringLogin; // equals from login
        this.errorMessage = errorMessage;
    }

    public TestCase addWebUILogin(Login login) {
        this.webUILogin = login;
        return this;
    }

    public Login getLogin() {
        return login;
    }

    public boolean isExists() {
        return exists;
    }

    public String getPasswordDuringLogin() {
        return passwordDuringLogin;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public Login getWebUIRealLogin() {
        return webUILogin;
    }

    @Step("Test Case")
    public void log() {
        super.log();
        logger.info("TestCase.");
        logger.info("Login = " + login);
        logger.info("Exists is " + exists);
        if (passwordDuringLogin != null)
            logger.info("Password during login operation = " + passwordDuringLogin);
        if (webUILogin != null)
            logger.info("Real web ui login = " + webUILogin);
        if (errorMessage != null)
            logger.info("Expected error message = " + errorMessage);
    }


}
