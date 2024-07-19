package test.authomatizationTest;

import test.authomatizationPage.AuthomatizationPage;
import test.authomatizationServise.AuthomatizationServise;
import org.testng.annotations.Test;

public class AuthomatizationTest {
    private final AuthomatizationServise authomatizationServise = new AuthomatizationServise();
    private final AuthomatizationPage authomatizationPage = new AuthomatizationPage();

    @Test
    public void forAuthomatizationTest() {
        authomatizationServise.openBaseUrl();
        authomatizationPage.getMenu_Button();
        authomatizationPage.getSet_Button();
        authomatizationPage.getChoose_Set();
        authomatizationPage.getOrder_Button();
    }
}