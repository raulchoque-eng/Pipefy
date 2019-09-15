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
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

/**
 * Chrome class, creates instances of Chrome class.
 * for use the Chrome navigator.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public final class Chrome extends Browser {

    /**
     * Gets a WebDriver object for use Chrome browser.
     *
     * @return a  WebDriver object.
     */
    @Override
    public WebDriver getDriver() {
        if (existWebDriver(PathWebDriver.PATH_CHROME_DRIVER.getPathDriver())) {
            System.setProperty("webdriver.chrome.driver", PathWebDriver.PATH_CHROME_DRIVER.getPathDriver());
        } else {
            WebDriverManager.getInstance(CHROME).setup();
        }
        return new ChromeDriver();
    }
}
