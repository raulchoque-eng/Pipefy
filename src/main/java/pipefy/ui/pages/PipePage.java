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
 * PipePage class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class PipePage extends BasePage {

    @FindBy(id = "pipe_placeholder")
    private WebElement cardPipeCont;

    @FindBy(id = "display-pipe-name")
    private WebElement namePipeTxt;

    /**
     * Wait until Page object was find for.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(cardPipeCont));
    }

    /**
     * Gets the name of pipe from PageObject PipePage.
     *
     * @return as string the name of pipe.
     */
    public String getNamePipe() {
        return namePipeTxt.getText();
    }
}
