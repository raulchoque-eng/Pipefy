package core.selenium.webdrivers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Chrome class, creates a single instance of Chrome class
 * for use the Chrome navigator.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public final class Chrome implements Browser {

    private static Chrome chrome;
    private WebDriver driver;

    /**
     * Constructor of Chrome class.
     */
    private Chrome() {
        System.setProperty("webdriver.chrome.driver", PathWebDriver.PATH_CHROME_DRIVER.getPathDriver());
        this.driver = new ChromeDriver();
    }

    /**
     * Gets single instance of Chrome class.
     *
     * @return a Chrome object.
     */
    public static Chrome getInstance() {
        if (chrome == null) {
            chrome = new Chrome();
        }
        return chrome;
    }

    /**
     * Gets a WebDriver object for use Chrome browser.
     *
     * @return a  WebDriver object.
     */
    @Override
    public WebDriver getDriver() {
        return driver;
    }
}
