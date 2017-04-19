package featuretest.helper;

import featuretest.authentification.TestCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Андрей on 02.03.2017.
 */
public class PreconditionHelper {
    private static Logger logger = LoggerFactory.getLogger(PreconditionHelper.class);

    public static void execute(TestCase testCase) {
        logger.info("============ Precondition ===========================");
        logger.info("Precondition - executed for user : \n" + testCase.getLogin().getName());
    }
}
