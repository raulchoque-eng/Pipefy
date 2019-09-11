package core.selenium;

import core.utils.ReadFile;

/**
 * WebDriverConfig class, read the data to use in our project.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public final class WebDriverConfig {

    private String nameBrowser;
    private int implicitWait;
    private int explicitWait;

    private static WebDriverConfig webDriverConfig;

    /**
     * Constructor of WebDriverConfig class.
     */
    private WebDriverConfig() {

        nameBrowser = ReadFile.getInstance().
                getProperty(ProjectProperties.BROWSER_NAME.getValue());
        implicitWait = Integer.parseInt(ReadFile.getInstance().
                getProperty(ProjectProperties.IMPLICIT_WAIT.getValue()));
        explicitWait = Integer.parseInt(ReadFile.getInstance().
                getProperty(ProjectProperties.EXPLICIT_WAIT.getValue()));
    }

    /**
     * Gets single instance of WebDriverConfig class.
     *
     * @return a WebDriverConfig object.
     */
    public static WebDriverConfig getInstance() {
        if (webDriverConfig == null) {
            webDriverConfig = new WebDriverConfig();
        }
        return webDriverConfig;
    }

    /**
     * Gets nameBrowser attribute of this class.
     *
     * @return as String the nameBrowser attribute of this class.
     */
    public String getNameBrowser() {
        return nameBrowser;
    }


    /**
     * Gets implicitWait attribute of its class.
     *
     * @return as int the implicitWait attribute.
     */
    public int getImplicitWait() {
        return implicitWait;
    }

    /**
     * Gets explicitWait attribute of its class.
     *
     * @return as int the explicitWait attribute.
     */
    public int getExplicitWait() {
        return explicitWait;
    }
}
