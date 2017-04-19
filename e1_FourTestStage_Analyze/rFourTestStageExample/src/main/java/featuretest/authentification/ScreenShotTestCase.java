package featuretest.authentification;

import featuretest.content.Login;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by aepifanov on 19.12.2016.
 */
public class ScreenShotTestCase extends TestCase {
    private Logger logger = LoggerFactory.getLogger(ScreenShotTestCase.class);

    private int width;
    private int heigth;

    public ScreenShotTestCase(Login login, boolean exists, int width, int heigth) {
        super(login, exists);
        this.width = width;
        this.heigth = heigth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }


    @Override
    public void log() {
        super.log();
        logger.info("Selenium Browser. Width = " + width);
        logger.info("Selenium Browser. Heigth = " + heigth);
    }
}
