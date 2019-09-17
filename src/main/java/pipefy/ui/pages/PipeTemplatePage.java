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

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pipefy.entities.Pipe;

/**
 * PipeTemplatePage class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class PipeTemplatePage extends BasePage {

    @FindBy(className = "pp-modals-body")
    private WebElement bodyTemplateCont;

    /**
     * Wait until Page object was find for.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(bodyTemplateCont));
    }

    /**
     * Selects a pipe template with the name of template.
     *
     * @param pipe value to select a pipe template.
     * @return PipePage as object.
     */
    public PipePage selectPipeTemplate(final Pipe pipe) {
        String locator = "//span[.= \"{template}\" and @class=\"pp-template-name\"]".
                replace("{template}", pipe.getName());
        WebElement element = driver.findElement(By.xpath(locator));
        element.click();
        PipePage pipePage =  new PipePage();
        String url = driver.getCurrentUrl();
        pipe.setId(url.substring(url.lastIndexOf('/') + 1));
        return pipePage;
    }
}
