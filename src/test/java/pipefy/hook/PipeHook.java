package pipefy.hook;


import core.selenium.WebDriverManager;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import pipefy.entities.Context;
import pipefy.entities.Pipe;
import pipefy.entities.User;
import pipefy.ui.PageTransporter;
import pipefy.ui.pages.OrganizationPage;
import pipefy.ui.pages.PipePage;
import pipefy.ui.pages.PipeSettingPage;
import pipefy.ui.pages.WarningPage;

/**
 * PipeHook class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class PipeHook {

    private WebDriver driver;
    private User user;
    private Pipe pipe;

    /**
     * Constructor of PipeHook class.
     *
     * @param context use get objects.
     */
    public PipeHook(final Context context) {
        this.user = context.getUser();
        this.pipe = context.getPipe();
        driver = WebDriverManager.getInstance().getDriver();
    }

    /**
     * Tagger Hook to delete a pipe.
     */
    @After("@delete-pipe")
    public void deletePipe() {
        PageTransporter.navigateToURL("/organizations/" + user.getIdOrganization());
        OrganizationPage organizationPage = new OrganizationPage();
        PageTransporter.navigateToURL("/pipes/" + pipe.getId());
        PipePage pipePage = new PipePage();
        PipeSettingPage pipeSettingPage = pipePage.goSetting();
        WarningPage warningPage = pipeSettingPage.deletePipe();
        warningPage.deletePipe();
    }
}
