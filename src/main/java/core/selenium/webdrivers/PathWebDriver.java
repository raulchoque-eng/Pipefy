package core.selenium.webdrivers;

/**
 * PathWebDriver enum, create constant
 * to save the path of webdriver.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public enum PathWebDriver {

    PATH_GECKO_DRIVER("src/main/java/core/selenium/webdrivers/driver/geckodriver"),
    PATH_CHROME_DRIVER("src/main/java/core/selenium/webdrivers/driver/chromedriver");

    private final String pathDriver;

    /**
     * Constructor of PathDriver enum.
     *
     * @param pathDriver value for create a PathWebDriver enum.
     */
    PathWebDriver(final String pathDriver) {
        this.pathDriver = pathDriver;
    }

    /**
     * Gets value of pathDriver constant of this enum.
     *
     * @return as String pathDrive constant.
     */
    public String getPathDriver() {
        return pathDriver;
    }
}
