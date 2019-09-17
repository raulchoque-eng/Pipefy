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

import core.selenium.utils.WebDriverMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * WarningPage class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class WarningPage extends BasePage {

    @FindBy(css = "div.pp-sweetalert.pp-active span.pp-emoji-warning")
    private WebElement warningImg;

    @FindBy(css = "form.js-swal-confirm b.pp-label-text span")
    private WebElement wordDeleteTxt;

    @FindBy(css = "form.js-swal-confirm input[type= 'text']")
    private WebElement confirmTxtField;

    @FindBy(css = ".js-swal-confirm .pp-btn-danger.pp-btn")
    private WebElement deleteBtn;


    /**
     * Wait until Page object was find for.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(warningImg));
    }

    /**
     * Deletes a pipe type a text of confirmation.
     */
    public void deletePipe() {
        WebDriverMethod.setTxtElement(confirmTxtField, wordDeleteTxt.getText());
        deleteBtn.click();
    }
}
