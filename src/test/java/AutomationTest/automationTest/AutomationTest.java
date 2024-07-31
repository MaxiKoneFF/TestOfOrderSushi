package AutomationTest.automationTest;

import AutomationTest.automationPage.AutomationPage;
import AutomationTest.automationServise.AutomationService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationTest {
    private final AutomationService automationService = new AutomationService();
    private final AutomationPage automationPage = new AutomationPage();

    @BeforeTest
    public void openStartSite(){
        automationService.openBaseUrl();
    }
    @Test
    public void runningAutomationTest() {
        automationPage.pressMenuButton();
        automationPage.pressSetButton();
        automationPage.pressChooseSet();
        automationPage.pressOrderButton();
        automationPage.enterBasket();
        automationPage.pressDeleteButton();
    }
}