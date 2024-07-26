package AuthomatizationTest.authomatizationTest;

import AuthomatizationTest.authomatizationPage.AuthomatizationPage;
import AuthomatizationTest.authomatizationServise.AuthomatizationServise;
import org.testng.annotations.Test;

public class AuthomatizationTest {
    private final AuthomatizationServise authomatizationServise = new AuthomatizationServise();
    private final AuthomatizationPage authomatizationPage = new AuthomatizationPage();

    @Test
    public void forAuthomatizationTest() {
        authomatizationServise.openBaseUrl();
        authomatizationPage.getMenuButton();
        authomatizationPage.getSetButton();
        authomatizationPage.getChoose_Set();
        authomatizationPage.getOrderButton();
    }
}