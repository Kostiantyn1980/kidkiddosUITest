package Pages;

public class ContactUsPage extends BasePage {
    public static final String CONTACT_US_HEADER = "//h1[text()='Contact us']";
    public boolean isPageTitleVisisble(){
        return elementExists(CONTACT_US_HEADER);
    }
}
