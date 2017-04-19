package featuretest.authentification;

import featuretest.content.ChangePassword;
import featuretest.content.Login;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Epifanov on 12/14/2016.
 */
public class ChangePasswordTestCase extends TestCase {
    private static Logger logger = LoggerFactory.getLogger(ChangePasswordTestCase.class);

    private ChangePassword changePassword;
    private String errorPhraseKey;

    public ChangePasswordTestCase(ChangePassword changePassword) {
        this(changePassword, null);
    }

    public ChangePasswordTestCase(ChangePassword changePassword, String errorPhraseKey) {
        super(new Login("userChangePassword", "123"), true);
        this.changePassword = changePassword;
        this.errorPhraseKey = errorPhraseKey;
    }

    public ChangePassword getChangePassword() {
        return changePassword;
    }

    public String getErrorPhraseKey() {
        return errorPhraseKey;
    }

    @Step("Test Case")
    public void log() {
        super.log();
        logger.info("Change password fields = " + changePassword);
        if (errorPhraseKey != null)
            logger.info("Expected Error phrase (key) = " + errorPhraseKey);
    }
}
