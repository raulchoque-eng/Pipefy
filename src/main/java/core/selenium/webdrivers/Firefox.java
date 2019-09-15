/*
 * Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package core.selenium.webdrivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static io.github.bonigarcia.wdm.DriverManagerType.FIREFOX;

/**
 * Firefox class, create instances of Firefox class
 * for use the browser Firefox.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public final class Firefox extends Browser {

    /**
     * Gets WebDriver for use Firefox browser.
     *
     * @return a WebDriver object.
     */
    @Override
    public WebDriver getDriver() {
        if (existWebDriver(PathWebDriver.PATH_GECKO_DRIVER.getPathDriver())) {
            System.setProperty("webdriver.gecko.driver", PathWebDriver.PATH_GECKO_DRIVER.getPathDriver());
        } else {
            WebDriverManager.getInstance(FIREFOX).setup();
        }
        return new FirefoxDriver();
    }
}
