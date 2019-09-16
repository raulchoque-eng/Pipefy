package pipefy.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * OrganizationPage class, create a PageObject of Organization page
 * to interact with the UI of that page.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class OrganizationPage extends BasePage {

    @FindBy(css = "h1.pp-header-nav-title.pp-align-center")
    private WebElement organizationTitleTxt;

    @FindBy(css = "div.pp-header-nav-actions")
    private WebElement logUserBtn;

    @FindBy(className = "pp-ico-plus")
    private WebElement addNewPipeBtn;

    /**
     * Wait until Page object was find for.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.elementToBeClickable(addNewPipeBtn));
    }

    /**
     * Gets the organization title of this PageObject.
     *
     * @return as string the title from its PageObject.
     */
    public String getOrganizationTitle() {
        String[] textTitle = organizationTitleTxt.getText().split(" ");
        return textTitle[0];
    }

    /**
     * Click in the new pipe button.
     *
     * @return PipeTemplatePage as object.
     */
    public PipeTemplatePage clickNewTemplate() {
        addNewPipeBtn.click();
        return new PipeTemplatePage();
    }
}
