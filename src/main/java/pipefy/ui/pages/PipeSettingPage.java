/*
 * Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package pipefy.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * PipeSettingPage class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class PipeSettingPage extends BasePage {
    @FindBy(css = "input[name='name']")
    private WebElement namePipeTxt;

    @FindBy(css = "button.pp-btn-danger.pp-btn")
    private WebElement deleteBtn;

    /**
     * Wait until Page object was find for.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.invisibilityOf(namePipeTxt));
    }
}
