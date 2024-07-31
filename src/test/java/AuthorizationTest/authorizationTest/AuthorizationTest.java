package AuthorizationTest.authorizationTest;

import AuthorizationTest.authorizationPage.AuthorizationPage;
import AuthorizationTest.authorizationService.AuthorizationService;
import org.testng.annotations.Test;

public class AuthorizationTest {
    private final AuthorizationService authorizationService = new AuthorizationService();
    private final AuthorizationPage authorizationPage = new AuthorizationPage();

    @Test
    public void forAuthorizationTest() {
        String telephoneNumber = "9867483424";
        String password = "94949697";

        authorizationService.openLoginUrl();
        authorizationPage.selectCiti();
        authorizationPage.enterTelephoneNumber(telephoneNumber);
        authorizationPage.enterPassword(password);
        authorizationPage.getEnterButton();
        authorizationPage.getOrderButton();
    }
}