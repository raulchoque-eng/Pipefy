package core.selenium.webdrivers;

import org.openqa.selenium.WebDriver;

/**
 * Browser interface, abstract behavior.
 * It promise will made in the future in its sub classes.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public interface Browser {

    /**
     * Gets a WebDriver object for use a browser.
     *
     * @return as WebDriver.
     */
    WebDriver getDriver();
}
