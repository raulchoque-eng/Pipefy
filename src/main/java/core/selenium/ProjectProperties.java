package core.selenium;

/**
 * ProjectProperties enum, create constants
 * to save name properties of project.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public enum ProjectProperties {

    BROWSER_NAME("browserName"),
    IMPLICIT_WAIT("implicitWait"),
    EXPLICIT_WAIT("explicitWait"),
    URL_LOGIN("loginPage"),
    URL_HOMEPAGE("homePage");

    private final String value;

    /**
     * Constructor of ProjectProperties enum.
     *
     * @param value value for create a ProjectProperties enum.
     */
    ProjectProperties(final String value) {
        this.value = value;
    }

    /**
     * gets value of value constant of this enum.
     *
     * @return as String value constant.
     */
    public String getValue() {
        return value;
    }
}
