package core.selenium.webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Firefox class, create single instance of Firefox class
 * for use the browser Firefox.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public final class Firefox implements Browser {

    private static Firefox firefox;
    private WebDriver driver;

    /**
     * Constructor of Firefox class.
     */
    private Firefox() {
        System.setProperty("webdriver.gecko.driver", PathWebDriver.PATH_GECKO_DRIVER.getPathDriver());
        this.driver = new FirefoxDriver();
    }

    /**
     * Gets single instance of Firefox class.
     *
     * @return a Firefox object.
     */
    public static Firefox getInstance() {
        if (firefox == null) {
            firefox = new Firefox();
        }
        return firefox;
    }

    /**
     * Gets WebDriver for use Firefox browser.
     *
     * @return a WebDriver object.
     */
    @Override
    public WebDriver getDriver() {
        return driver;
    }
}
